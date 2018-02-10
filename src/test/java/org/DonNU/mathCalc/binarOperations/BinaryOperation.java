package org.DonNU.mathCalc.binarOperations;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
 */

import org.DonNU.mathCalc.Function;

public class BinaryOperation extends Function {

    private Function lParameter;
    private Function rParameter;

    public Function getlParameter() {
        return lParameter;
    }

    public void setlParameter(Function lParameter) {
        this.lParameter = lParameter;
    }

    public Function getrParameter() {
        return rParameter;
    }

    public void setrParameter(Function rParameter) {
        this.rParameter = rParameter;
    }


    public double getValue() {
        try {
            throw new Exception("Not inited getValue()");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
