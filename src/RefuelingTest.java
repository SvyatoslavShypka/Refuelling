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

        // Test case 4
        int[] A4 = {7,3,3,5,4,1,9,9,5,5,6,4,1,8,5,8,1,6,1,8,7,8,1,10,8,6,8,7,2,7,7,2,9,6,4,4,
                10,6,9,3,7,3,4,10,6,5,6,4,9,6,9,1,9,1,7,7,4,1,9,1,7,6,10,3,2,1,9,6,8,3,2,8,4,
                3,8,10,9,9,10,10,4,9,7,2,7,10,7,2,1,1,4,9,2,3,7,2,10,8,9,2};
        int[] X4 = {11,16,19,20,30,31,35,44,49,54,62,71,79,82,85,89,92,99,105,112,122,125,133,
                143,148,157,167,172,176,183,193,195,198,199,209,210,212,217,218,225,235,239,242,
                248,256,262,265,272,274,283,287,289,293,294,301,308,316,320,321,330,333,337,341,
                349,354,361,370,376,381,386,396,403,408,413,414,417,423,425,427,432,442,445,450,
                459,467,472,474,484,490,493,498,505,513,521,527,531,535,537,542,546};
        int result4 = refueling.solution(A4, X4);
        System.out.println("Test case 4: " + result4); // prawidlowy wynik 87

//        Detected time complexity:
//        O(N**2) or O(N**2*log(N))
        
    }

}
