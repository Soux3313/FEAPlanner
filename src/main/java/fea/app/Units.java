package fea.app;

public class Units {
    //Initialize fea.src.Units
        //Root Parents
            public static Unit fRobin = new Unit("Robin");
            public static Unit mRobin = new Unit("Robin");
            public static Unit chrom = new Unit("Chrom");
            public static Unit lissa = new Unit("Lissa");
            public static Unit sully = new Unit("Sully");
            public static Unit miriel = new Unit("Miriel");
            public static Unit sumia = new Unit("Sumia");
            public static Unit maribelle = new Unit("Maribelle");
            public static Unit cordelia = new Unit("Cordelia");
            public static Unit nowi = new Unit("Nowi");
            public static Unit tharja = new Unit("Tharja");
            public static Unit olivia = new Unit("Olivia");
            public static Unit cherche = new Unit("Cherche");
            public static Unit panne = new Unit("Panne");
        //Fathers
            public static Unit frederick = new Unit("Frederick");
            public static Unit virion = new Unit("Virion");
            public static Unit stahl = new Unit("Stahl");
            public static Unit vaike = new Unit("Vaike");
            public static Unit kellam = new Unit("Kellam");
            public static Unit lonqu = new Unit("Lon'Qu");
            public static Unit ricken = new Unit("Ricken");
            public static Unit gaius = new Unit("Gaius");
            public static Unit gregor = new Unit("Gregor");
            public static Unit libra = new Unit("Libra");
            public static Unit henry = new Unit("Henry");
            public static Unit donnel = new Unit("Donnel");
        //Children
            public  static Unit fMorgan = new Child("Morgan", mRobin);
            public static Unit mMorgan = new Child("Morgan", fRobin);
            public static Unit lucina = new Child("Lucina", chrom);
            public static Unit owain = new Child("Owain", lissa);
            public static Unit kjelle = new Child("Kjelle", sully);
            public static Unit laurent = new Child("Laurent", miriel);
            public static Unit cynthia = new Child("Cynthia", sumia);
            public static Unit brady = new Child("Brady", maribelle);
            public static Unit severa = new Child("Severa", cordelia);
            public static Unit nah = new Child("Nah", nowi);
            public static Unit noire = new Child("Noire", tharja);
            public static Unit inigo = new Child("Inigo", olivia);
            public static Unit gerome = new Child("Gerome", cherche);
            public static Unit yarne = new Child("Yarne", panne);
        //Extras
            public static Unit sayri = new Unit("Say'Ri");
            public static Unit basilio = new Unit("Basilio");
            public static Unit flavia = new Unit("Flavia");
            public static Unit anna = new Unit("Anna");
            public static Unit tiki = new Unit("Tiki");
        //SpotPass
            public static Unit gangrel = new Unit("Gangrel");
            public static Unit walhart = new Unit("Walhart");
            public static Unit emmeryn = new Unit("Emmeryn");
            public static Unit yenfay = new Unit("Yen'fay");
            public static Unit aversa = new Unit("Aversa");
            public static Unit priam = new Unit("Priam");

    public static void initializePartners()
    {

        //Set Possible Partners
        Unit[] fRobins = {
                chrom, frederick, virion, vaike, stahl, kellam,
                lonqu, ricken, gaius, gregor, libra, henry,
                basilio, donnel, owain, inigo, brady, gerome,
                yarne, laurent, gangrel, walhart, yenfay, priam
        };
        fRobin.setPossiblePartners(fRobins);

        Unit[] mRobins = {
                lissa, sully, miriel, sumia, maribelle, panne,
                cordelia, nowi, tharja, olivia, cherche, lucina,
                sayri, flavia, anna, kjelle, cynthia, severa, noire,
                nah, tiki, emmeryn, aversa
        };
        mRobin.setPossiblePartners(mRobins);

        Unit[] chroms = {fRobin, sully, sumia, maribelle, olivia};
        chrom.setPossiblePartners(chroms);

        Unit[] lissas = {
                mRobin, frederick, virion, vaike, stahl,
                kellam, lonqu, ricken, gaius, gregor, libra,
                henry, donnel
        };
        lissa.setPossiblePartners(lissas);

        Unit[] generic = {
                mRobin, frederick, virion, vaike, stahl, kellam,
                lonqu, ricken, gaius, gregor, libra, henry, donnel
        };
        Unit[] genericChrom = {
                mRobin, chrom, frederick, virion, vaike, stahl, kellam,
                lonqu, ricken, gaius, gregor, libra, henry, donnel
        };
        sully.setPossiblePartners(genericChrom);
        miriel.setPossiblePartners(generic);
        maribelle.setPossiblePartners(genericChrom);
        panne.setPossiblePartners(generic);
        cordelia.setPossiblePartners(generic);
        nowi.setPossiblePartners(generic);
        tharja.setPossiblePartners(generic);
        olivia.setPossiblePartners(genericChrom);
        cherche.setPossiblePartners(generic);

        Unit[] sumias = {
                mRobin, chrom, frederick, gaius, henry
        };

        sumia.setPossiblePartners(sumias);
    }
}
