package org.DonNU.mathCalc;

import org.DonNU.mathCalc.binarOperations.Addition;
import org.DonNU.mathCalc.binarOperations.Multiply;

import java.util.UUID;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

public class Polynom extends Function {

    private String className = this.getClass().getSimpleName();
    private double value;
    private Function argument;
    private Function coefficientOne;
    private Function coefficientTwo;
    private Function coefficientThree;

    public void setValue(double value) {
        this.value = value;
    }

    public Function getArgument() {
        return argument;
    }

    public void setArgument(Function argument) {
        this.argument = argument;
    }

    public void setCoefficientOne(Function coefficientOne) {
        this.coefficientOne = coefficientOne;
    }

    public void setCoefficientTwo(Function coefficientTwo) {
        this.coefficientTwo = coefficientTwo;
    }

    public void setCoefficientThree(Function coefficientThree) {
        this.coefficientThree = coefficientThree;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void execute() {
        Multiply multiply = new Multiply();
        multiply.setlParameter(argument);
        multiply.setrParameter(argument);
        multiply.execute();

        Multiply mul_first = new Multiply();
        mul_first.setlParameter(coefficientOne);
        mul_first.setrParameter(multiply);
        mul_first.execute();

        Multiply mul_middle = new Multiply();
        mul_middle.setlParameter(coefficientTwo);
        mul_middle.setrParameter(argument);
        mul_middle.execute();

        Addition addition_first_two = new Addition();
        addition_first_two.setlParameter(mul_first);
        addition_first_two.setrParameter(mul_middle);
        addition_first_two.execute();

        Addition addition_pol = new Addition();
        addition_pol.setlParameter(addition_first_two);
        addition_pol.setrParameter(coefficientThree);
        addition_pol.execute();

        this.value = addition_pol.getValue();
    }

    @Override
    public String toString() {
        return this.className + "(" + coefficientOne.getValue() + "*x^2 + " + coefficientTwo.getValue() + "*x + " + coefficientThree.getValue() + ") where x = " + this.getArgument().getValue() + " = " + this.value;
    }

    public void resultToXML() {
        String random = UUID.randomUUID().toString();
        XmlSaver.resultToXML(className + "_" + random, this.toString());
    }
}
