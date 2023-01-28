package fifth_lesson.Project;

public class IntegerNumber implements Actions <IntegerNumber> {

    int intNam;

        IntegerNumber() {
    }

    IntegerNumber(int tempIntNam) {
        intNam = tempIntNam;
    }

    public double convertIntegerNumberToDouble(IntegerNumber I1) {
        double temp = (double) I1.intNam;
        return temp;
    }

    public IntegerNumber addComp(IntegerNumber I1, IntegerNumber I2) {
        IntegerNumber temp = new IntegerNumber();
        temp.intNam = I1.intNam + I2.intNam;
        Write.writeFile("Integer " + String.valueOf(I1.intNam) + " + " + 
                        "Integer " + String.valueOf(I2.intNam) + " = " + 
                        "Integer " + String.valueOf(temp.intNam));
        return temp;
    }

    public IntegerNumber subtractComp(IntegerNumber I1, IntegerNumber I2) {
        IntegerNumber temp = new IntegerNumber();
        temp.intNam = I1.intNam - I2.intNam;
        Write.writeFile("Integer " + String.valueOf(I1.intNam) + " - " + 
                        "Integer " + String.valueOf(I2.intNam) + " = " + 
                        "Integer " + String.valueOf(temp.intNam));
        return temp;
    }

    public IntegerNumber multiplyComp(IntegerNumber I1, IntegerNumber I2) {
        IntegerNumber temp = new IntegerNumber();
        temp.intNam = I1.intNam * I2.intNam;
        Write.writeFile("Integer " + String.valueOf(I1.intNam) + " * " + 
                        "Integer " + String.valueOf(I2.intNam) + " = " + 
                        "Integer " + String.valueOf(temp.intNam));
        return temp;
    }

    public IntegerNumber divideComp(IntegerNumber I1, IntegerNumber I2) {
        IntegerNumber temp = new IntegerNumber();
        if (I2.intNam == 0)  System.exit (1);
        temp.intNam = I1.intNam / I2.intNam;
        Write.writeFile("Integer " + String.valueOf(I1.intNam) + " / " +
                        "Integer " + String.valueOf(I2.intNam) + " = " + 
                        "Integer " + String.valueOf(temp.intNam));
        return temp;
    }


    public void print() {
        Write.writeFile("Integer " + String.valueOf(intNam));
        System.out.println("Integer Namber: "
                                + intNam );
    }
}
