//code by: Dileep

package Java_2Darray;
import java.util.*;
public class TwoDarray {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int[][] twoarr = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                 twoarr[i][j] = obj.nextInt();
            }
        }

        //output
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(twoarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
