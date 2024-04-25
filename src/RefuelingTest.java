package BugWars;

public class RefuelingTest{
    public static void main(String[] args) {
        Refueling_g2 refueling = new Refueling_g2();

        // Test case 1
        int[] A1 = {4, 1, 4, 3, 3};
        int[] X1 = {8, 10, 11, 13, 100};
        int result1 = refueling.solution(A1, X1);
        System.out.println("Test case 1: " + result1); // prawidlowy wynik 4

        // Test case 2
        int[] A2 = {0, 10, 0};
        int[] X2 = {1, 2, 3};
        int result2 = refueling.solution(A2, X2);
        System.out.println("Test case 2: " + result2); // prawidlowy wynik 3

        // Test case 3
        int[] A3 = {0, 1, 0, 1, 1, 1, 0};
        int[] X3 = {1, 2, 3, 4, 5, 6, 7};
        int result3 = refueling.solution(A3, X3);
        System.out.println("Test case 3: " + result3); // prawidlowy wynik 4
    }

}
