import java.util.ArrayList;

class Worker {
    int id;
    public int foolName;
    public int date;
    public int adres;
    public int jobTitle;
    public int accessLevel;
    public int workExperience;

    public Worker(int id, int foolName, int date, int adres, int jobTitle, int accessLevel, int workExperience) {
        this.id = id;
        this.foolName = foolName;
        this.date = date;
        this.adres = adres;
        this.jobTitle = jobTitle;
        this.accessLevel = accessLevel;
        this.workExperience = workExperience;
    }
}

class FoolName {
    int id;
    int firstName;
    int secondName;
    int surName;

    public FoolName(int id, int firstName, int secondName, int surName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surName = surName;
    }
}

class FirstName {
    int id;
    String firstName;
}

class FirstNameBase {
    int count = 1;

    public FirstName getFirstName(String name) {
        FirstName fn = new FirstName();
        fn.id = count++;
        fn.firstName = name;
        return fn;
    }
}

class SecondName {
    int id;
    String secondName;
}

class SecondNameBase {
    int count = 1;

    public SecondName getSecondName(String name) {
        SecondName sn = new SecondName();
        sn.id = count++;
        sn.secondName = name;
        return sn;
    }
}

class SurName {
    int id;
    String surName;
}

class SurNameBase {
    int count = 1;

    public SurName getSurName(String name) {
        SurName sun = new SurName();
        sun.id = count++;
        sun.surName = name;
        return sun;
    }
}

class BirthDate {
    int id;
    int day;
    int month;
    int year;

    public BirthDate(int id, int day, int month, int year) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Year {
    int id;
    String year;
}

class YearBase {
    int count = 1;

    public Year getYear(String name) {
        Year y = new Year();
        y.id = count++;
        y.year = name;
        return y;
    }
}

class Month {
    int id;
    String month;
}

class MonthBase {
    int count = 1;

    public Month getMonth(String name) {
        Month m = new Month();
        m.id = count++;
        m.month = name;
        return m;
    }
}

class Day {
    int id;
    String day;
}

class DayBase {
    int count = 1;

    public Day getDay(String name) {
        Day d = new Day();
        d.id = count++;
        d.day = name;
        return d;
    }
}

class Adress {
    int id;
    int town;
    int street;
    int house;
    int apartment;

    public Adress(int id, int town, int street, int house, int apartment) {
        this.id = id;
        this.town = town;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
}

class Town {
    int id;
    String town;
}

class TownBase {
    int count = 1;

    public Town getTown(String name) {
        Town t = new Town();
        t.id = count++;
        t.town = name;
        return t;
    }
}

class Street {
    int id;
    String street;
}

class StreetBase {
    int count = 1;

    public Street getStreet(String name) {
        Street s = new Street();
        s.id = count++;
        s.street = name;
        return s;
    }
}

class House {
    int id;
    String house;
}

class HouseBase {
    int count = 1;

    public House getHouse(String name) {
        House h = new House();
        h.id = count++;
        h.house = name;
        return h;
    }
}

class Apartment {
    int id;
    String apartment;
}

class ApartmentBase {
    int count = 1;

    public Apartment getApartment(String name) {
        Apartment ap = new Apartment();
        ap.id = count++;
        ap.apartment = name;
        return ap;
    }
}

class JobTitle {
    int id;
    String name;

    public JobTitle(int id, String jobTitle) {
        this.id = id;
        this.name = jobTitle;
    }
}

class AccessLevel {
    int id;
    String name;

