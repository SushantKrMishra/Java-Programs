public class testArray1{
        int array1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int array2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum1[][] = new int[3][3];
    public void sum(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                    sum1[i][j] = array1[i][j] + array2[i][j];
                
            }
        }
        System.out.println("Matrix after addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum1[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        testArray1 a1 = new testArray1();
        a1.sum();
    }

}
