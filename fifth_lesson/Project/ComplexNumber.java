package fifth_lesson.Project;

public class ComplexNumber implements Actions <ComplexNumber> {
    double realNam;
    double imaginary;

    ComplexNumber() {
    }

    ComplexNumber(double tempRealNam, double tempImaginary) {
        realNam = tempRealNam;
        imaginary = tempImaginary;
    }

    public ComplexNumber addComp(ComplexNumber C1, ComplexNumber C2) {
        ComplexNumber temp = new ComplexNumber();
        temp.realNam = C1.realNam + C2.realNam;
        temp.imaginary = C1.imaginary + C2.imaginary;
        Write.writeFile("Complex " + String.valueOf(C1.realNam) + " + " + String.valueOf(C1.imaginary) + "i" + " + " +
                        "Complex " + String.valueOf(C2.realNam) + " + " + String.valueOf(C2.imaginary) + "i" + " = " + 
                        "Complex " + String.valueOf(temp.realNam) + " + " + String.valueOf(temp.imaginary) + "i");
        return temp;
    }

    public ComplexNumber subtractComp(ComplexNumber C1, ComplexNumber C2) {
        ComplexNumber temp = new ComplexNumber();
        temp.realNam = C1.realNam - C2.realNam;
        temp.imaginary = C1.imaginary - C2.imaginary;
        Write.writeFile("Complex " + String.valueOf(C1.realNam) + " + " + String.valueOf(C1.imaginary) + "i" + " - " +
                        "Complex " + String.valueOf(C2.realNam) + " + " + String.valueOf(C2.imaginary) + "i" + " = " + 
                        "Complex " + String.valueOf(temp.realNam) + " + " + String.valueOf(temp.imaginary) + "i");
        return temp;
    }

    public ComplexNumber multiplyComp(ComplexNumber C1, ComplexNumber C2) {
        ComplexNumber temp = new ComplexNumber();
        // z1∙z2 = (x1 + iy1)∙(x2 + iy2) = x1x2 + x1iy2 + iy1x2 + i2y1y2  = (x1x2 – y1y2) + i(x1y2 + y1x2)
        temp.realNam = C1.realNam * C2.realNam - C1.imaginary * C2.imaginary;
        temp.imaginary = C1.realNam * C2.imaginary + C2.realNam * C1.imaginary;
        Write.writeFile("Complex " + String.valueOf(C1.realNam) + " + " + String.valueOf(C1.imaginary) + "i" + " * " +
                        "Complex " + String.valueOf(C2.realNam) + " + " + String.valueOf(C2.imaginary) + "i" + " = " + 
                        "Complex " + String.valueOf(temp.realNam) + " + " + String.valueOf(temp.imaginary) + "i");
        return temp;
    }

    public ComplexNumber divideComp(ComplexNumber C1, ComplexNumber C2) {
        ComplexNumber temp = new ComplexNumber();
        temp.realNam = (C1.realNam * C2.realNam + C1.imaginary * C2.imaginary)/(C2.realNam * C2.realNam + C2.imaginary * C2.imaginary);
        temp.imaginary = (C1.imaginary * C2.realNam - C1.realNam * C2.imaginary)/(C2.realNam * C2.realNam + C2.imaginary * C2.imaginary);
        Write.writeFile("Complex " + String.valueOf(C1.realNam) + " + " + String.valueOf(C1.imaginary) + "i" + " / " +
                        "Complex " + String.valueOf(C2.realNam) + " + " + String.valueOf(C2.imaginary) + "i" + " = " + 
                        "Complex " + String.valueOf(temp.realNam) + " + " + String.valueOf(temp.imaginary) + "i");
        return temp;
    }

    public void print() {
        Write.writeFile("Complex " + String.valueOf(realNam) + " + " + String.valueOf(imaginary) + "i");
        System.out.println("Complex number: "
                           + realNam + " + "
                           + imaginary + "i");
    }
}