    public AccessLevel(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class WorkExperience {
    int id;
    String name;

    public WorkExperience(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Db {
    ArrayList<Worker> worker = new ArrayList<>();

    ArrayList<FoolName> fN = new ArrayList<>();
    ArrayList<FirstName> fn = new ArrayList<>();
    ArrayList<SecondName> sn = new ArrayList<>();
    ArrayList<SurName> sun = new ArrayList<>();

    ArrayList<BirthDate> bd = new ArrayList<>();
    ArrayList<Year> y = new ArrayList<>();
    ArrayList<Month> m = new ArrayList<>();
    ArrayList<Day> d = new ArrayList<>();

    ArrayList<Adress> a = new ArrayList<>();
    ArrayList<Town> t = new ArrayList<>();
    ArrayList<Street> s = new ArrayList<>();
    ArrayList<House> h = new ArrayList<>();
    ArrayList<Apartment> ap = new ArrayList<>();

    ArrayList<JobTitle> j = new ArrayList<>();
    ArrayList<AccessLevel> al = new ArrayList<>();
    ArrayList<WorkExperience> w = new ArrayList<>();

    public void addFirstName(FirstName firstName) {
        fn.add(firstName);
    }

    public void addSecondName(SecondName secondName) {
        sn.add(secondName);
    }

    public void addSurName(SurName surName) {
        sun.add(surName);
    }

    public void addYear(Year year) {
        y.add(year);
    }

    public void addMonth(Month month) {
        m.add(month);
    }

    public void addDay(Day day) {
        d.add(day);
    }

    public void addTown(Town town) {
        t.add(town);
    }

    public void addStreet(Street street) {
        s.add(street);
    }

    public void addHouse(House house) {
        h.add(house);
    }

    public void addApartment(Apartment apartment) {
        ap.add(apartment);
    }

    public void addJobTitle(JobTitle jobTitle) {
        j.add(jobTitle);
    }

    public void addAccessLevel(AccessLevel accessLevel) {
        al.add(accessLevel);
    }

    public void addWorkExperience(WorkExperience workExperience) {
        w.add(workExperience);
    }
}

class Structure {
    public Structure() {
        init();
    }

    public Db getDb() {
        return db;
    }

    public String[] getWorkerInfo() {
        // System.out.println(db.worker.size());
        String[] arr = new String[db.worker.size()];
        for (int i = 0; i < db.worker.size(); i++) {
            // System.out.println(i);
            Worker c = db.worker.get(i);

            arr[i] = String.format("%d |%s | %s| %s| %s| %s| %s|",
                    c.id,
                    getFoolNameInfo(c.foolName - 1),
                    getBirthDateInfo(c.date - 1),
                    getAdressInfo(c.adres - 1),
                    db.j.get(c.jobTitle - 1).name,
                    db.al.get(c.accessLevel - 1).name,
                    db.w.get(c.workExperience - 1).name);
            // System.out.println(arr[i]);
        }
        // System.out.println();
        return arr;
    }

    public String[] getFirstNameInfo() {
        String[] arr = new String[db.fn.size()];
        for (int i = 0; i < db.fn.size(); i++) {
            FirstName nfn = db.fn.get(i);
            arr[i] = String.format("%d |%s |",
                    nfn.id,
                    db.fn.get(nfn.id - 1).firstName);
        }
        return arr;
    }

    public String[] getSecondNameInfo() {
        String[] arr = new String[db.sn.size()];
        for (int i = 0; i < db.sn.size(); i++) {
            SecondName nsn = db.sn.get(i);
            arr[i] = String.format("%d |%s |",
                    nsn.id,
                    db.sn.get(nsn.id - 1).secondName);
        }
        return arr;
    }

    public String[] getSurNameInfo() {
        String[] arr = new String[db.sun.size()];
        for (int i = 0; i < db.sun.size(); i++) {
            SecondName nsun = db.sn.get(i);
            arr[i] = String.format("%d |%s |",
                    nsun.id,
                    db.sun.get(nsun.id - 1).surName);
        }
        return arr;
    }

    public String[] getDayInfo() {
        String[] arr = new String[db.d.size()];
        for (int i = 0; i < db.d.size(); i++) {
            Day nd = db.d.get(i);
            arr[i] = String.format("%d |%s |",
                    nd.id,
                    db.d.get(nd.id - 1).day);
        }
        return arr;
    }

    public String[] getMonthInfo() {
        String[] arr = new String[db.m.size()];
        for (int i = 0; i < db.m.size(); i++) {
            Month nm = db.m.get(i);
            arr[i] = String.format("%d |%s |",
                    nm.id,
                    db.m.get(nm.id - 1).month);
        }
        return arr;
    }

    public String[] getYearInfo() {
        String[] arr = new String[db.y.size()];
        for (int i = 0; i < db.y.size(); i++) {
            Year ny = db.y.get(i);
            arr[i] = String.format("%d |%s |",
                    ny.id,
                    db.y.get(ny.id - 1).year);
        }
        return arr;
    }

    public String[] getTownInfo() {
        String[] arr = new String[db.t.size()];
        for (int i = 0; i < db.t.size(); i++) {
            Town nt = db.t.get(i);
            arr[i] = String.format("%d |%s |",
                    nt.id,
                    db.t.get(nt.id - 1).town);
        }
        return arr;
    }

    public String[] getStreetInfo() {
        String[] arr = new String[db.s.size()];
        for (int i = 0; i < db.s.size(); i++) {
            Street ns = db.s.get(i);
            arr[i] = String.format("%d |%s |",
                    ns.id,
                    db.s.get(ns.id - 1).street);
        }
        return arr;
    }

    public String[] getHouseInfo() {
        String[] arr = new String[db.h.size()];
        for (int i = 0; i < db.s.size(); i++) {
            House nh = db.h.get(i);
            arr[i] = String.format("%d |%s |",
                    nh.id,
                    db.h.get(nh.id - 1).house);
        }
        return arr;
    }

    public String[] getApartmentInfo() {
        String[] arr = new String[db.ap.size()];
        for (int i = 0; i < db.ap.size(); i++) {
            Apartment nap = db.ap.get(i);
            arr[i] = String.format("%d |%s |",
                    nap.id,
                    db.ap.get(nap.id - 1).apartment);
        }
        return arr;
    }

    public String[] getJobTitleInfo() {
        String[] arr = new String[db.j.size()];
        for (int i = 0; i < db.j.size(); i++) {
            JobTitle nj = db.j.get(i);
            arr[i] = String.format("%d |%s |",
                    nj.id,
                    db.j.get(nj.id - 1).name);
        }
        return arr;
    }
    public String[] getAccessLevelInfo() {
        String[] arr = new String[db.al.size()];
        for (int i = 0; i < db.al.size(); i++) {
            AccessLevel nal = db.al.get(i);
            arr[i] = String.format("%d |%s |",
                    nal.id,
                    db.al.get(nal.id - 1).name);
        }
        return arr;
    }
    public String[] getWorkExperienceInfo() {
        String[] arr = new String[db.w.size()];
        for (int i = 0; i < db.w.size(); i++) {
            WorkExperience nw = db.w.get(i);
            arr[i] = String.format("%d |%s |",
            nw.id,
            db.al.get(nw.id - 1).name);
        }
        return arr;
    }
    
    public String[] getFoolNameInfoS() {
        String[] arr = new String[db.fN.size()];
        for (int i = 0; i < db.fN.size(); i++) {
            FoolName nfN = db.fN.get(i);
            arr[i] = String.format("%d |%s |%s |%s |",
            nfN.id,
            db.fN.get(nfN.id - 1).firstName,
            db.fN.get(nfN.id - 1).secondName,
            db.fN.get(nfN.id - 1).surName);
        }
        return arr;
    }
    public String[] getBirthDateInfoS() {
        String[] arr = new String[db.bd.size()];
        for (int i = 0; i < db.bd.size(); i++) {
            BirthDate nbd = db.bd.get(i);
            arr[i] = String.format("%d |%s |%s |%s |",

            nbd.id,
            db.bd.get(nbd.id - 1).day,
            db.bd.get(nbd.id - 1).month,
            db.bd.get(nbd.id - 1).year);
        }
        return arr;
    }
    public String[] getAdressInfoS() {
        String[] arr = new String[db.a.size()];
        for (int i = 0; i < db.a.size(); i++) {
            Adress na = db.a.get(i);
            arr[i] = String.format("%d |%s |%s |%s |%d |",

            na.id,
            db.a.get(na.id - 1).town,
            db.a.get(na.id - 1).street,
            db.a.get(na.id - 1).house,
            db.a.get(na.id - 1).apartment);
        }
        return arr;
    }
    //------------------------------------------------

    public String getAllInfo(int idWorker) {
        Worker c = db.worker.get(idWorker - 1);
        return String.format("%d |%s | %s| %s| %s| %s| %s|",
                c.id,
                getFoolNameInfo(c.foolName - 1),
                getBirthDateInfo(c.date - 1),
                getAdressInfo(c.adres - 1),
                db.j.get(c.jobTitle - 1).name,
                db.al.get(c.accessLevel - 1).name,
                db.w.get(c.workExperience - 1).name);
    }
    public String getFoolNameInfo(int idName) {
        FoolName n = db.fN.get(idName);
        return String.format("%s %s %s",
                // return String.format("%d %s %s %s",
                // n.id,
                db.fn.get(n.firstName - 1).firstName,
                db.sn.get(n.secondName - 1).secondName,
                db.sun.get(n.surName - 1).surName);
    }
    public String getBirthDateInfo(int idDate) {
        BirthDate da = db.bd.get(idDate);
        // return String.format("%d %s %s %s",
        return String.format(" %s %s %s",
                // da.id,
                db.d.get(da.day - 1).day,
                db.m.get(da.month - 1).month,
                db.y.get(da.year - 1).year);
    }
    public String getAdressInfo(int idAdress) {
        Adress ad = db.a.get(idAdress);
        // return String.format("%d %s %s %s %s",
        return String.format("г.%s, ул.%s, д.%s, кв.%s",
                // ad.id,
                db.t.get(ad.town - 1).town,
                db.s.get(ad.street - 1).street,
                db.h.get(ad.house - 1).house,
                db.ap.get(ad.apartment - 1).apartment);
    }

    public void delitehWorker(int n) {
        db.worker.remove(n - 1);
    }

    public void searchWorker(String text) {
        boolean check = true;
        Input scanner = new Input();
        String text1 = "", text2 = "";
        // ArrayList<Worker> workers = new ArrayList<>();
        while (check) {
            text1 = scanner.inputString(text);
            if (text1.equals("e"))
                check = false;
            else {
                ArrayList<Worker> workers = new ArrayList<>();
                if (text1.equals("n")) {
                    text2 = scanner.inputString("Write name");
                    for (Worker c : db.worker) {
                        if (getFoolNameInfo(c.foolName - 1).toLowerCase().indexOf(text2.toLowerCase()) != -1) {
                            workers.add(c);
                        }
                    }
                }
                if (text1.equals("bd")) {
                    text2 = scanner.inputString("Write birth date");
                    for (Worker c : db.worker) {
                        if (getBirthDateInfo(c.date - 1).toLowerCase().indexOf(text2.toLowerCase()) != -1) {
                            workers.add(c);
                        }
                    }
                }
                if (text1.equals("a")) {
                    text2 = scanner.inputString("Write adres");
                    for (Worker c : db.worker) {
                        if (getAdressInfo(c.adres - 1).toLowerCase().indexOf(text2.toLowerCase()) != -1) {
                            workers.add(c);
                        }
                    }
                }
                if (text1.equals("j")) {
                    text2 = scanner.inputString("Write job title");
                    for (Worker c : db.worker) {
                        if (db.j.get(c.jobTitle - 1).name.toLowerCase().indexOf(text2.toLowerCase()) != -1) {
                            workers.add(c);
                        }
                    }
                }
                if (text1.equals("al")) {
                    text2 = scanner.inputString("Write access level");
                    for (Worker c : db.worker) {
                        if (db.al.get(c.accessLevel - 1).name.toLowerCase().indexOf(text2.toLowerCase()) != -1) {
                            workers.add(c);
                        }
                    }
                }
                if (text1.equals("we")) {
                    text2 = scanner.inputString("Write work experience");
                    for (Worker c : db.worker) {
                        if (db.w.get(c.workExperience - 1).name.toLowerCase().indexOf(text2.toLowerCase()) != -1) {
                            workers.add(c);
                        }
                    }
                }
                if (workers.size() == 0)
                    System.out.println("Nofing found");
                else {
                    System.out.println("Found the following: ");
                    for (Worker c : workers) {
                        System.out.println(getAllInfo(c.id));
                    }
                }
                System.out.println();

            }
        }
    }

    Db db;

    Db init() {
        db = new Db();
        // Worker(int id, int foolName ,
        // int date, int adres, int jobTitle, int accessLevel, int workExperience)
        Worker w1 = new Worker(1, 1, 1, 1, 4, 2, 1);
        Worker w2 = new Worker(2, 2, 2, 2, 3, 1, 2);
        Worker w3 = new Worker(3, 3, 3, 3, 2, 3, 3);
        Worker w4 = new Worker(4, 4, 4, 4, 1, 4, 4);
        Worker w5 = new Worker(5, 5, 5, 5, 1, 5, 5);
        // ---------------------------------------------------------------------------------------
        FoolName fN1 = new FoolName(1, 1, 1, 1);
        FoolName fN2 = new FoolName(2, 2, 3, 2);
        FoolName fN3 = new FoolName(3, 1, 2, 3);
        FoolName fN4 = new FoolName(4, 3, 4, 4);
        FoolName fN5 = new FoolName(5, 5, 5, 5);

        db.fN.add(fN1);
        db.fN.add(fN2);
        db.fN.add(fN3);
        db.fN.add(fN4);
        db.fN.add(fN5);

        FirstNameBase fn = new FirstNameBase();
        db.addFirstName(fn.getFirstName("Петp"));
        db.addFirstName(fn.getFirstName("Олег"));
        db.addFirstName(fn.getFirstName("Евгений"));
        db.addFirstName(fn.getFirstName("Борис"));
        db.addFirstName(fn.getFirstName("Михаил"));

        SecondNameBase sn = new SecondNameBase();
        db.addSecondName(sn.getSecondName("Александрович"));
        db.addSecondName(sn.getSecondName("Олегович"));
        db.addSecondName(sn.getSecondName("Борисович"));
        db.addSecondName(sn.getSecondName("Павлович"));
        db.addSecondName(sn.getSecondName("Петрович"));

        SurNameBase sun = new SurNameBase();
        db.addSurName(sun.getSurName("Иванов"));
        db.addSurName(sun.getSurName("Петров"));
        db.addSurName(sun.getSurName("Сидоров"));
        db.addSurName(sun.getSurName("Васечкин"));
        db.addSurName(sun.getSurName("Гречкин"));
        // --------------------------------------------------------------------------------------
        BirthDate bd1 = new BirthDate(1, 1, 1, 1);
        BirthDate bd2 = new BirthDate(2, 2, 3, 2);
        BirthDate bd3 = new BirthDate(3, 1, 2, 3);
        BirthDate bd4 = new BirthDate(4, 3, 4, 4);
        BirthDate bd5 = new BirthDate(5, 1, 2, 3);

        YearBase y = new YearBase();
        db.addYear(y.getYear("1981"));
        db.addYear(y.getYear("1999"));
        db.addYear(y.getYear("2003"));
        db.addYear(y.getYear("2001"));
        db.addYear(y.getYear("1992"));

        MonthBase m = new MonthBase();
        db.addMonth(m.getMonth("Января"));
        db.addMonth(m.getMonth("Февраля"));
        db.addMonth(m.getMonth("Марта"));
        db.addMonth(m.getMonth("Апреля"));
        db.addMonth(m.getMonth("Июня"));

        DayBase d = new DayBase();
        db.addDay(d.getDay("1"));
        db.addDay(d.getDay("2"));
        db.addDay(d.getDay("3"));
        db.addDay(d.getDay("4"));
        db.addDay(d.getDay("5"));
        // --------------------------------------
        Adress ad1 = new Adress(1, 1, 1, 1, 1);
        Adress ad2 = new Adress(2, 1, 2, 2, 2);
        Adress ad3 = new Adress(3, 1, 3, 3, 3);
        Adress ad4 = new Adress(4, 1, 2, 3, 4);
        Adress ad5 = new Adress(5, 2, 4, 4, 5);

        TownBase t = new TownBase();
        db.addTown(t.getTown("Минск"));
        db.addTown(t.getTown("Минск"));
        db.addTown(t.getTown("Минск"));
        db.addTown(t.getTown("Минск"));
        db.addTown(t.getTown("Брест"));

        StreetBase s = new StreetBase();
        db.addStreet(s.getStreet("Янтарная"));
        db.addStreet(s.getStreet("Вишневая"));
        db.addStreet(s.getStreet("Солнечная"));
        db.addStreet(s.getStreet("Тенистая"));
        db.addStreet(s.getStreet("Речная"));

        HouseBase h = new HouseBase();
        db.addHouse(h.getHouse("25"));
        db.addHouse(h.getHouse("17"));
        db.addHouse(h.getHouse("34"));
        db.addHouse(h.getHouse("2"));
        db.addHouse(h.getHouse("33"));

        ApartmentBase ap = new ApartmentBase();
        db.addApartment(ap.getApartment("5"));
        db.addApartment(ap.getApartment("25"));
        db.addApartment(ap.getApartment("48"));
        db.addApartment(ap.getApartment("4"));
        db.addApartment(ap.getApartment("33"));
        // ------------------------------------------------------------
        db.j.add(new JobTitle(1, "Главный бухгалтер"));
        db.j.add(new JobTitle(2, "Водиель"));
        db.j.add(new JobTitle(3, "Менеджер"));
        db.j.add(new JobTitle(4, "Повар"));
        db.j.add(new JobTitle(5, "Директор"));

        db.al.add(new AccessLevel(1, "1 ур. доступа"));
        db.al.add(new AccessLevel(2, "2 ур. доступа"));
        db.al.add(new AccessLevel(3, "3 ур. доступа"));
        db.al.add(new AccessLevel(4, "4 ур. доступа"));
        db.al.add(new AccessLevel(5, "5 ур. доступа"));

        db.w.add(new WorkExperience(1, "1 лет"));
        db.w.add(new WorkExperience(2, "2 лет"));
        db.w.add(new WorkExperience(3, "3 лет"));
        db.w.add(new WorkExperience(4, "4 лет"));
        db.w.add(new WorkExperience(5, "5 лет"));
        // ------------------------------------------------------------
        db.worker.add(w1);
        db.worker.add(w2);
        db.worker.add(w3);
        db.worker.add(w4);
        db.worker.add(w5);

        db.bd.add(bd1);
        db.bd.add(bd2);
        db.bd.add(bd3);
        db.bd.add(bd4);
        db.bd.add(bd5);

        db.a.add(ad1);
        db.a.add(ad2);
        db.a.add(ad3);
        db.a.add(ad4);
        db.a.add(ad5);

        return db;
    }

}