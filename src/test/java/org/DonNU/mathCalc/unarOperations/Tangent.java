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

public class Tangent extends UnaryOperation {

    private String className = this.getClass().getSimpleName();
    private double value;

    public Tangent() {
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public Function getDerivative() {
        //(tg(x))' = 1/cosine^2(x)
        Division division = new Division();
        division.setlParameter(new Const(1));
        Cosine cosine = new Cosine();
        cosine.setArgument(this.getArgument());
//        cosine.execute();
        Multiply multiplication = new Multiply();
        multiplication.setlParameter(cosine);
        multiplication.setrParameter(cosine);
//        multiplication.execute();
        division.setrParameter(multiplication);
//        division.execute();
        return division;
    }

    @Override
    public void execute() {
        DecimalFormat df = new DecimalFormat("#.##");
        double radians = Math.toRadians(this.getArgument().getValue());
        this.value = Double.valueOf(df.format(Math.tan(radians)));
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
