import org.DonNU.mathCalc.Argument;
import org.DonNU.mathCalc.Const;
import org.DonNU.mathCalc.Polynom;
import org.DonNU.mathCalc.binarOperations.Addition;
import org.DonNU.mathCalc.binarOperations.Subtraction;
import org.DonNU.mathCalc.unarOperations.Cosine;
import org.DonNU.mathCalc.unarOperations.Cotangent;
import org.DonNU.mathCalc.unarOperations.Sine;
import org.DonNU.mathCalc.unarOperations.Tangent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* @author name - Vitaliy Misha
      gmail - Vitaliy.Misha@gmail.com
      donnu email - misha.v@donnu.edu.ua
      skype - vitaliymisha
*/

public class Run {

    private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {


        Addition addition1 = new Addition();
        addition1.setlParameter(new Const(2));
        addition1.setrParameter(new Const(4));
        addition1.execute();
        LOGGER.info(addition1.toString() + " = " + addition1.getValue());
        addition1.resultToXML();

        Addition addition2 = new Addition();
        Cosine cosine = new Cosine();
        cosine.setArgument(new Argument(new Const(180)));
        cosine.execute();

        addition2.setlParameter(cosine);
        addition2.setrParameter(new Const(12));
        addition2.execute();
        LOGGER.info(addition2.toString() + " = " + addition2.getValue());
        addition2.resultToXML();

        Cosine cosine2 = new Cosine();
        cosine2.setArgument(new Argument(new Const(90)));//0
        cosine2.execute();

        Cosine cosine3 = new Cosine();
        cosine3.setArgument(new Argument(new Const(cosine2.getValue())));
        cosine3.execute();

        Addition addition3 = new Addition();
        addition3.setlParameter(cosine3);
        addition3.setrParameter(new Const(5));
        addition3.execute();
        LOGGER.info(addition3.toString() + " = " + addition3.getValue());
        addition3.resultToXML();

        Subtraction subtraction1 = new Subtraction();
        subtraction1.setlParameter(new Const(5));
        subtraction1.setrParameter(new Const(3));
        subtraction1.execute();
        LOGGER.info(subtraction1.toString() + " = " + subtraction1.getValue());
        subtraction1.resultToXML();

        Const constanta = new Const(5);
        LOGGER.info("Derivative of " + constanta.getValue() + " is " + constanta.getDerivative());
        constanta.resultToXML();

        Cosine cosine4 = new Cosine();
        cosine4.setArgument(new Argument(new Const(90)));
        LOGGER.info(cosine4.getDerivativeToString());
        cosine4.resultToXML();

        Sine sine1 = new Sine();
        sine1.setArgument(new Argument(new Const(180)));
        LOGGER.info(sine1.getDerivativeToString());
        sine1.resultToXML();

        Tangent tangent = new Tangent();
        tangent.setArgument(new Argument(new Const(180)));
        LOGGER.info(tangent.getDerivativeToString());
        tangent.resultToXML();

        Cotangent cotangent = new Cotangent();
        cotangent.setArgument(new Argument(new Const(90)));
        LOGGER.info(cotangent.getDerivativeToString());
        cotangent.resultToXML();

        Polynom pol = new Polynom();
        pol.setArgument(new Const(2));
        pol.setCoefficientOne(new Const(1));
        pol.setCoefficientTwo(new Const(6));
        pol.setCoefficientThree(new Const(3));
        pol.execute();
        LOGGER.info(pol.toString());
        pol.resultToXML();
    }
}
