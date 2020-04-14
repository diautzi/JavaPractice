package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // Create a for statement using a range of numbers from 1 to 1000 inclusive.
        //Sum all the numbers that can be divided with both 3 and also with 5.
        //For those numbers that met the above conditions, print out the number.
        //break out of the loop once you find 5 numbers that met the above conditions.
        //After breaking out of the loop print the sum of the numbers that met the above conditions.
        //Note: Type all code in main method

        int count = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++) {
            if (i % 3 == 0)  {
                if (i % 5 == 0) {
                    count++;
                    sum += i;
                    System.out.println("Found number = " + i);
                    if(count == 5) {
                        break;
                    }
                }
            }
        }
        System.out.println("Sum = " + sum);
    }

    ///////////////////Tim's solution -> cleaner //////////////

//        int count = 0;
//        int sum = 0;
//
//        for(int i=1; i <= 1000; i++) {
//             if ((i % 3 == 0) && (i % 5 == 0)) {
//               count++;
//               sum += i;
//              System.out.println("Found number = " + i);
//             }
//
//             if(count == 5) {
//                 break;
//             }
//         }
//        System.out.println("Sum = " + sum);
//        }
}
