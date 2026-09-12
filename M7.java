import java.util.Scanner;
//row wise printing     same as starting two three code

public class M7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i = 0; i <arr.length; i++){
            for(int j =0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
              System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}