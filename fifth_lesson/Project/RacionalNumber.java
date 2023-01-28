package fifth_lesson.Project;

public class RacionalNumber implements Actions <RacionalNumber>{
    byte fool;
    int num, denom;
 
    RacionalNumber() {
    }

    RacionalNumber(byte tempFool, int tempNum, int tempDenom) {
        fool = tempFool;
        num = tempNum;
        denom = tempDenom;
    }
    RacionalNumber(int tempNum, int tempDenom) {
        fool = 0;
        num = tempNum;
        denom = tempDenom;
    }

    public int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    public int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
    public RacionalNumber simplificate (RacionalNumber Ra){
        if (Ra.num > Ra.denom) {
            Ra.fool = (byte) (Ra.num % Ra.denom + Ra.fool);
            Ra.num  = Ra.num % Ra.denom;
        }
        int commondivisor = 1;
        for (int i=2;i<= Math.min(Math.abs(Ra.num), Math.abs(Ra.denom));i++) {
            if( Ra.num%i == 0 && Ra.denom%i == 0 ) {
                commondivisor = i;
                Ra.num /= commondivisor;
                Ra.denom /= commondivisor;
            }
        }
        return Ra;
    }

    public RacionalNumber addComp(RacionalNumber Ra1, RacionalNumber Ra2) {
        RacionalNumber temp = new RacionalNumber();
        temp.fool = (byte) (Ra1.fool * Ra2.fool);
        temp.num = Ra1.num * Ra2.denom + Ra2.num * Ra1.denom;
        temp.denom = Ra1.denom * Ra2.denom;
        Write.writeFile("Racional " + String.valueOf(Ra1.fool) + " " + String.valueOf(Ra1.num) + "/" + String.valueOf(Ra1.denom) + " + " +
                        "Racional " + String.valueOf(Ra2.fool) + " " + String.valueOf(Ra2.num) + "/" + String.valueOf(Ra2.denom) + " = " + 
                        "Racional " + String.valueOf(temp.fool) + " " + String.valueOf(temp.num) + "/" + String.valueOf(temp.denom));
        return temp.simplificate(temp);
    }

    public RacionalNumber subtractComp(RacionalNumber Ra1, RacionalNumber Ra2) {
        RacionalNumber temp = new RacionalNumber();
        temp.fool = (byte) (Ra1.fool - Ra2.fool);
        temp.num = Ra1.num * Ra2.denom - Ra2.num * Ra1.denom;
        temp.denom = Ra1.denom * Ra2.denom;
        Write.writeFile("Racional " + String.valueOf(Ra1.fool) + " " + String.valueOf(Ra1.num) + "/" + String.valueOf(Ra1.denom) + " - " +
                        "Racional " + String.valueOf(Ra2.fool) + " " + String.valueOf(Ra2.num) + "/" + String.valueOf(Ra2.denom) + " = " + 
                        "Racional " + String.valueOf(temp.fool) + " " + String.valueOf(temp.num) + "/" + String.valueOf(temp.denom));
        return temp.simplificate(temp);
    }

    public RacionalNumber multiplyComp(RacionalNumber Ra1, RacionalNumber Ra2) {
        RacionalNumber temp = new RacionalNumber();
        temp.fool = (byte) (Ra1.fool * Ra2.fool);
        temp.num = Ra1.num * Ra2.num;
        temp.denom = Ra1.denom * Ra2.denom;
        Write.writeFile("Racional " + String.valueOf(Ra1.fool) + " " + String.valueOf(Ra1.num) + "/" + String.valueOf(Ra1.denom) + " * " +
                        "Racional " + String.valueOf(Ra2.fool) + " " + String.valueOf(Ra2.num) + "/" + String.valueOf(Ra2.denom) + " = " + 
                        "Racional " + String.valueOf(temp.fool) + " " + String.valueOf(temp.num) + "/" + String.valueOf(temp.denom));
        return temp.simplificate(temp);
    }

    public RacionalNumber divideComp(RacionalNumber Ra1, RacionalNumber Ra2) {
        RacionalNumber temp = new RacionalNumber();

        Ra1.num = Ra1.fool * Ra1.denom + Ra1.num;
        Ra2.num = Ra2.fool * Ra2.denom + Ra2.num;

        temp.fool = 0;
        temp.num = Ra1.num * Ra2.denom;
        temp.denom = Ra1.denom * Ra2.num;

        Write.writeFile("Racional " + String.valueOf(Ra1.fool) + " " + String.valueOf(Ra1.num) + "/" + String.valueOf(Ra1.denom) + " / " +
                        "Racional " + String.valueOf(Ra2.fool) + " " + String.valueOf(Ra2.num) + "/" + String.valueOf(Ra2.denom) + " = " + 
                        "Racional " + String.valueOf(temp.fool) + " " + String.valueOf(temp.num) + "/" + String.valueOf(temp.denom));
        return temp.simplificate(temp);
    }

    public void print() {
        Write.writeFile("Racional " + String.valueOf(fool) + " " + String.valueOf(num) + "/" + String.valueOf(denom));
        System.out.println("Racional number: "
                           + fool + " "
                           + Math.abs(num) + "/"
                           + denom);
    }
}
