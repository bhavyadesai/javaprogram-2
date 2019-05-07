package com.stackroute.pe2;

public class isevennumber {
    public static int isEven(int number)
    {

        if (number > 0) {
        number = number % 4;
        if (number == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

        return number;
}
}
