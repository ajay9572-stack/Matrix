import java.util.Scanner;
// sum of row element of 2D array

public class M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for(int i = 0; i<arr.length;i++){
            int sum = 0;
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
             System.out.println(sum);
        }  
    }
}
