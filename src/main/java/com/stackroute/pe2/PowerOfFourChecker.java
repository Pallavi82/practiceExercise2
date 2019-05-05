package com.stackroute.pe2;

import static java.lang.Math.log;

public class PowerOfFourChecker {

    public String checkForPowerOfFour(int num) {


        if (((int) Math.ceil((log(num)) / (log(4)))) == (int) Math.floor((log(num)) / (log(4)))) {
            return "Num is power of 4";
        } else
            return "Num is not a power of 4";

    }
}
