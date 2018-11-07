package com.gmail.wizaripost;

public class LearningSEls26 {
    public static void main(String[] args) {




        String g = "abcdxyz";

        String c = new StringBuffer(g).reverse().toString();
       System.out.println(c);


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 44, 256};

        for (int i = arr.length - 1; i >= 0; i--) {
            int x = arr[i];
            System.out.print(x + " ");
        }
        /* Проверил что на Sring работает*/
        {
            String[] barr = {"21", "22", "23", "24", "25", "26", "27", "28", "29", "210", "211", "244", "2256"};
            System.out.println("\n");
            for (int i = barr.length - 1; i >= 0; i--) {
                String x = barr[i];
                System.out.print(x + " ");
            }
        }

    }
}
