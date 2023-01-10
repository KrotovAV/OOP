// / Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControllerT {
     
    public static void run() throws Exception{

        ViewT.printEmrty();
        boolean check = true, checkS = true, checkF = true;
        // boolean checkC = true, checkCC = true, checkCpC = true, checkCo = true, checkCpK = true;
        // boolean checkCk= true, checkCt = true, checkCs = true, checkCr = true, checkCv = true;

        // boolean checkA = true, checkAC = true, checkApC = true, checkAo = true, checkApK = true;
        // boolean checkAk= true, checkAt = true, checkAs = true, checkAr = true, checkAv = true;

        // boolean checkD = true, checkDC = true, checkDpC = true, checkDo = true, checkDpK = true;
        // boolean checkDk= true, checkDt = true, checkDs = true, checkDr = true, checkDv = true;

        InputScanerT inS1 = new InputScanerT();
        String l, n, c, id, nam;
        while(check){
            ViewT.printString(MenuT.getMenuName("MaimMenu"));
            l = inS1.inputString(MenuT.getMenuName("Select"));
            if(l.equals("e")) check = false;
            else {
                ArrayList<CarstvoT> carstvo1 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo2 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo3 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo4 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo5 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo6 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo7 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo8 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo9 = new ArrayList<>();
                // Carstvo - Podcarstvo - Tip - Klass -PodKlass - Otriyd - Semeistvo - Rod - Vid

                ArrayList<String>carstvoArrayListString = ReadWriteT.readFile(PathT.getPathName("pathReadCarstvo"));
                ArrayList<String>podCarstvoArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadPodCarstvo"));
                ArrayList<String>tipArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadTip"));
                ArrayList<String>klassArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadKlass"));
                ArrayList<String>podKlassArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadPodKlass"));
                ArrayList<String>otriydArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadOtriyd"));
                ArrayList<String>semeistvoArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadSemeistvo"));
                ArrayList<String>rodArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadRod"));
                ArrayList<String>vidArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadVid"));

                carstvo1 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(carstvoArrayListString));
                carstvo2 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(podCarstvoArrayListString));
                carstvo3 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(tipArrayListString));
                carstvo4 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(klassArrayListString));
                carstvo5 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(podKlassArrayListString));
                carstvo6 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(otriydArrayListString));
                carstvo7 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(semeistvoArrayListString));
                carstvo8 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(rodArrayListString));
                carstvo9 = (ArrayList<CarstvoT>) ((ArrayList<?>) MetodsT.convertString(vidArrayListString));
                
                // carstvo1 = Carstvo.convertStringToCarstvo(carstvoArrayListString);
                // carstvo2 = (ArrayList<Carstvo>) ((ArrayList<?>) PodCarstvo.convertStringToPodCarstvo(podCarstvoArrayListString));
                // carstvo3 = (ArrayList<Carstvo>) ((ArrayList<?>) Tip.convertStringToTip(tipArrayListString));
                // carstvo4 = (ArrayList<Carstvo>) ((ArrayList<?>) Klass.convertStringToKlass(klassArrayListString));
                // carstvo5 = (ArrayList<Carstvo>) ((ArrayList<?>) PodKlass.convertStringToPodKlass(podKlassArrayListString));
                // carstvo6 = (ArrayList<Carstvo>) ((ArrayList<?>) Otriyd.convertStringToOtriyd(otriydArrayListString));
                // carstvo7 = (ArrayList<Carstvo>) ((ArrayList<?>) Semeistvo.convertStringToSemeistvo(semeistvoArrayListString));
                // carstvo8 = (ArrayList<Carstvo>) ((ArrayList<?>) Rod.convertStringToRod(rodArrayListString));
                // carstvo9 = (ArrayList<Carstvo>) ((ArrayList<?>) Vid.convertStringToVid(vidArrayListString));

                ClassificationT c1 = new ClassificationT(carstvo1);
                ClassificationT c2 = new ClassificationT(carstvo2);
                ClassificationT c3 = new ClassificationT(carstvo3);
                ClassificationT c4 = new ClassificationT(carstvo4);
                ClassificationT c5 = new ClassificationT(carstvo5);
                ClassificationT c6 = new ClassificationT(carstvo6);
                ClassificationT c7 = new ClassificationT(carstvo7);
                ClassificationT c8 = new ClassificationT(carstvo8);
                ClassificationT c9 = new ClassificationT(carstvo9);


                // ArrayList<PodCarstvo> carstvo22 =  (ArrayList<PodCarstvo>) ((ArrayList<?>) carstvo2);
                // ArrayList<Tip> carstvo33 =  (ArrayList<Tip>) ((ArrayList<?>) carstvo3);
                // ArrayList<Klass> carstvo44 =  (ArrayList<Klass>) ((ArrayList<?>) carstvo4);
                // ArrayList<PodKlass> carstvo55 =  (ArrayList<PodKlass>) ((ArrayList<?>) carstvo5);
                // ArrayList<Otriyd> carstvo66 =  (ArrayList<Otriyd>) ((ArrayList<?>) carstvo6);
                // ArrayList<Semeistvo> carstvo77 =  (ArrayList<Semeistvo>) ((ArrayList<?>) carstvo7);
                // ArrayList<Rod> carstvo88 =  (ArrayList<Rod>) ((ArrayList<?>) carstvo8);
                // ArrayList<Vid> carstvo99 =  (ArrayList<Vid>) ((ArrayList<?>) carstvo9); 
                //-----------------------------------------------
                if (l.equals("s")) {
                    while(checkS) {
                        n = inS1.inputString(MenuT.getMenuName("Show"));
                        if (n.equals("e")) { checkS = false;}
                        else {
                            if (n.equals("c")) {ViewT.printClassification(c1);}
                            else if (n.equals("pc")) {ViewT.printClassification(c2);}
                            else if (n.equals("t")) {ViewT.printClassification(c3);}
                            else if (n.equals("k")) {ViewT.printClassification(c4);}
                            else if (n.equals("pk")) {ViewT.printClassification(c5);}
                            else if (n.equals("o")) {ViewT.printClassification(c6);}
                            else if (n.equals("s")) {ViewT.printClassification(c7);}
                            else if (n.equals("r")) {ViewT.printClassification(c8);}
                            else if (n.equals("v")) {ViewT.printClassification(c9);}
                            else {ViewT.printString(MenuT.getMenuName("Wrong"));} 
                        }
                    }
                }
                // if (l.equals("f")) {
                //     while(checkF) {
                //         n = inS1.inputString(Menu.getMenuName("Find"));
                //         if (n.equals("e")) { checkF = false; }
                //         else {
                //             if (n.equals("c")) {
                //                 checkF = Metods.find(c1, "CarstvoName", carstvo1);
                                // View.printClassification(c1);
                                // String cfName = inS1.inputString(Menu.getMenuName("CarstvoName"));
                                // Map<String, Carstvo> mapCarstvo = new HashMap<>();
                                // mapCarstvo = Carstvo.convertListCarstvo(carstvo1);
                                // if (cfName.equals("e")) {
                                //     checkF = false;
                                // }
                                // else {
                                //     Carstvo carstvo = mapCarstvo.get(cfName);
                                //     if (carstvo == null) { 
                                //         View.printString(Menu.getMenuName("NF"));
                                //     }
                                //     else {
                                //         Vid vid = new Vid(carstvo.getIdCarstvo(), carstvo.getNameCarstvo());
                                //         View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                                //     }
                                // }
                            // }
                            // else if (n.equals("pc")) {
                            //     checkF = Metods.find(c2, "PodCarstvoName", carstvo22);
                                // View.printClassification(c2);
                                // String pcfName = inS1.inputString(Menu.getMenuName("PodCarstvoName"));
                                // Map<String, PodCarstvo> mapPodCarstvo = new HashMap<>();
                                // mapPodCarstvo = PodCarstvo.convertListPodCarstvo(carstvo22);
                                // if (pcfName.equals("e")) {
                                //     checkF = false;
                                // }
                                // else {
                                //     PodCarstvo podCarstvo = mapPodCarstvo.get(pcfName);
                                //     if (podCarstvo == null) { 
                                //         View.printString(Menu.getMenuName("NF"));
                                //     }
                                //     else {
                                //         Vid vid = new Vid(podCarstvo.getIdPodCarstvo(), podCarstvo.getNamePodCarstvo());
                                //         View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                                //         View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                                //     }
                                // }
                            // }
                            // else if (n.equals("t")) {
                            //     checkF = Metods.find(c3, "PodCarstvoName", carstvo33);
                                // View.printClassification(c3);
                                // String tfName = inS1.inputString(Menu.getMenuName("TipName"));
                                // Map<String, Tip > mapTip  = new HashMap<>();
                                // mapTip = Tip.convertListTip(carstvo33);
                                // if (tfName.equals("e")) {
                                //     checkF = false;
                                // }
                                // else {
                                //     Tip tip  = mapTip .get(tfName);
                                //     if (tip  == null) { 
                                //         View.printString(Menu.getMenuName("NF"));
                                //     }
                                //     else {
                                //         Vid vid = new Vid(tip.getIdTip(), tip.getNameTip());
                                //         View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                                //         View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                                //         View.printString(Tip.FindNameTip(carstvo33, vid));
                                //     }
                                // }
                            // }
                            // else if (n.equals("k")) {
                            //     View.printClassification(c4);
                            //     String kfName = inS1.inputString(Menu.getMenuName("KlassName"));
                            //     Map<String, Klass> mapKlass = new HashMap<>();
                            //     mapKlass = PodKlass.convertListKlass(carstvo44);
                            //     if (kfName.equals("e")) {
                            //         checkF = false;
                            //     }
                            //     else {
                            //         Klass klass = mapKlass.get(kfName);
                            //         if ( klass  == null) { 
                            //             View.printString(Menu.getMenuName("NF"));
                            //         }
                            //         else {
                            //             Vid vid = new Vid(klass.getIdKlass(), klass.getNameKlass() );
                            //             View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                            //             View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                            //             View.printString(Tip.FindNameTip(carstvo33, vid));
                            //             View.printString(Klass.FindNameKlass(carstvo44, vid));
                            //         }
                            //     }
                            // }
                            // else if (n.equals("pk")) {
                            //     View.printClassification(c5);
                            //     String pkfName = inS1.inputString(Menu.getMenuName("PodKlassName"));
                            //     Map<String, PodKlass> mapPodKlass = new HashMap<>();
                            //     mapPodKlass = PodKlass.convertListPodKlass(carstvo55);
                            //     if (pkfName.equals("e")) {
                            //         checkF = false;
                            //     }
                            //     else {
                            //         PodKlass podKlass = mapPodKlass.get(pkfName);
                            //         if ( podKlass  == null) { 
                            //             View.printString(Menu.getMenuName("NF"));
                            //         }
                            //         else {
                            //             Vid vid = new Vid(podKlass.getIdPodKlass(), podKlass.getNamePodKlass() );
                            //             View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                            //             View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                            //             View.printString(Tip.FindNameTip(carstvo33, vid));
                            //             View.printString(Klass.FindNameKlass(carstvo44, vid));
                            //             View.printString(PodKlass.FindNamePodKlass(carstvo55, vid));
                            //         }
                            //     }
                            // }
                            // else if (n.equals("o")) {
                            //     View.printClassification(c6);
                            //     String ofName = inS1.inputString(Menu.getMenuName("OriydName"));
                            //     Map<String, Otriyd> mapOtriyd = new HashMap<>();
                            //     mapOtriyd = Otriyd.convertListOtriyd(carstvo66);
                            //     if (ofName.equals("e")) {
                            //         checkF = false;
                            //     }
                            //     else {
                            //         Otriyd otriyd = mapOtriyd.get(ofName);
                            //         if ( otriyd  == null) { 
                            //             View.printString(Menu.getMenuName("NF"));
                            //         }
                            //         else {
                            //             Vid vid = new Vid(otriyd.getIdOtriyd(), otriyd.getNameOtriyd() );
                            //             View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                            //             View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                            //             View.printString(Tip.FindNameTip(carstvo33, vid));
                            //             View.printString(Klass.FindNameKlass(carstvo44, vid));
                            //             View.printString(PodKlass.FindNamePodKlass(carstvo55, vid));
                            //             View.printString(Otriyd.FindNameOtriyd(carstvo66, vid));
                            //         }
                            //     }
                            // }
                            // else if (n.equals("s")) {
                            //     View.printClassification(c7);
                            //     String sfName = inS1.inputString(Menu.getMenuName("SemeistvoName"));
                            //     Map<String, Semeistvo> mapSemeistvo = new HashMap<>();
                            //     mapSemeistvo = Semeistvo.convertListSemeistvo(carstvo77);
                            //     if (sfName.equals("e")) {
                            //         checkF = false;
                            //     }
                            //     else {
                            //         Semeistvo semeistvo = mapSemeistvo.get(sfName);
                            //         if (semeistvo  == null) { 
                            //             View.printString(Menu.getMenuName("NF"));
                            //         }
                            //         else {
                            //             Vid vid = new Vid(semeistvo.getIdSemeistvo(), semeistvo.getNameSemeistvo() );
                            //             View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                            //             View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                            //             View.printString(Tip.FindNameTip(carstvo33, vid));
                            //             View.printString(Klass.FindNameKlass(carstvo44, vid));
                            //             View.printString(PodKlass.FindNamePodKlass(carstvo55, vid));
                            //             View.printString(Otriyd.FindNameOtriyd(carstvo66, vid));
                            //             View.printString(Semeistvo.FindNameSemeistvo(carstvo77, vid));
                            //         }
                            //     }
                            // }
                            // else if (n.equals("r")) {
                            //     View.printClassification(c8);
                            //     String rfName = inS1.inputString(Menu.getMenuName("RodName"));
                            //     Map<String, Rod> mapRod = new HashMap<>();
                            //     mapRod = Rod.convertListRod(carstvo88);
                            //     if (rfName.equals("e")) {
                            //         checkF = false;
                            //     }
                            //     else {
                            //         Rod rod = mapRod.get(rfName);
                            //         if (rod == null) { 
                            //             View.printString(Menu.getMenuName("NF"));
                            //         }
                            //         else {
                            //             Vid vid = new Vid(rod.getIdRod(), rod.getNameRod() );
                            //             View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                            //             View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                            //             View.printString(Tip.FindNameTip(carstvo33, vid));
                            //             View.printString(Klass.FindNameKlass(carstvo44, vid));
                            //             View.printString(PodKlass.FindNamePodKlass(carstvo55, vid));
                            //             View.printString(Otriyd.FindNameOtriyd(carstvo66, vid));
                            //             View.printString(Semeistvo.FindNameSemeistvo(carstvo77, vid));
                            //             View.printString(Rod.FindNameRod(carstvo88, vid));
                            //         }
                            //     }
                            // }
                            // else if (n.equals("v")) {
                            //     View.printClassification(c9);
                            //     String vfName = inS1.inputString(Menu.getMenuName("VidName"));
                            //     Map<String, Vid> mapVid = new HashMap<>();
                            //     mapVid = Vid.convertListVid(carstvo99);
                            //     if (vfName.equals("e")) {
                            //         checkF = false;
                            //     }
                            //     else {
                            //         Vid vid = mapVid.get(vfName);
                            //         if (vid == null) { 
                            //             View.printString(Menu.getMenuName("NF"));
                            //         }
                            //         else {
                            //             View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                            //             View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                            //             View.printString(Tip.FindNameTip(carstvo33, vid));
                            //             View.printString(Klass.FindNameKlass(carstvo44, vid));
                            //             View.printString(PodKlass.FindNamePodKlass(carstvo55, vid));
                            //             View.printString(Otriyd.FindNameOtriyd(carstvo66, vid));
                            //             View.printString(Semeistvo.FindNameSemeistvo(carstvo77, vid));
                            //             View.printString(Rod.FindNameRod(carstvo88, vid));
                            //             View.printString(Vid.FindNameVid(carstvo99, vid));
                        //             }
                        //         }
                        //     }
                        //     else {View.printString(Menu.getMenuName("Wrong"));} 
                        // }
                    }
                }
                // if (l.equals("c")) {
                //     while(checkC) {
                //         n = inS1.inputString(Menu.getMenuName("Change"));
                //         if (n.equals("e")) { checkC = false; }
                //         else {
                //             if (n.equals("c")) {
                //                 View.printClassification(c1);
                //                 String cfName = inS1.inputString(Menu.getMenuName("CarstvoName"));
                //                 Map<String, Carstvo> mapCarstvo = new HashMap<>();
                //                 mapCarstvo = Carstvo.convertListCarstvo(carstvo1);
                //                 if (cfName.equals("e")) {
                //                     checkC = false;
                //                 }
                //                 else {
                //                     Carstvo carstvo = mapCarstvo.get(cfName);
                //                     if (carstvo == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(carstvo.getIdCarstvo(), carstvo.getNameCarstvo());
                //                         View.printString(Carstvo.FindNameCarstvo(carstvo1, vid));
                //                         id = carstvo.getIdCarstvo();
                //                         nam = carstvo.getNameCarstvo();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCC) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadCarstvo"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadCarstvo"), newId, newNam);
                //                                 checkCC = false;
                //                             }
                //                             else if (c.equals("e")) checkCC = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }
                //             }
                //             else if (n.equals("pc")) {
                //                 View.printClassification(c2);
                //                 String pcfName = inS1.inputString(Menu.getMenuName("PodCarstvoName"));
                //                 Map<String, PodCarstvo> mapPodCarstvo = new HashMap<>();
                //                 mapPodCarstvo = PodCarstvo.convertListPodCarstvo(carstvo22);
                //                 if (pcfName.equals("e")) checkC = false;
                //                 else {
                //                     PodCarstvo podCarstvo = mapPodCarstvo.get(pcfName);
                //                     if (podCarstvo == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(podCarstvo.getIdPodCarstvo(), podCarstvo.getNamePodCarstvo());
                //                         View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                //                         id = podCarstvo.getIdPodCarstvo();
                //                         nam = podCarstvo.getNamePodCarstvo();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCpC) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadPodCarstvo"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadPodCarstvo"), newId, newNam);
                //                                 checkCpC = false;
                //                             }
                //                             else if (c.equals("e")) checkCpC = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }
                //             }
                //             else if (n.equals("t")) {
                //                 View.printClassification(c3);
                //                 String tfName = inS1.inputString(Menu.getMenuName("TipName"));
                //                 Map<String, Tip> mapTip  = new HashMap<>();
                //                 mapTip = Tip.convertListTip(carstvo33);
                //                 if (tfName.equals("e")) checkC = false;
                //                 else {
                //                     Tip tip  = mapTip.get(tfName);
                //                     if (tip == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(tip.getIdTip(), tip.getNameTip());
                //                         View.printString(Tip.FindNameTip(carstvo33, vid));
                //                         id = tip.getIdTip();
                //                         nam = tip.getNameTip();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCt) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCt = false;
                //                             }
                //                             else if (c.equals("e")) checkCt = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }

                //             }
                //             else if (n.equals("k")) {
                //                 View.printClassification(c4);
                //                 String kfName = inS1.inputString(Menu.getMenuName("KlassName"));
                //                 Map<String, Klass> mapKlass = new HashMap<>();
                //                 mapKlass = PodKlass.convertListKlass(carstvo44);
                //                 if (kfName.equals("e")) checkC = false;
                //                 else {
                //                     Klass klass = mapKlass.get(kfName);
                //                     if (klass == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(klass.getIdKlass(), klass.getNameKlass() );
                //                         View.printString(Klass.FindNameKlass(carstvo44, vid));
                //                         id = klass.getIdKlass();
                //                         nam = klass.getNameKlass();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCk) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCk = false;
                //                             }
                //                             else if (c.equals("e")) checkCk = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }
                //             }
                //             else if (n.equals("pk")) {
                //                 View.printClassification(c5);
                //                 String pkfName = inS1.inputString(Menu.getMenuName("PodKlassName"));
                //                 Map<String, PodKlass> mapPodKlass = new HashMap<>();
                //                 mapPodKlass = PodKlass.convertListPodKlass(carstvo55);
                //                 if (pkfName.equals("e")) checkC = false;
                //                 else {
                //                     PodKlass podKlass = mapPodKlass.get(pkfName);
                //                     if (podKlass == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(podKlass.getIdPodKlass(), podKlass.getNamePodKlass() );
                //                         View.printString( PodKlass.FindNamePodKlass(carstvo55, vid));
                //                         id = podKlass.getIdPodKlass();
                //                         nam = podKlass.getNamePodKlass();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCpK) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCpK = false;
                //                             }
                //                             else if (c.equals("e")) checkCpK = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }

                //             }
                //             else if (n.equals("o")) {
                //                 View.printClassification(c6);
                //                 String ofName = inS1.inputString(Menu.getMenuName("OriydName"));
                //                 Map<String, Otriyd> mapOtriyd = new HashMap<>();
                //                 mapOtriyd = Otriyd.convertListOtriyd(carstvo66);
                //                 if (ofName.equals("e")) checkC = false;
                //                 else {
                //                     Otriyd otriyd = mapOtriyd.get(ofName);
                //                     if (otriyd == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(otriyd.getIdOtriyd(), otriyd.getNameOtriyd() );
                //                         View.printString(Otriyd.FindNameOtriyd(carstvo66, vid));
                //                         id = otriyd.getIdOtriyd();
                //                         nam = otriyd.getNameOtriyd();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCo) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCo = false;
                //                             }
                //                             else if (c.equals("e")) checkCo = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }
                //             }
                //             else if (n.equals("s")) {
                //                 View.printClassification(c7);
                //                 String sfName = inS1.inputString(Menu.getMenuName("SemeistvoName"));
                //                 Map<String, Semeistvo> mapSemeistvo = new HashMap<>();
                //                 mapSemeistvo = Semeistvo.convertListSemeistvo(carstvo77);
                //                 if (sfName.equals("e")) checkC = false;
                //                 else {
                //                     Semeistvo semeistvo = mapSemeistvo.get(sfName);
                //                     if (semeistvo == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(semeistvo.getIdSemeistvo(), semeistvo.getNameSemeistvo() );
                //                         View.printString(Semeistvo.FindNameSemeistvo(carstvo77, vid));
                //                         id = semeistvo.getIdSemeistvo();
                //                         nam = semeistvo.getNameSemeistvo();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCs) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCs = false;
                //                             }
                //                             else if (c.equals("e")) checkCs = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }
                //             }
                //             else if (n.equals("r")) {
                //                 View.printClassification(c8);
                //                 String rfName = inS1.inputString(Menu.getMenuName("RodName"));
                //                 Map<String, Rod> mapRod = new HashMap<>();
                //                 mapRod = Rod.convertListRod(carstvo88);
                //                 if (rfName.equals("e")) checkC = false;
                //                 else {
                //                     Rod rod = mapRod.get(rfName);
                //                     if (rod == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         Vid vid = new Vid(rod.getIdRod(), rod.getNameRod() );
                //                         View.printString(Rod.FindNameRod(carstvo88, vid));
                //                         id = rod.getIdRod();
                //                         nam = rod.getNameRod();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCr) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCr = false;
                //                             }
                //                             else if (c.equals("e")) checkCr = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }

                //             }
                //             else if (n.equals("v")) {
                //                 View.printClassification(c9);
                //                 String vfName = inS1.inputString(Menu.getMenuName("VidName"));
                //                 Map<String, Vid> mapVid = new HashMap<>();
                //                 mapVid = Vid.convertListVid(carstvo99);
                //                 if (vfName.equals("e")) checkC = false;
                //                 else {
                //                     Vid vid = mapVid.get(vfName);
                //                     if (vid == null) { 
                //                         View.printString(Menu.getMenuName("NF"));
                //                     }
                //                     else {
                //                         // Vid vid = mapVid.get(vfName);
                //                         View.printString(Vid.FindNameVid(carstvo99, vid));;
                //                         id = vid.getIdVid();
                //                         nam = vid.getNameVid();
                //                         String newId = id;
                //                         String newNam = nam;
                //                         while(checkCv) {
                //                             c = inS1.inputString(Menu.getMenuName("ChangeMenu"));
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), newId, newNam);
                //                                 checkCv = false;
                //                             }
                //                             else if (c.equals("e")) checkCv = false;
                //                             else {
                //                                 if (c.equals("i")) {
                //                                     newId = inS1.inputString(Menu.getMenuName("Id") + " (" + id + ")");
                //                                 }
                //                                 else if (c.equals("n")) {
                //                                     newNam = inS1.inputString(Menu.getMenuName("Name") + " (" + nam + ")" );
                //                                 }
                //                                 else {View.printString(Menu.getMenuName("Wrong"));}
                //                             }
                //                         }
                //                     }
                //                 }

                //             }
                //             else {View.printString(Menu.getMenuName("Wrong"));} 
                //         }
                //     }
                // }
                // if (l.equals("a")) {
                //     while(checkA) {
                //         n = inS1.inputString(Menu.getMenuName("Add"));
                //         if (n.equals("e")) { checkA = false; }
                //         else {
                //             if (n.equals("c")) {
                //                 View.printClassification(c1);
                //                 while(checkAC) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAC = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Царство - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAC = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadCarstvo"), id, nam);
                //                                 checkAC = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("pc")) {
                //                 View.printClassification(c2);
                //                 while(checkApC) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkApC = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Подцарство - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkApC = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadPodCarstvo"), id, nam);
                //                                 checkApC = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("t")) {
                //                 View.printClassification(c3);
                //                 while(checkAt) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAt = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Тип - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAt = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadTip"), id, nam);
                //                                 checkAt = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("k")) {
                //                 View.printClassification(c4);
                //                 while(checkAk) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAk = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Класс - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAk = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadKlass"), id, nam);
                //                                 checkAk = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("pk")) {
                //                 View.printClassification(c5);
                //                 while(checkApK) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkApK = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Подкласс - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkApK = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadPodKlass"), id, nam);
                //                                 checkApK = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("o")) {
                //                 View.printClassification(c6);
                //                 while(checkAo) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAo = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Отряд - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAo = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadOtriyd"), id, nam);
                //                                 checkAo = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("s")) {
                //                 View.printClassification(c7);
                //                 while(checkAs) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAs = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Семейство - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAs = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadSemeistvo"), id, nam);
                //                                 checkAs = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("r")) {
                //                 View.printClassification(c8);
                //                 while(checkAr) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAr = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Род - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAr = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadRod"), id, nam);
                //                                 checkAr = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }
                //             }
                //             else if (n.equals("v")) {
                //                 View.printClassification(c9);
                //                 while(checkAv) {
                //                     c = inS1.inputString(Menu.getMenuName("AddMenu"));
                //                     if (c.equals("e")) checkAv = false;
                //                     else {
                //                         if (c.equals("a")) {
                //                             id = inS1.inputString(Menu.getMenuName("Id"));
                //                             nam = inS1.inputString(Menu.getMenuName("Name"));
                //                             View.printString("Вид - " + id +".," + nam);
                //                             c = inS1.inputString(Menu.getMenuName("AddMenuSE"));
                //                             if (c.equals("e")) checkAv = false;
                //                             if (c.equals("se")) { 
                //                                 ReadWrite.whriteFile(Path.getPathName("pathReadVid"), id, nam);
                //                                 checkAv = false;
                //                             }
                //                         }
                //                         else {View.printString(Menu.getMenuName("Wrong"));}
                //                     }
                //                 }

                //             }
                //             else {View.printString(Menu.getMenuName("Wrong"));} 
                //         }
                //     }
                // }
                // if (l.equals("d")) {
                    // while(checkD) {
                    //     n = inS1.inputString(Menu.getMenuName("Delite"));
                    //     if (n.equals("e")) {checkD = false;}
                    //     else {
                    //         if (n.equals("c")) {
                    //             View.printClassification(c1);
                    //             String cfName = inS1.inputString(Menu.getMenuName("CarstvoName"));
                    //             Map<String, Carstvo> mapCarstvo = new HashMap<>();
                    //             mapCarstvo = Carstvo.convertList(carstvo1);
                    //             if (cfName.equals("e")) {
                    //                 checkD = false;
                    //             }
                    //             else {
                    //                 Carstvo carstvo = mapCarstvo.get(cfName);
                    //                 if (carstvo == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(carstvo.getId(), carstvo.getName());
                    //                     View.printString(Metods.FindName(carstvo1, vid));
                    //                     id = carstvo.getId();
                    //                     nam = carstvo.getName();
                    //                     while(checkDC) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDC = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadCarstvo"), id, nam);
                    //                                 checkDC = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //         else if (n.equals("pc")) {
                    //             View.printClassification(c2);
                    //             String pcfName = inS1.inputString(Menu.getMenuName("PodCarstvoName"));
                    //             Map<String, PodCarstvo> mapPodCarstvo = new HashMap<>();
                    //             mapPodCarstvo = PodCarstvo.convertListPodCarstvo(carstvo22);
                    //             if (pcfName.equals("e")) {
                    //                 checkD = false;
                    //             }
                    //             else {
                    //                 PodCarstvo podCarstvo = mapPodCarstvo.get(pcfName);
                    //                 if (podCarstvo == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(podCarstvo.getIdPodCarstvo(), podCarstvo.getNamePodCarstvo());
                    //                     View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                    //                     id = podCarstvo.getIdCarstvo();
                    //                     nam = podCarstvo.getNameCarstvo();
                    //                     while(checkDpC) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDpC = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadPodCarstvo"), id, nam);
                    //                                 checkDpC = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //         else if (n.equals("t")) {
                    //             View.printClassification(c3);
                    //             String tfName = inS1.inputString(Menu.getMenuName("TipName"));
                    //             Map<String, Tip> mapTip  = new HashMap<>();
                    //             mapTip = Tip.convertListTip(carstvo33);
                    //             if (tfName.equals("e")) {
                    //                 checkD = false;
                    //             }
                    //             else {
                    //                 Tip tip = mapTip.get(tfName);
                    //                 if (tip == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(tip.getIdTip(), tip.getNameTip());
                    //                     View.printString(PodCarstvo.FindNamePodCarstvo(carstvo22, vid));
                    //                     id = tip.getIdTip();
                    //                     nam = tip.getNameTip();
                    //                     while(checkDt) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDt = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadTip"), id, nam);
                    //                                 checkDt = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //         else if (n.equals("k")) {
                    //             View.printClassification(c4);
                    //             String kfName = inS1.inputString(Menu.getMenuName("KlassName"));
                    //             Map<String, Klass> mapKlass = new HashMap<>();
                    //             mapKlass = PodKlass.convertListKlass(carstvo44);
                    //             if (kfName.equals("e")) checkC = false;
                    //             else {
                    //                 Klass klass = mapKlass.get(kfName);
                    //                 if (klass == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(klass.getIdKlass(), klass.getNameKlass() );
                    //                     View.printString(Klass.FindNameKlass(carstvo44, vid));
                    //                     id = klass.getIdKlass();
                    //                     nam = klass.getNameKlass();
                    //                     while(checkDk) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDk = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadKlass"), id, nam);
                    //                                 checkDk = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //         else if (n.equals("pk")) {
                    //             View.printClassification(c5);
                    //             String pkfName = inS1.inputString(Menu.getMenuName("PodKlassName"));
                    //             Map<String, PodKlass> mapPodKlass = new HashMap<>();
                    //             mapPodKlass = PodKlass.convertListPodKlass(carstvo55);
                    //             if (pkfName.equals("e")) checkC = false;
                    //             else {
                    //                 PodKlass podKlass = mapPodKlass.get(pkfName);
                    //                 if (podKlass == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(podKlass.getIdPodKlass(), podKlass.getNamePodKlass() );
                    //                     View.printString( PodKlass.FindNamePodKlass(carstvo55, vid));
                    //                     id = podKlass.getIdPodKlass();
                    //                     nam = podKlass.getNamePodKlass();
                    //                     while(checkDpK) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDpK = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadPodKlass"), id, nam);
                    //                                 checkDpK = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }

                    //         }
                    //         else if (n.equals("o")) {
                    //             View.printClassification(c6);
                    //             String ofName = inS1.inputString(Menu.getMenuName("OriydName"));
                    //             Map<String, Otriyd> mapOtriyd = new HashMap<>();
                    //             mapOtriyd = Otriyd.convertListOtriyd(carstvo66);
                    //             if (ofName.equals("e")) checkC = false;
                    //             else {
                    //                 Otriyd otriyd = mapOtriyd.get(ofName);
                    //                 if (otriyd == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(otriyd.getIdOtriyd(), otriyd.getNameOtriyd() );
                    //                     View.printString(Otriyd.FindNameOtriyd(carstvo66, vid));
                    //                     id = otriyd.getIdOtriyd();
                    //                     nam = otriyd.getNameOtriyd();
                    //                     while(checkDo) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDo = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadOtriyd"), id, nam);
                    //                                 checkDo = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //         else if (n.equals("s")) {
                    //             View.printClassification(c7);
                    //             String sfName = inS1.inputString(Menu.getMenuName("SemeistvoName"));
                    //             Map<String, Semeistvo> mapSemeistvo = new HashMap<>();
                    //             mapSemeistvo = Semeistvo.convertListSemeistvo(carstvo77);
                    //             if (sfName.equals("e")) checkC = false;
                    //             else {
                    //                 Semeistvo semeistvo = mapSemeistvo.get(sfName);
                    //                 if (semeistvo == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(semeistvo.getIdSemeistvo(), semeistvo.getNameSemeistvo() );
                    //                     View.printString(Semeistvo.FindNameSemeistvo(carstvo77, vid));
                    //                     id = semeistvo.getIdSemeistvo();
                    //                     nam = semeistvo.getNameSemeistvo();
                    //                     while(checkDs) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDs = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadSemeistvo"), id, nam);
                    //                                 checkDs = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //         else if (n.equals("r")) {
                    //             View.printClassification(c8);
                    //             String rfName = inS1.inputString(Menu.getMenuName("RodName"));
                    //             Map<String, Rod> mapRod = new HashMap<>();
                    //             mapRod = Rod.convertListRod(carstvo88);
                    //             if (rfName.equals("e")) checkC = false;
                    //             else {
                    //                 Rod rod = mapRod.get(rfName);
                    //                 if (rod == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     Vid vid = new Vid(rod.getIdRod(), rod.getNameRod() );
                    //                     View.printString(Rod.FindNameRod(carstvo88, vid));
                    //                     id = rod.getIdRod();
                    //                     nam = rod.getNameRod();
                    //                     while(checkDr) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDr = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadRod"), id, nam);
                    //                                 checkDr = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }

                    //         }
                    //         else if (n.equals("v")) {
                    //             View.printClassification(c9);
                    //             String vfName = inS1.inputString(Menu.getMenuName("VidName"));
                    //             Map<String, Vid> mapVid = new HashMap<>();
                    //             mapVid = Vid.convertListVid(carstvo99);
                    //             if (vfName.equals("e")) checkC = false;
                    //             else {
                    //                 Vid vid = mapVid.get(vfName);
                    //                 if (vid == null) { 
                    //                     View.printString(Menu.getMenuName("NF"));
                    //                 }
                    //                 else {
                    //                     // Vid vid = mapVid.get(vfName);
                    //                     View.printString(Vid.FindNameVid(carstvo99, vid));;
                    //                     id = vid.getIdVid();
                    //                     nam = vid.getNameVid();
                    //                     while(checkDv) {
                    //                         c = inS1.inputString(Menu.getMenuName("DeliteMenuDE"));
                    //                         if (c.equals("e")) checkDv = false;
                    //                         else {
                    //                             if (c.equals("de")) {
                    //                                 ReadWrite.deliteString(Path.getPathName("pathReadVid"), id, nam);
                    //                                 checkDv = false;
                    //                             }
                    //                             else {View.printString(Menu.getMenuName("Wrong"));}
                    //                         }
                    //                     }
                    //                 }
                    //             }

                            // }
                            // else {View.printString(Menu.getMenuName("Wrong"));} 
                        // }
                    // }
                // }
            // }
        // }
    }
}
