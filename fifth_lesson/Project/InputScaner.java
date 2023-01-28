package fifth_lesson.Project;

import java.util.Scanner;

class Input {
    Scanner iScanner;

    public String inputString(String text)
    {
        while (true) {
            System.out.println(text);
            iScanner = new Scanner(System.in, "Cp866");
            try
            {
                String result = iScanner.nextLine();
                // String result = iScanner.next();
                return result;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    public int inputInt(String text)
    {
        while (true) {
            System.out.println(text);
            iScanner = new Scanner(System.in, "Cp866");
            try
            {
                int nam;
                try {
                nam = Integer.parseInt(iScanner.next());
                return nam;
                }
                catch (NumberFormatException e) {
                System.out.println("Write integer namber!");
                }
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

