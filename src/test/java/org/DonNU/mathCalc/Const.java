package org.DonNU.mathCalc;

import java.util.UUID;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

public class Const extends Function {

    private String className = this.getClass().getSimpleName();
    private double value;

    public double getValue() {
        return this.value;
    }

    public Const(double value) {
        this.value = value;
    }

    @Override
    public Function getDerivative() {
        return new Const(0);
    }

    @Override
    public String toString() {
        return "" + this.value;
    }

    public void resultToXML() {
        String random = UUID.randomUUID().toString();
        XmlSaver.resultToXML(className + "_" + random, this.toString());
    }
}
