import java.util.Scanner;
//rotate by 90 degree

public class M11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; 
        int temp;
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
     // first transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse every row
        for (int i = 0; i < arr.length; i++){
            int startcol = 0 , endcol = arr[0].length-1;
            while (startcol< endcol) {
                 temp = arr[i][startcol];
                arr[i][startcol] = arr[i][endcol];
                arr[i][endcol] = temp;
                startcol++;
                endcol--;
            } 
        }
        // this is for printing
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
