package org.DonNU.mathCalc.unarOperations;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

import org.DonNU.mathCalc.Argument;
import org.DonNU.mathCalc.Function;

public class UnaryOperation extends Function {
    private Argument argument;

    public Argument getArgument() {
        return this.argument;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }


    public double getValue() {
        return this.argument.getValue();
    }
}