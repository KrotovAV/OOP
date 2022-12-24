import java.util.Date;

public class Programm {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Workers worker = new Workers(10, "dfgпарапрdfg", new Date(), "ул. Лизы Чайкиной3",
        "инженер","пользователь", 2);
        dataBase.addWorker(worker);


        Company company = new Company(dataBase.getLists());
        company.printWorkers();


    }  
    
}
