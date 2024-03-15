public class Exam2 {
    public static void main(String[] args) {

        int hight = 3;


        for (int i = 1; i <= hight; i++) {
            for (int j = hight-i; j >= 0; j--) {
                System.out.print(" ");
            }
                for (int a = 1; a <= i * 2 - 1; a++) {
                    System.out.print("*");
                }
            System.out.print("\n");
        }


        // 높이 : 3

        /*

           *
          ***
         *****

         */

        // 높이 : 5

        // 출력

        /*

         *
         ***
         *****
         *******
         *********

         */

        // 높이 : 7

        // 출력

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */

    }
}