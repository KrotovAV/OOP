import java.io.*;
import java.util.ArrayList;
// import java.util.Scanner;

public class readWhrite {

    public static void nameX() {
        System.out.println("readWhrite OK");
    }

    public static String[] readFile(String pathReadF) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(pathReadF));
        String str;
        int i = 0;
        String[] readArr = new String[2];
        while ((str = br.readLine()) != null) {
            readArr[i] = str;
            i = i + 1;
        }
        br.close();
        return readArr;
    }

    public static ArrayList<Worker> readWorkerFile(String pathReadF) throws Exception, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathReadF));
        ArrayList<Worker> worker = new ArrayList<>();
        try (objectInputStream) {
            while (true) {
                Object read = objectInputStream.readObject();
                if (read == null)
                    break;
                Worker workerRead = (Worker) read;
                worker.add(workerRead);
            }
        }
        catch (EOFException e) {
        }
        return worker;
    }

    public static void writeFile(double xF, String pathWriteF) {
        try (FileWriter fw = new FileWriter(pathWriteF, false)) {
            String resF = Double.toString (xF);
            fw.write(resF);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}