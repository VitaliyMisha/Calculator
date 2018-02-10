package org.DonNU.mathCalc.unarOperations;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

import org.DonNU.mathCalc.Const;
import org.DonNU.mathCalc.Function;
import org.DonNU.mathCalc.XmlSaver;
import org.DonNU.mathCalc.binarOperations.Division;
import org.DonNU.mathCalc.binarOperations.Multiply;

import java.text.DecimalFormat;
import java.util.UUID;

public class Cotangent extends UnaryOperation {

    private String className = this.getClass().getSimpleName();
    private double value;

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public Function getDerivative() {
        Division division = new Division();
        division.setlParameter(new Const(-1));
        Sine sine = new Sine();
        sine.setArgument(this.getArgument());
        Multiply multiplication = new Multiply();
        multiplication.setlParameter(sine);
        multiplication.setrParameter(sine);
        division.setrParameter(multiplication);
        return division;
    }

    @Override
    public void execute() {
        DecimalFormat df = new DecimalFormat("#.##");
        double radians = Math.toRadians(this.getArgument().getValue());
        this.value = Double.valueOf(df.format((1 / Math.tan(radians))));
    }

    @Override
    public String toString() {
        return this.className + "(" + this.getArgument().toString() + ")";
    }

    public String getDerivativeToString() {
        return "Derivative of " + this.className + "(" + this.getArgument().toString() + ") = " + this.getDerivative().toString();
    }

    public void resultToXML() {
        String random = UUID.randomUUID().toString();
        XmlSaver.resultToXML(className + "_" + random, this.toString());
    }
}
