package com.stackroute.pe2;

public class powerof4 {
    public int TestPowerOfFour(int num) {

        int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
         return 1;
    }
}// if (num > 0) {
           // num = num % 4;
            //if (num == 0) {
              //  return 1;
            //}

            // if(num%4!=0){
            //return 1;
            //else {
                //return 0;
                //num=num/4;
            //}
        //}

        //return num;


