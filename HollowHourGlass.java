public class HollowHourGlass {
 
    public static void main(String args[]) {
             int n = 5;

        for (int i = 0; i < 2 * n - 1; i++) {

            int comp;
            if (i < n) {
                comp = 2 * (n - i) - 1;      
            } else {
                comp = 2 * (i - n + 1) - 1;  
            }

         
            for (int j = 0; j < (2 * n - 1 - comp)/2; j++) {
                System.out.print(" ");
            }

            
            for (int k = 0; k < comp; k++) {
                if (k == 0 || k == comp - 1 || i == 0 || i == 2 * n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }


}
