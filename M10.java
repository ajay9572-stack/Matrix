import java.util.Scanner;
// transpose of a matrix in a new matrix

public class M10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int[][] brr = new int[4][3];
        System.out.println("Enter 12 numbers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                brr[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}