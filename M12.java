import java.util.Scanner;
// search in 2d matrix

public class M12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; 
        System.out.println("Enter target:");
        int target =  sc.nextInt();
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(search(arr, target));
    }
    // first do binary search to find target row
    static  boolean search(int[][] arr, int target){
        int stRow =0; 
        int endRow = arr.length-1;

        while (stRow <= endRow){
            int mid = stRow +( endRow - stRow)/2;

            if(target >= arr[mid][0]  && target <= arr[mid][arr[0].length-1] ){     // if target is in the row so now
                 int stcol = 0;                                                     //again perforn binary search to find target element 
                 int endcol = arr[0].length-1;

                 while(stcol<= endcol){
                    int midCol = stcol + (endcol - stcol)/2;

                     if (arr[mid][midCol] == target) {
                        return true;
                    }
                    else if (arr[mid][midCol] < target) {
                        stcol = midCol + 1;
                    }
                    else {
                        endcol = midCol - 1;
                    }
                return false;
                }
            }
            else if(target >= arr[mid][arr.length-1] ){         // if target is not in the row and target are 
                stRow = mid+1;                                  //greater than that row then go to next row
            }
            else{                                                // if less than then go to previous row
                endRow = mid -1;
            }
        }
        return  false;                                             // if cannot find row within the range(strow, endrow) then return false
    }
}
