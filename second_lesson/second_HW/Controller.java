// / Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controller {
     
    public static void run() throws Exception{
        // ArrayList<Carstvo> carstvo1 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo2 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo3 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo4 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo5 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo6 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo7 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo8 = new ArrayList<>();
        // ArrayList<Carstvo> carstvo9 = new ArrayList<>();

        // carstvo1 = Carstvo.readCarstvoFile(Path.getPathName("pathReadCarstvo"));
        // carstvo2 = PodCarstvo.readPodCarstvoFile(Path.getPathName("pathReadPodCarstvo"));
        // carstvo3 = Tip.readTipFile(Path.getPathName("pathReadTip"));
        // carstvo4 = Klass.readKlassFile(Path.getPathName("pathReadKlass"));
        // carstvo5 = PodKlass.readPodKlassFile(Path.getPathName("pathReadPodKlass"));
        // carstvo6 = Otriyd.readOtriydFile(Path.getPathName("pathReadOtriyd"));
        // carstvo7 = Semeistvo.readSemeistvoFile(Path.getPathName("pathReadSemeistvo"));
        // carstvo8 = Rod.readRodFile(Path.getPathName("pathReadRod"));
        // carstvo9 = Vid.readVidFile(Path.getPathName("pathReadVid"));

        // Classification c1 = new Classification(carstvo1);
        // Classification c2 = new Classification(carstvo2);
        // Classification c3 = new Classification(carstvo3);
        // Classification c4 = new Classification(carstvo4);
        // Classification c5 = new Classification(carstvo5);
        // Classification c6 = new Classification(carstvo6);
        // Classification c7 = new Classification(carstvo7);
        // Classification c8 = new Classification(carstvo8);
        // Classification c9 = new Classification(carstvo9);
        
//-----------------------------------------------------------
        // Vid vid =  new Vid("01.11.21.310.41.51.63.712.81.91","Атлантический морж");

        // String find1 = Carstvo.FindNameCarstvo(carstvo1, vid);
        // String find2 = PodCarstvo.FindNamePodCarstvo(carstvo22, vid);
        // String find3 = Tip.FindNameTip(carstvo33, vid);
        // String find4 = Klass.FindNameKlass(carstvo44, vid);
        // String find5 = PodKlass.FindNamePodKlass(carstvo55, vid);
        // String find6 = Otriyd.FindNameOtriyd(carstvo66, vid);
        // String find7 = Semeistvo.FindNameSemeistvo(carstvo77, vid);
        // String find8 = Rod.FindNameRod(carstvo88, vid);
        // String find9 = Vid.FindNameVid(carstvo99, vid);

        // ArrayList<PodCarstvo> carstvo22 =  (ArrayList<PodCarstvo>) ((ArrayList<?>) carstvo2);
        // ArrayList<Tip> carstvo33 =  (ArrayList<Tip>) ((ArrayList<?>) carstvo3);
        // ArrayList<Klass> carstvo44 =  (ArrayList<Klass>) ((ArrayList<?>) carstvo4);
        // ArrayList<PodKlass> carstvo55 =  (ArrayList<PodKlass>) ((ArrayList<?>) carstvo5);
        // ArrayList<Otriyd> carstvo66 =  (ArrayList<Otriyd>) ((ArrayList<?>) carstvo6);
        // ArrayList<Semeistvo> carstvo77 =  (ArrayList<Semeistvo>) ((ArrayList<?>) carstvo7);
        // ArrayList<Rod> carstvo88 =  (ArrayList<Rod>) ((ArrayList<?>) carstvo8);
        // ArrayList<Vid> carstvo99 =  (ArrayList<Vid>) ((ArrayList<?>) carstvo9);

//---------------------------------------------------
        
        ViewT.printEmrty();
        boolean check = true, checkS = true, checkF = true;
        boolean checkC = true, checkCC = true, checkCpC = true, checkCo = true, checkCpK = true;
        boolean checkCk= true, checkCt = true, checkCs = true, checkCr = true, checkCv = true;

        boolean checkA = true, checkAC = true, checkApC = true, checkAo = true, checkApK = true;
        boolean checkAk= true, checkAt = true, checkAs = true, checkAr = true, checkAv = true;

        boolean checkD = true, checkDC = true, checkDpC = true, checkDo = true, checkDpK = true;
        boolean checkDk= true, checkDt = true, checkDs = true, checkDr = true, checkDv = true;

        InputScanerT inS1 = new InputScanerT();
        String l, n, c, id, nam;
        while(check){
            ViewT.printString(MenuT.getMenuName("MaimMenu"));
            l = inS1.inputString(MenuT.getMenuName("Select"));
            if(l.equals("e")) check = false;
            else {
                System.out.printf("check %s \n,", check);
        //-----------------------------------------------
                ArrayList<CarstvoT> carstvo1 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo2 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo3 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo4 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo5 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo6 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo7 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo8 = new ArrayList<>();
                ArrayList<CarstvoT> carstvo9 = new ArrayList<>();
                // Carstvo - Podcarstvo - Tip - Klass -Pod Klass - Otriyd - Semeistvo - Rod - Vid

                ArrayList<String>carstvoArrayListString = ReadWriteT.readFile(PathT.getPathName("pathReadCarstvo"));
                ArrayList<String>podCarstvoArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadPodCarstvo"));
                ArrayList<String>tipArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadTip"));
                ArrayList<String>klassArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadKlass"));
                ArrayList<String>podKlassArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadPodKlass"));
                ArrayList<String>otriydArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadOtriyd"));
                ArrayList<String>semeistvoArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadSemeistvo"));
                ArrayList<String>rodArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadRod"));
                ArrayList<String>vidArrayListString  = ReadWriteT.readFile(PathT.getPathName("pathReadVid"));

                carstvo1 = CarstvoT.convertStringToCarstvo(carstvoArrayListString);
                carstvo2 = (ArrayList<CarstvoT>) ((ArrayList<?>) PodCarstvoT.convertStringToPodCarstvo(podCarstvoArrayListString));
                carstvo3 = (ArrayList<CarstvoT>) ((ArrayList<?>) TipT.convertStringToTip(tipArrayListString));
                carstvo4 = (ArrayList<CarstvoT>) ((ArrayList<?>) KlassT.convertStringToKlass(klassArrayListString));
                carstvo5 = (ArrayList<CarstvoT>) ((ArrayList<?>) PodKlassT.convertStringToPodKlass(podKlassArrayListString));
                carstvo6 = (ArrayList<CarstvoT>) ((ArrayList<?>) OtriydT.convertStringToOtriyd(otriydArrayListString));
                carstvo7 = (ArrayList<CarstvoT>) ((ArrayList<?>) SemeistvoT.convertStringToSemeistvo(semeistvoArrayListString));
                carstvo8 = (ArrayList<CarstvoT>) ((ArrayList<?>) RodT.convertStringToRod(rodArrayListString));
                carstvo9 = (ArrayList<CarstvoT>) ((ArrayList<?>) VidT.convertStringToVid(vidArrayListString));

                ClassificationT c1 = new ClassificationT(carstvo1);
                ClassificationT c2 = new ClassificationT(carstvo2);
                ClassificationT c3 = new ClassificationT(carstvo3);
                ClassificationT c4 = new ClassificationT(carstvo4);
                ClassificationT c5 = new ClassificationT(carstvo5);
                ClassificationT c6 = new ClassificationT(carstvo6);
                ClassificationT c7 = new ClassificationT(carstvo7);
                ClassificationT c8 = new ClassificationT(carstvo8);
                ClassificationT c9 = new ClassificationT(carstvo9);

                ArrayList<PodCarstvoT> carstvo22 =  (ArrayList<PodCarstvoT>) ((ArrayList<?>) carstvo2);
                ArrayList<TipT> carstvo33 =  (ArrayList<TipT>) ((ArrayList<?>) carstvo3);
                ArrayList<KlassT> carstvo44 =  (ArrayList<KlassT>) ((ArrayList<?>) carstvo4);
                ArrayList<PodKlassT> carstvo55 =  (ArrayList<PodKlassT>) ((ArrayList<?>) carstvo5);
                ArrayList<OtriydT> carstvo66 =  (ArrayList<OtriydT>) ((ArrayList<?>) carstvo6);
                ArrayList<SemeistvoT> carstvo77 =  (ArrayList<SemeistvoT>) ((ArrayList<?>) carstvo7);
                ArrayList<RodT> carstvo88 =  (ArrayList<RodT>) ((ArrayList<?>) carstvo8);
                ArrayList<VidT> carstvo99 =  (ArrayList<VidT>) ((ArrayList<?>) carstvo9); 
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
                if (l.equals("f")) {
                    while(checkF) {
                        n = inS1.inputString(MenuT.getMenuName("Find"));
                        if (n.equals("e")) { checkF = false; }
                        else {
                            if (n.equals("c")) {
                                ViewT.printClassification(c1);
                                String cfName = inS1.inputString(MenuT.getMenuName("CarstvoName"));
                                Map<String, CarstvoT> mapCarstvo = new HashMap<>();
                                mapCarstvo = CarstvoT.convertListCarstvo(carstvo1);
                                if (cfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    CarstvoT carstvo = mapCarstvo.get(cfName);
                                    // System.out.println("xxxxxx");
                                    if (carstvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(carstvo.getIdCarstvo(), carstvo.getNameCarstvo());
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                    }
                                }
                            }
                            else if (n.equals("pc")) {
                                ViewT.printClassification(c2);
                                String pcfName = inS1.inputString(MenuT.getMenuName("PodCarstvoNae"));
                                Map<String, PodCarstvoT> mapPodCarstvo = new HashMap<>();
                                mapPodCarstvo = PodCarstvoT.convertListPodCarstvo(carstvo22);
                                if (pcfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    PodCarstvoT podCarstvo = mapPodCarstvo.get(pcfName);
                                    if (podCarstvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(podCarstvo.getIdPodCarstvo(), podCarstvo.getNamePodCarstvo());
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                    }
                                }
                            }
                            else if (n.equals("t")) {
                                ViewT.printClassification(c3);
                                String tfName = inS1.inputString(MenuT.getMenuName("TipName"));
                                Map<String, TipT > mapTip  = new HashMap<>();
                                mapTip = TipT.convertListTip(carstvo33);
                                if (tfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    TipT tip  = mapTip .get(tfName);
                                    if (tip  == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(tip.getIdTip(), tip.getNameTip());
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                    }
                                }
                            }
                            else if (n.equals("k")) {
                                ViewT.printClassification(c4);
                                String kfName = inS1.inputString(MenuT.getMenuName("KlassName"));
                                Map<String, KlassT> mapKlass = new HashMap<>();
                                mapKlass = PodKlassT.convertListKlass(carstvo44);
                                if (kfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    KlassT klass = mapKlass.get(kfName);
                                    if ( klass  == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(klass.getIdKlass(), klass.getNameKlass() );
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                    }
                                }
                            }
                            else if (n.equals("pk")) {
                                ViewT.printClassification(c5);
                                String pkfName = inS1.inputString(MenuT.getMenuName("PodKlassName"));
                                Map<String, PodKlassT> mapPodKlass = new HashMap<>();
                                mapPodKlass = PodKlassT.convertListPodKlass(carstvo55);
                                if (pkfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    PodKlassT podKlass = mapPodKlass.get(pkfName);
                                    if ( podKlass  == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(podKlass.getIdPodKlass(), podKlass.getNamePodKlass() );
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        ViewT.printString(PodKlassT.FindNamePodKlass(carstvo55, vid));
                                    }
                                }
                            }
                            else if (n.equals("o")) {
                                ViewT.printClassification(c6);
                                String ofName = inS1.inputString(MenuT.getMenuName("OriydName"));
                                Map<String, OtriydT> mapOtriyd = new HashMap<>();
                                mapOtriyd = OtriydT.convertListOtriyd(carstvo66);
                                if (ofName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    OtriydT otriyd = mapOtriyd.get(ofName);
                                    if ( otriyd  == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(otriyd.getIdOtriyd(), otriyd.getNameOtriyd() );
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        ViewT.printString(PodKlassT.FindNamePodKlass(carstvo55, vid));
                                        ViewT.printString(OtriydT.FindNameOtriyd(carstvo66, vid));
                                    }
                                }
                            }
                            else if (n.equals("s")) {
                                ViewT.printClassification(c7);
                                String sfName = inS1.inputString(MenuT.getMenuName("SemeistvoName"));
                                Map<String, SemeistvoT> mapSemeistvo = new HashMap<>();
                                mapSemeistvo = SemeistvoT.convertListSemeistvo(carstvo77);
                                if (sfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    SemeistvoT semeistvo = mapSemeistvo.get(sfName);
                                    if (semeistvo  == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(semeistvo.getIdSemeistvo(), semeistvo.getNameSemeistvo() );
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        ViewT.printString(PodKlassT.FindNamePodKlass(carstvo55, vid));
                                        ViewT.printString(OtriydT.FindNameOtriyd(carstvo66, vid));
                                        ViewT.printString(SemeistvoT.FindNameSemeistvo(carstvo77, vid));
                                    }
                                }
                            }
                            else if (n.equals("r")) {
                                ViewT.printClassification(c8);
                                String rfName = inS1.inputString(MenuT.getMenuName("RodName"));
                                Map<String, RodT> mapRod = new HashMap<>();
                                mapRod = RodT.convertListRod(carstvo88);
                                if (rfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    RodT rod = mapRod.get(rfName);
                                    if (rod == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(rod.getIdRod(), rod.getNameRod() );
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        ViewT.printString(PodKlassT.FindNamePodKlass(carstvo55, vid));
                                        ViewT.printString(OtriydT.FindNameOtriyd(carstvo66, vid));
                                        ViewT.printString(SemeistvoT.FindNameSemeistvo(carstvo77, vid));
                                        ViewT.printString(RodT.FindNameRod(carstvo88, vid));
                                    }
                                }
                            }
                            else if (n.equals("v")) {
                                ViewT.printClassification(c9);
                                String vfName = inS1.inputString(MenuT.getMenuName("VidName"));
                                Map<String, VidT> mapVid = new HashMap<>();
                                mapVid = VidT.convertListVid(carstvo99);
                                if (vfName.equals("e")) {
                                    checkF = false;
                                }
                                else {
                                    VidT vid = mapVid.get(vfName);
                                    if (vid == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        ViewT.printString(PodKlassT.FindNamePodKlass(carstvo55, vid));
                                        ViewT.printString(OtriydT.FindNameOtriyd(carstvo66, vid));
                                        ViewT.printString(SemeistvoT.FindNameSemeistvo(carstvo77, vid));
                                        ViewT.printString(RodT.FindNameRod(carstvo88, vid));
                                        ViewT.printString(VidT.FindNameVid(carstvo99, vid));
                                    }
                                }
                            }
                            else {ViewT.printString(MenuT.getMenuName("Wrong"));} 
                        }
                    }
                }
                if (l.equals("c")) {
                    while(checkC) {
                        n = inS1.inputString(MenuT.getMenuName("Change"));
                        if (n.equals("e")) { checkC = false; }
                        else {
                            if (n.equals("c")) {
                                ViewT.printClassification(c1);
                                String cfName = inS1.inputString(MenuT.getMenuName("CarstvoName"));
                                Map<String, CarstvoT> mapCarstvo = new HashMap<>();
                                mapCarstvo = CarstvoT.convertListCarstvo(carstvo1);
                                if (cfName.equals("e")) {
                                    checkC = false;
                                }
                                else {
                                    CarstvoT carstvo = mapCarstvo.get(cfName);
                                    if (carstvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(carstvo.getIdCarstvo(), carstvo.getNameCarstvo());
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        id = carstvo.getIdCarstvo();
                                        nam = carstvo.getNameCarstvo();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCC) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadCarstvo"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadCarstvo"), newId, newNam);
                                                checkCC = false;
                                            }
                                            else if (c.equals("e")) checkCC = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("pc")) {
                                ViewT.printClassification(c2);
                                String pcfName = inS1.inputString(MenuT.getMenuName("PodCarstvoName"));
                                Map<String, PodCarstvoT> mapPodCarstvo = new HashMap<>();
                                mapPodCarstvo = PodCarstvoT.convertListPodCarstvo(carstvo22);
                                if (pcfName.equals("e")) checkC = false;
                                else {
                                    PodCarstvoT podCarstvo = mapPodCarstvo.get(pcfName);
                                    if (podCarstvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(podCarstvo.getIdPodCarstvo(), podCarstvo.getNamePodCarstvo());
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        id = podCarstvo.getIdPodCarstvo();
                                        nam = podCarstvo.getNamePodCarstvo();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCpC) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadPodCarstvo"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadPodCarstvo"), newId, newNam);
                                                checkCpC = false;
                                            }
                                            else if (c.equals("e")) checkCpC = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("t")) {
                                ViewT.printClassification(c3);
                                String tfName = inS1.inputString(MenuT.getMenuName("TipName"));
                                Map<String, TipT> mapTip  = new HashMap<>();
                                mapTip = TipT.convertListTip(carstvo33);
                                if (tfName.equals("e")) checkC = false;
                                else {
                                    TipT tip  = mapTip.get(tfName);
                                    if (tip == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(tip.getIdTip(), tip.getNameTip());
                                        ViewT.printString(TipT.FindNameTip(carstvo33, vid));
                                        id = tip.getIdTip();
                                        nam = tip.getNameTip();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCt) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCt = false;
                                            }
                                            else if (c.equals("e")) checkCt = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else if (n.equals("k")) {
                                ViewT.printClassification(c4);
                                String kfName = inS1.inputString(MenuT.getMenuName("KlassName"));
                                Map<String, KlassT> mapKlass = new HashMap<>();
                                mapKlass = PodKlassT.convertListKlass(carstvo44);
                                if (kfName.equals("e")) checkC = false;
                                else {
                                    KlassT klass = mapKlass.get(kfName);
                                    if (klass == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(klass.getIdKlass(), klass.getNameKlass() );
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        id = klass.getIdKlass();
                                        nam = klass.getNameKlass();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCk) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCk = false;
                                            }
                                            else if (c.equals("e")) checkCk = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("pk")) {
                                ViewT.printClassification(c5);
                                String pkfName = inS1.inputString(MenuT.getMenuName("PodKlassName"));
                                Map<String, PodKlassT> mapPodKlass = new HashMap<>();
                                mapPodKlass = PodKlassT.convertListPodKlass(carstvo55);
                                if (pkfName.equals("e")) checkC = false;
                                else {
                                    PodKlassT podKlass = mapPodKlass.get(pkfName);
                                    if (podKlass == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(podKlass.getIdPodKlass(), podKlass.getNamePodKlass() );
                                        ViewT.printString( PodKlassT.FindNamePodKlass(carstvo55, vid));
                                        id = podKlass.getIdPodKlass();
                                        nam = podKlass.getNamePodKlass();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCpK) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCpK = false;
                                            }
                                            else if (c.equals("e")) checkCpK = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else if (n.equals("o")) {
                                ViewT.printClassification(c6);
                                String ofName = inS1.inputString(MenuT.getMenuName("OriydName"));
                                Map<String, OtriydT> mapOtriyd = new HashMap<>();
                                mapOtriyd = OtriydT.convertListOtriyd(carstvo66);
                                if (ofName.equals("e")) checkC = false;
                                else {
                                    OtriydT otriyd = mapOtriyd.get(ofName);
                                    if (otriyd == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(otriyd.getIdOtriyd(), otriyd.getNameOtriyd() );
                                        ViewT.printString(OtriydT.FindNameOtriyd(carstvo66, vid));
                                        id = otriyd.getIdOtriyd();
                                        nam = otriyd.getNameOtriyd();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCo) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCo = false;
                                            }
                                            else if (c.equals("e")) checkCo = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("s")) {
                                ViewT.printClassification(c7);
                                String sfName = inS1.inputString(MenuT.getMenuName("SemeistvoName"));
                                Map<String, SemeistvoT> mapSemeistvo = new HashMap<>();
                                mapSemeistvo = SemeistvoT.convertListSemeistvo(carstvo77);
                                if (sfName.equals("e")) checkC = false;
                                else {
                                    SemeistvoT semeistvo = mapSemeistvo.get(sfName);
                                    if (semeistvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(semeistvo.getIdSemeistvo(), semeistvo.getNameSemeistvo() );
                                        ViewT.printString(SemeistvoT.FindNameSemeistvo(carstvo77, vid));
                                        id = semeistvo.getIdSemeistvo();
                                        nam = semeistvo.getNameSemeistvo();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCs) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCs = false;
                                            }
                                            else if (c.equals("e")) checkCs = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("r")) {
                                ViewT.printClassification(c8);
                                String rfName = inS1.inputString(MenuT.getMenuName("RodName"));
                                Map<String, RodT> mapRod = new HashMap<>();
                                mapRod = RodT.convertListRod(carstvo88);
                                if (rfName.equals("e")) checkC = false;
                                else {
                                    RodT rod = mapRod.get(rfName);
                                    if (rod == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(rod.getIdRod(), rod.getNameRod() );
                                        ViewT.printString(RodT.FindNameRod(carstvo88, vid));
                                        id = rod.getIdRod();
                                        nam = rod.getNameRod();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCr) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCr = false;
                                            }
                                            else if (c.equals("e")) checkCr = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else if (n.equals("v")) {
                                ViewT.printClassification(c9);
                                String vfName = inS1.inputString(MenuT.getMenuName("VidName"));
                                Map<String, VidT> mapVid = new HashMap<>();
                                mapVid = VidT.convertListVid(carstvo99);
                                if (vfName.equals("e")) checkC = false;
                                else {
                                    VidT vid = mapVid.get(vfName);
                                    if (vid == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        // Vid vid = mapVid.get(vfName);
                                        ViewT.printString(VidT.FindNameVid(carstvo99, vid));;
                                        id = vid.getIdVid();
                                        nam = vid.getNameVid();
                                        String newId = id;
                                        String newNam = nam;
                                        while(checkCv) {
                                            c = inS1.inputString(MenuT.getMenuName("ChangeMenu"));
                                            if (c.equals("se")) { 
                                                ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), newId, newNam);
                                                checkCv = false;
                                            }
                                            else if (c.equals("e")) checkCv = false;
                                            else {
                                                if (c.equals("i")) {
                                                    newId = inS1.inputString(MenuT.getMenuName("Id") + " (" + id + ")");
                                                }
                                                else if (c.equals("n")) {
                                                    newNam = inS1.inputString(MenuT.getMenuName("Name") + " (" + nam + ")" );
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else {ViewT.printString(MenuT.getMenuName("Wrong"));} 
                        }
                    }
                }
                if (l.equals("a")) {
                    while(checkA) {
                        n = inS1.inputString(MenuT.getMenuName("Add"));
                        if (n.equals("e")) { checkA = false; }
                        else {
                            if (n.equals("c")) {
                                ViewT.printClassification(c1);
                                while(checkAC) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAC = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Царство - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAC = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadCarstvo"), id, nam);
                                                checkAC = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("pc")) {
                                ViewT.printClassification(c2);
                                while(checkApC) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkApC = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Подцарство - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkApC = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadPodCarstvo"), id, nam);
                                                checkApC = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("t")) {
                                ViewT.printClassification(c3);
                                while(checkAt) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAt = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Тип - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAt = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadTip"), id, nam);
                                                checkAt = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("k")) {
                                ViewT.printClassification(c4);
                                while(checkAk) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAk = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Класс - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAk = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadKlass"), id, nam);
                                                checkAk = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("pk")) {
                                ViewT.printClassification(c5);
                                while(checkApK) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkApK = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Подкласс - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkApK = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadPodKlass"), id, nam);
                                                checkApK = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("o")) {
                                ViewT.printClassification(c6);
                                while(checkAo) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAo = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Отряд - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAo = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadOtriyd"), id, nam);
                                                checkAo = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("s")) {
                                ViewT.printClassification(c7);
                                while(checkAs) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAs = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Семейство - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAs = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadSemeistvo"), id, nam);
                                                checkAs = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("r")) {
                                ViewT.printClassification(c8);
                                while(checkAr) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAr = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Род - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAr = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadRod"), id, nam);
                                                checkAr = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }
                            }
                            else if (n.equals("v")) {
                                ViewT.printClassification(c9);
                                while(checkAv) {
                                    c = inS1.inputString(MenuT.getMenuName("AddMenu"));
                                    if (c.equals("e")) checkAv = false;
                                    else {
                                        if (c.equals("a")) {
                                            id = inS1.inputString(MenuT.getMenuName("Id"));
                                            nam = inS1.inputString(MenuT.getMenuName("Name"));
                                            ViewT.printString("Вид - " + id +".," + nam);
                                            c = inS1.inputString(MenuT.getMenuName("AddMenuSE"));
                                            if (c.equals("e")) checkAv = false;
                                            if (c.equals("se")) { 
                                                ReadWriteT.whriteFile(PathT.getPathName("pathReadVid"), id, nam);
                                                checkAv = false;
                                            }
                                        }
                                        else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                    }
                                }

                            }
                            else {ViewT.printString(MenuT.getMenuName("Wrong"));} 
                        }
                    }
                }
                if (l.equals("d")) {
                    while(checkD) {
                        n = inS1.inputString(MenuT.getMenuName("Delite"));
                        if (n.equals("e")) {checkD = false;}
                        else {
                            if (n.equals("c")) {
                                ViewT.printClassification(c1);
                                String cfName = inS1.inputString(MenuT.getMenuName("CarstvoName"));
                                Map<String, CarstvoT> mapCarstvo = new HashMap<>();
                                mapCarstvo = CarstvoT.convertListCarstvo(carstvo1);
                                if (cfName.equals("e")) {
                                    checkD = false;
                                }
                                else {
                                    CarstvoT carstvo = mapCarstvo.get(cfName);
                                    if (carstvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(carstvo.getIdCarstvo(), carstvo.getNameCarstvo());
                                        ViewT.printString(CarstvoT.FindNameCarstvo(carstvo1, vid));
                                        id = carstvo.getIdCarstvo();
                                        nam = carstvo.getNameCarstvo();
                                        while(checkDC) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDC = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadCarstvo"), id, nam);
                                                    checkDC = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("pc")) {
                                ViewT.printClassification(c2);
                                String pcfName = inS1.inputString(MenuT.getMenuName("PodCarstvoName"));
                                Map<String, PodCarstvoT> mapPodCarstvo = new HashMap<>();
                                mapPodCarstvo = PodCarstvoT.convertListPodCarstvo(carstvo22);
                                if (pcfName.equals("e")) {
                                    checkD = false;
                                }
                                else {
                                    PodCarstvoT podCarstvo = mapPodCarstvo.get(pcfName);
                                    if (podCarstvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(podCarstvo.getIdPodCarstvo(), podCarstvo.getNamePodCarstvo());
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        id = podCarstvo.getIdCarstvo();
                                        nam = podCarstvo.getNameCarstvo();
                                        while(checkDpC) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDpC = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadPodCarstvo"), id, nam);
                                                    checkDpC = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("t")) {
                                ViewT.printClassification(c3);
                                String tfName = inS1.inputString(MenuT.getMenuName("TipName"));
                                Map<String, TipT> mapTip  = new HashMap<>();
                                mapTip = TipT.convertListTip(carstvo33);
                                if (tfName.equals("e")) {
                                    checkD = false;
                                }
                                else {
                                    TipT tip = mapTip.get(tfName);
                                    if (tip == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(tip.getIdTip(), tip.getNameTip());
                                        ViewT.printString(PodCarstvoT.FindNamePodCarstvo(carstvo22, vid));
                                        id = tip.getIdTip();
                                        nam = tip.getNameTip();
                                        while(checkDt) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDt = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadTip"), id, nam);
                                                    checkDt = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("k")) {
                                ViewT.printClassification(c4);
                                String kfName = inS1.inputString(MenuT.getMenuName("KlassName"));
                                Map<String, KlassT> mapKlass = new HashMap<>();
                                mapKlass = PodKlassT.convertListKlass(carstvo44);
                                if (kfName.equals("e")) checkC = false;
                                else {
                                    KlassT klass = mapKlass.get(kfName);
                                    if (klass == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(klass.getIdKlass(), klass.getNameKlass() );
                                        ViewT.printString(KlassT.FindNameKlass(carstvo44, vid));
                                        id = klass.getIdKlass();
                                        nam = klass.getNameKlass();
                                        while(checkDk) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDk = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadKlass"), id, nam);
                                                    checkDk = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("pk")) {
                                ViewT.printClassification(c5);
                                String pkfName = inS1.inputString(MenuT.getMenuName("PodKlassName"));
                                Map<String, PodKlassT> mapPodKlass = new HashMap<>();
                                mapPodKlass = PodKlassT.convertListPodKlass(carstvo55);
                                if (pkfName.equals("e")) checkC = false;
                                else {
                                    PodKlassT podKlass = mapPodKlass.get(pkfName);
                                    if (podKlass == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(podKlass.getIdPodKlass(), podKlass.getNamePodKlass() );
                                        ViewT.printString( PodKlassT.FindNamePodKlass(carstvo55, vid));
                                        id = podKlass.getIdPodKlass();
                                        nam = podKlass.getNamePodKlass();
                                        while(checkDpK) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDpK = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadPodKlass"), id, nam);
                                                    checkDpK = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else if (n.equals("o")) {
                                ViewT.printClassification(c6);
                                String ofName = inS1.inputString(MenuT.getMenuName("OriydName"));
                                Map<String, OtriydT> mapOtriyd = new HashMap<>();
                                mapOtriyd = OtriydT.convertListOtriyd(carstvo66);
                                if (ofName.equals("e")) checkC = false;
                                else {
                                    OtriydT otriyd = mapOtriyd.get(ofName);
                                    if (otriyd == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(otriyd.getIdOtriyd(), otriyd.getNameOtriyd() );
                                        ViewT.printString(OtriydT.FindNameOtriyd(carstvo66, vid));
                                        id = otriyd.getIdOtriyd();
                                        nam = otriyd.getNameOtriyd();
                                        while(checkDo) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDo = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadOtriyd"), id, nam);
                                                    checkDo = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("s")) {
                                ViewT.printClassification(c7);
                                String sfName = inS1.inputString(MenuT.getMenuName("SemeistvoName"));
                                Map<String, SemeistvoT> mapSemeistvo = new HashMap<>();
                                mapSemeistvo = SemeistvoT.convertListSemeistvo(carstvo77);
                                if (sfName.equals("e")) checkC = false;
                                else {
                                    SemeistvoT semeistvo = mapSemeistvo.get(sfName);
                                    if (semeistvo == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(semeistvo.getIdSemeistvo(), semeistvo.getNameSemeistvo() );
                                        ViewT.printString(SemeistvoT.FindNameSemeistvo(carstvo77, vid));
                                        id = semeistvo.getIdSemeistvo();
                                        nam = semeistvo.getNameSemeistvo();
                                        while(checkDs) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDs = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadSemeistvo"), id, nam);
                                                    checkDs = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }
                            }
                            else if (n.equals("r")) {
                                ViewT.printClassification(c8);
                                String rfName = inS1.inputString(MenuT.getMenuName("RodName"));
                                Map<String, RodT> mapRod = new HashMap<>();
                                mapRod = RodT.convertListRod(carstvo88);
                                if (rfName.equals("e")) checkC = false;
                                else {
                                    RodT rod = mapRod.get(rfName);
                                    if (rod == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        VidT vid = new VidT(rod.getIdRod(), rod.getNameRod() );
                                        ViewT.printString(RodT.FindNameRod(carstvo88, vid));
                                        id = rod.getIdRod();
                                        nam = rod.getNameRod();
                                        while(checkDr) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDr = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadRod"), id, nam);
                                                    checkDr = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else if (n.equals("v")) {
                                ViewT.printClassification(c9);
                                String vfName = inS1.inputString(MenuT.getMenuName("VidName"));
                                Map<String, VidT> mapVid = new HashMap<>();
                                mapVid = VidT.convertListVid(carstvo99);
                                if (vfName.equals("e")) checkC = false;
                                else {
                                    VidT vid = mapVid.get(vfName);
                                    if (vid == null) { 
                                        ViewT.printString(MenuT.getMenuName("NF"));
                                    }
                                    else {
                                        // Vid vid = mapVid.get(vfName);
                                        ViewT.printString(VidT.FindNameVid(carstvo99, vid));;
                                        id = vid.getIdVid();
                                        nam = vid.getNameVid();
                                        while(checkDv) {
                                            c = inS1.inputString(MenuT.getMenuName("DeliteMenuDE"));
                                            if (c.equals("e")) checkDv = false;
                                            else {
                                                if (c.equals("de")) {
                                                    ReadWriteT.deliteString(PathT.getPathName("pathReadVid"), id, nam);
                                                    checkDv = false;
                                                }
                                                else {ViewT.printString(MenuT.getMenuName("Wrong"));}
                                            }
                                        }
                                    }
                                }

                            }
                            else {ViewT.printString(MenuT.getMenuName("Wrong"));} 
                        }
                    }
                }
            }
        }
    }
}
