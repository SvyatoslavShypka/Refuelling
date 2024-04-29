class Refueling_g2 {


    int[][] fuel;

    void fuelChange(int i, int j, int fuelWas, int distance, int fuelNew)
    {
        if(fuelWas >= distance){
            fuel[i][j] = Math.max(fuel[i][j], fuelWas - distance + fuelNew);
        }
    }
    // int [] X cities |X[J] - X [K]| w oparciu o dane z tablicy obliczamy ile potrzebujemy paliwa dla naszej trasy.
    // int [] A ilosc paliwa w kazdym z miast
    public int solution(int[] A, int[] X) {
        int maxCities = 1; // maksymalna liczba roznych miast, ktore mozemy odwiedzic ustawiamy na 1 bo zawsze min. 1 odwiedzimy
        int n = A.length;

        fuel = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                fuel[i][j] = -1; //zapisujemy -1 na wszystkich miejscach oprocz elementow po przekatnej
            fuel[i][i] = A[i]; //na przekatnej zapisujemy ilosci paliwa dostepne w kazdym miescie
        }
        for (int i = n - 2; i >= 0; i--){
            for (int j = i + 1; j < n; j++){
                // dla kazdej pary i, j uruchamiamy metode aktualizujaca ilosc paliwa potrzebnego do przejechania trasy
                fuelChange(j, i, fuel[j][i + 1], X[i + 1] - X[i], A[i]);
                fuelChange(j, i, fuel[i + 1][j], X[j] - X[i], A[i]);
                fuelChange(i, j, fuel[i][j - 1], X[j] - X[j - 1], A[j]);
                fuelChange(i, j, fuel[j - 1][i], X[j] - X[i], A[j]);

//               Czy istnieje możliwość podróży między miastami i i j (czy starczy paliwa)?
                if(fuel[i][j] >= 0 || fuel[j][i] >= 0)
                    maxCities = Math.max(maxCities, j - i + 1); // ilość odwiedzonych miast plus miasto z którego wyszliśmy
            }
        }
        return maxCities;
    }
}
