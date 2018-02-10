package org.DonNU.mathCalc;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

public class Argument extends Function {
    private Function argument;

    public Argument(Function value) {
        this.argument = value;
    }

    @Override
    public String toString() {
        return "x";
    }


    public double getValue() {
        return this.argument.getValue();
    }

}
