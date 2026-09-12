import java.util.Scanner;
//column wise printing

public class M6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int j = 0; j<arr[0].length; j++){
            for(int i =0; i<arr.length;i++){
                arr[i][j] = sc.nextInt();
              System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}