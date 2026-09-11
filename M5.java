import java.util.Scanner;
// sum of column element of 2D array

public class M5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for(int j = 0; j<arr[0].length;j++){   
            int sum = 0;
             for(int i = 0; i<arr.length;i++){
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];    
            }
             System.out.println(sum);
        }  
    }
}
