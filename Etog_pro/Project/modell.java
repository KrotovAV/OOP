package Project;

public class modell {
    public static int[] createArr(int nF) {
        int[] newArrF = new int[nF];
        return newArrF;
    }
    public static int[] fillRandomArr(int[] arrF, int nF, int startF, int endF) {
        for (int i = 0; i < nF; i++) {
            arrF[i] = (int) (Math.random() * ((endF - startF) + 1)) + startF;
        }
        return arrF;
    }

    public static int[] sum3Elenent(int[] arrF, int nF) {
        int[] newArrF = modell.createArr(nF-2);
        for (int i = 0; i < nF - 2; i++) {
            newArrF[i] = arrF[i] + arrF[i + 1] + arrF[i + 2];
        }
        return newArrF;
    }

}
