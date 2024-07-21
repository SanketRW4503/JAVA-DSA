//      *
//     **
//    ***
//   ****
//  *****


public class RightPyramid {
    public static void main(String[] args) {
        
        int max=5;
        for (int i = 0; i < max; i++) {
            for(int j=i;j<max;j++){
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
