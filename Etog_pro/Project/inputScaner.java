package Project;


import java.util.Scanner;


public class inputScaner {
    Scanner iScanner;

    public int inputInt(String text)
    {
        while (true) {
            System.out.println(text);
            iScanner = new Scanner(System.in);
            try
            {
                int result = iScanner.nextInt();
                return result;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void scanerClose(){
        iScanner.close();
    }
}