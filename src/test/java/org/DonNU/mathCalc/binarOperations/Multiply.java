package org.DonNU.mathCalc.binarOperations;

import org.DonNU.mathCalc.XmlSaver;

import java.util.UUID;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

public class Multiply extends BinaryOperation {
    private String className = this.getClass().getSimpleName();
    private double value;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void execute() {
        this.value = this.getlParameter().getValue() * this.getrParameter().getValue();
    }

    @Override
    public String toString() {
        return this.className + "( " + this.getlParameter().toString() + " * " + this.getrParameter().toString() + " )";// = " + String.valueOf(this.value);
    }

    public void resultToXML() {
        String random = UUID.randomUUID().toString();
        XmlSaver.resultToXML(className + "_" + random, this.toString());
    }
}