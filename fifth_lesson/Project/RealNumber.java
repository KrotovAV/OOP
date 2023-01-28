package fifth_lesson.Project;

public class RealNumber implements Actions <RealNumber> {
        double realNam; 

        RealNumber() {
    }

    RealNumber(double tempRealNam) {
        realNam = tempRealNam;
    }


    public RealNumber addComp(RealNumber I1, RealNumber I2) {
        RealNumber temp = new RealNumber();
        temp.realNam = I1.realNam + I2.realNam;
        Write.writeFile("Real " + String.valueOf(I1.realNam) + " + " +
                        "Real " + String.valueOf(I2.realNam) + " = " + 
                        "Real " + String.valueOf(temp.realNam));
        return temp; 
    }

    public RealNumber subtractComp(RealNumber I1, RealNumber I2) {
        RealNumber temp = new RealNumber();
        temp.realNam = I1.realNam - I2.realNam;
        Write.writeFile("Real " + String.valueOf(I1.realNam) + " - " +
                        "Real " + String.valueOf(I2.realNam) + " = " + 
                        "Real " + String.valueOf(temp.realNam));
        return temp;
    }

    public RealNumber multiplyComp(RealNumber I1, RealNumber I2) {
        RealNumber temp = new RealNumber();
        temp.realNam = I1.realNam * I2.realNam;
        Write.writeFile("Real " + String.valueOf(I1.realNam) + " * " +
                        "Real " + String.valueOf(I2.realNam) + " = " + 
                        "Real " + String.valueOf(temp.realNam));
        return temp;
    }

    public RealNumber divideComp(RealNumber I1, RealNumber I2) {
        RealNumber temp = new RealNumber();
        if (I2.realNam == 0)  System.exit (1);
        temp.realNam = I1.realNam / I2.realNam;
        Write.writeFile("Real " + String.valueOf(I1.realNam) + " / " +
                        "Real " + String.valueOf(I2.realNam) + " = " + 
                        "Real " + String.valueOf(temp.realNam));
        return temp;
    }

    public void print() {
        Write.writeFile("Real " + String.valueOf(realNam));
        System.out.println("Real Namber: "
                            + realNam );
    }
}
