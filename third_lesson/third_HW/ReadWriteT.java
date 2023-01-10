import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ReadWriteT {

    public static ArrayList<String> readFile(String pathReadF) throws Exception {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(pathReadF, StandardCharsets.UTF_8));
        ArrayList<String> lines = new ArrayList<String>();
        while((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();
        return lines;
    }
    
    public static void whriteFile(String pathWriteF, String id, String name) throws Exception {
        String resF = id + "," + name + "\n" ;
        try {
            FileWriter writer = new FileWriter(pathWriteF, StandardCharsets.UTF_8, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(resF);
            bw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void deliteString(String pathWriteF, String id, String name) throws Exception {
        ArrayList<CarstvoT> prods = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(pathWriteF, StandardCharsets.UTF_8));
        String str, nameCarstvo;
        String idCarstvo;
        while ((str = br.readLine()) != null) {
            String[] words = str.split(",");
            idCarstvo = words[0];
            nameCarstvo = words[1];
            if (!(idCarstvo.equals(id)) | !(nameCarstvo.equals(name))) {
                prods.add(new CarstvoT(idCarstvo, nameCarstvo));
            }
        }
        br.close();
        try {
            FileWriter writer = new FileWriter(pathWriteF, StandardCharsets.UTF_8, false);
            // FileWriter writer = new FileWriter(pathWriteF, StandardCharsets.UTF_8, true);
            BufferedWriter bw = new BufferedWriter(writer);
            for (CarstvoT carstvo : prods) {
                bw.write(carstvo.getIdCarstvo() + "," + carstvo.getNameCarstvo() + "\n");
            }
            bw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
