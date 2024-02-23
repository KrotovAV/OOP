import Project.view;

public class controller {
    
    public static void run() throws Exception{
        // view.printEmrty();
        Structure structure = new Structure();

        String searchMenu = "To find worker by:\n| n - fool name | bd - birth date | a - adres | j - job title | al - access level | we - work experience | e - exit |";
        String menu = "|w - worker|fn - first name |sn - second Name|sun - sure Name| d - day | m - month| y -  year|\n t - town|s - street| h - house| ap - apartment| j - jobTitle| al - accessLevel| we - workExperience|\n bd - birth date| fn - fool name| a - adres| e - exit |";
        String showMenu = "To show: \n" + menu;
        String mainMenu = "Select a command and write the letter: ";
        String deliteMenu = "To delite: | № - id worker | e - exit |";
        String addMenu = "To add: \n" + menu;
        boolean check = true;
        Input nInt = new Input();
        String l, n;
        Input nInt2 = new Input();
        int nam;
        while(check){
            view.printEmrty();
            view.mainMenu();
            l = nInt.inputString(mainMenu);
            if(l.equals("e")) check = false;
            else {
                if (l.equals("s")) {
                    n = nInt.inputString(showMenu);
                    if(n.equals("e")) check = false;
                    else {
                        if(n.equals("w")) view.printArrString(structure.getWorkerInfo());
                        else if (n.equals("fn")) view.printArrString(structure.getFirstNameInfo());
                        else if (n.equals("sn")) view.printArrString(structure.getSecondNameInfo());
                        else if (n.equals("sun")) view.printArrString(structure.getSurNameInfo());
                        else if (n.equals("d")) view.printArrString(structure.getDayInfo());
                        else if (n.equals("m")) view.printArrString(structure.getMonthInfo());
                        else if (n.equals("y")) view.printArrString(structure.getYearInfo());
                        else if (n.equals("t")) view.printArrString(structure.getTownInfo());
                        else if (n.equals("s")) view.printArrString(structure.getStreetInfo());
                        else if (n.equals("h")) view.printArrString(structure.getHouseInfo());
                        else if (n.equals("ap")) view.printArrString(structure.getApartmentInfo());
                        else if (n.equals("j")) view.printArrString(structure.getJobTitleInfo());
                        else if (n.equals("al")) view.printArrString(structure.getAccessLevelInfo());
                        else if (n.equals("we")) view.printArrString(structure.getWorkExperienceInfo());
                        else if (n.equals("bd")) view.printArrString(structure.getBirthDateInfoS());
                        // else if (n.equals("bd")) view.printArrString(structure.getBirthDateInfoS());
                        else if (n.equals("a")) view.printArrString(structure.getAdressInfoS());
                        // else if (n.equals("a")) view.printArrString(structure.getAdressInfoS());
                        else if (n.equals("fn")) view.printArrString(structure.getFoolNameInfoS());
                        // else if (n.equals("fn")) view.printArrString(structure.getFoolNameInfoS());
                        else {view.textReturn("Wrong command!");}
                    }
                } else if (l.equals("f")) {
                    structure.searchWorker(view.textReturn(searchMenu));
                } else if (l.equals("d")) {
                    structure.searchWorker(view.textReturn(searchMenu));
                    n = nInt.inputString(deliteMenu);
                    if(n.equals("e")) check = false;
                    else {
                        structure.delitehWorker(Integer.parseInt(n));
                        view.printArrString(structure.getWorkerInfo());
                    }
                } else if (l.equals("a")) {
                    // structure.searchWorker(view.textReturn(searchMenu));
                    n = nInt.inputString(addMenu);
                    if(n.equals("e")) check = false;
                    else {
                        if(n.equals("w")) {
                            int nid = structure.db.worker.size() + 1;
                            int nfN = nInt2.inputInt("Write fool name N");
                            int nd = nInt2.inputInt("Write date N");
                            int na = nInt2.inputInt("Write adres N");
                            int nj = nInt2.inputInt("Write joob title N");
                            int nal = nInt2.inputInt("Write joob title N");
                            int we = nInt2.inputInt("Write acces level name");
                            Worker nw = new Worker(nid, nfN, nd, na, nj, nal, we);
                            structure.db.worker.add(nw);
                        }
                            else if(n.equals("fn")) {
                            FirstName nfn = new FirstName();
                            nfn.id = structure.db.fn.size() + 1;
                            nfn.firstName = nInt.inputString("Write first name");;
                            structure.db.addFirstName(nfn);
                        } else if(n.equals("sn")) {
                            SecondName nsn = new SecondName();
                            nsn.id = structure.db.sn.size() + 1;
                            nsn.secondName = nInt.inputString("Write second name");;
                            structure.db.addSecondName(nsn);
                        } else if(n.equals("sun")) {
                            SurName nsun = new SurName();
                            nsun.id = structure.db.sun.size() + 1;
                            nsun.surName = nInt.inputString("Write sur name");;
                            structure.db.addSurName(nsun);
                        } else if(n.equals("d")) {
                            Day nd = new Day();
                            nd.id = structure.db.d.size() + 1;
                            nd.day = nInt.inputString("Write day name");
                            structure.db.addDay(nd);
                        } else if(n.equals("m")) {
                            Month nm = new Month();
                            nm.id = structure.db.m.size() + 1;
                            nm.month = nInt.inputString("Write month name");
                            structure.db.addMonth(nm);
                        } else if(n.equals("y")) {
                            Year ny = new Year();
                            ny.id = structure.db.y.size() + 1;
                            ny.year = nInt.inputString("Write month name");
                            structure.db.addYear(ny);
                        } else if(n.equals("t")) {
                            Town nt = new Town ();
                            nt.id = structure.db.t.size() + 1;
                            nt.town  = nInt.inputString("Write tonth name");
                            structure.db.addTown(nt);
                        } else if(n.equals("s")) {
                            Street ns = new Street ();
                            ns.id = structure.db.s.size() + 1;
                            ns.street  = nInt.inputString("Write street name");
                            structure.db.addStreet(ns);
                        } else if(n.equals("h")) {
                            House nh = new House ();
                            nh.id = structure.db.h.size() + 1;
                            nh.house  = nInt.inputString("Write house name");
                            structure.db.addHouse(nh);
                        } else if(n.equals("ap")) {
                            Apartment nap = new Apartment();
                            nap.id = structure.db.ap.size() + 1;
                            nap.apartment  = nInt.inputString("Write apartment name");
                            structure.db.addApartment(nap);
                        } else if (n.equals("j")) {
                            structure.db.j.add(new JobTitle(structure.db.j.size() + 1, nInt.inputString("Write job title name")));
                        } else if (n.equals("al")) {
                            structure.db.al.add(new AccessLevel(structure.db.al.size() + 1, nInt.inputString("Write access level name")));
                        } else if (n.equals("we")) {
                            structure.db.w.add(new WorkExperience(structure.db.w.size() + 1, nInt.inputString("Write work experience name")));
                        
                        } else if (n.equals("fn")) {
                            int nid = structure.db.fN.size() + 1;
                            int nfn = nInt2.inputInt("Write first name N");
                            int nsn = nInt2.inputInt("Write second name N");
                            int nnum = nInt2.inputInt("Write sur name N");
                            FoolName nfN = new FoolName(nid, nfn, nsn, nnum);
                            structure.db.fN.add(nfN);

                        } else if (n.equals("bd")) {
                            int nid = structure.db.bd.size() + 1;
                            int nd = nInt2.inputInt("Write day name N");
                            int nm = nInt2.inputInt("Write month N");
                            int ny = nInt2.inputInt("Write year N");
                            BirthDate nbd = new BirthDate(nid, nd, nm, ny);
                            structure.db.bd.add(nbd);

                        } else if (n.equals("a")) {
                            int nid = structure.db.a.size() + 1;
                            int nt = nInt2.inputInt("Write town N");
                            int ns = nInt2.inputInt("Write street N");
                            int nh = nInt2.inputInt("Write home N");
                            int nap = nInt2.inputInt("Write apartment N");
                            Adress na = new Adress(nid, nt, ns, nh, nap);
                            structure.db.a.add(na);
                        } else {
                            view.textReturn("Wrong command!");
                        }
                    }
                } else {
                    view.textReturn("Wrong command!");
                }
            }
        }
    view.printEmrty();
    }
}
