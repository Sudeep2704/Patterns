public class Pyramid {
 
    public static void main(String args[]) {

        int n = 5;
        int count = 0;
            for(int i = 0; i < n; i++) {
                            for(int j = 0; j < n-i-1; j++) {
                                    System.out.print(" ");
                                    count++;
                            }
                                for(int k = 0; k < 2 * i + 1; k++) {
                                        System.out.print("*");
                                }
                                    System.out.println(" ");
            }

            System.out.print(count);

    }

}
