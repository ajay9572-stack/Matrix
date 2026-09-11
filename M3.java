import java.util.Scanner;
// sum of all element of 2D array

public class M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[][] = new int[3][4];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
