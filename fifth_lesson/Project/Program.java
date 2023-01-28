package fifth_lesson.Project;

public class Program {

    public static void main(String[] args)  {

        ComplexNumber C1 = new ComplexNumber(7, -4);
        C1.print();

        ComplexNumber C2 = new ComplexNumber(3, 2);
        C2.print();

        ComplexNumber C3 = new ComplexNumber();
        C3 = C3.addComp(C1, C2);
        C3.print();

        C3 = C3.subtractComp(C1, C2);
        C3.print();

        C3 = C3.multiplyComp(C1, C2);
        C3.print();

        C3 = C3.divideComp(C1, C2);
        C3.print();

        // --------------------------------------------------------------
        IntegerNumber I1 = new IntegerNumber(3);
        I1.print();
        IntegerNumber I2 = new IntegerNumber(2);
        I2.print();

        IntegerNumber I3 = new IntegerNumber();
        I3 = I3.addComp(I1, I2);
        I3.print();

        IntegerNumber I4 = new IntegerNumber();
        I4 = I4.subtractComp(I1, I2);
        I4.print();

        IntegerNumber I5 = new IntegerNumber();
        I5 =  I5.multiplyComp(I1, I2);
        I5.print();

        RealNumber I6 = new RealNumber();
        // RealNumber I12 = new RealNumber(I1.convertIntegerNumberToDouble(I1));
        // RealNumber I22 = new RealNumber(I2.convertIntegerNumberToDouble(I2));

        I6 = I6.divideComp(new RealNumber(I1.convertIntegerNumberToDouble(I1)), new RealNumber(I2.convertIntegerNumberToDouble(I2)));
        // I6 = I6.divideComp(I12, I22);
        // I6 = I6.divideComp(I1, I2);
        I6.print();

        // --------------------------------------------------------------
        RealNumber R1 = new RealNumber(3.5);
        RealNumber R2 = new RealNumber(2.2);
        R1.print();
        R2.print();

        RealNumber R3 = new RealNumber();
        R3 = R3.addComp(R1, R2);
        R3.print();

        RealNumber R4 = new RealNumber();
        R4 = R4.subtractComp(R1, R2);
        R4.print();

        RealNumber R5 = new RealNumber();
        R5 = R5.multiplyComp(R1, R2);
        R5.print();

        RealNumber R6 = new RealNumber();
        R6 = R6.divideComp(R1, R2);
        R6.print();

        //------------------------------------
        RacionalNumber Ra1 = new RacionalNumber((byte) -2,1,23);
        Ra1.print();
        RacionalNumber Ra2 = new RacionalNumber((byte) 15, 3,4);
        Ra2.print();

        RacionalNumber Ra3 = new RacionalNumber();
        Ra3 = Ra3.addComp(Ra1, Ra2);
        Ra3.print();

        RacionalNumber Ra4 = new RacionalNumber();
        Ra4 = Ra4.subtractComp(Ra1, Ra2);
        Ra4.print();

        RacionalNumber Ra5 = new RacionalNumber();
        Ra5 = Ra5.multiplyComp(Ra1, Ra2);
        Ra5.print();

        RacionalNumber Ra6 = new RacionalNumber();
        Ra6 = Ra6.divideComp(Ra1, Ra2);
        Ra6.print();


    }
}