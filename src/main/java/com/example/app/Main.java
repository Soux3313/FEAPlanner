package com.example.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    //Initialize Units

    //Root Parents
    static Unit fRobin = new Unit("Robin");
    static Unit mRobin = new Unit("Robin");
    static Unit chrom = new Unit("Chrom");
    static Unit lissa = new Unit("Lissa");
    static Unit sully = new Unit("Sully");
    static Unit miriel = new Unit("Miriel");
    static Unit sumia = new Unit("Sumia");
    static Unit maribelle = new Unit("Maribelle");
    static Unit cordelia = new Unit("Cordelia");
    static Unit nowi = new Unit("Nowi");
    static Unit tharja = new Unit("Tharja");
    static Unit olivia = new Unit("Olivia");
    static Unit cherche = new Unit("Cherche");
    static Unit panne = new Unit("Panne");

    //Fathers
    static Unit frederick = new Unit("Frederick");
    static Unit virion = new Unit("Virion");
    static Unit stahl = new Unit("Stahl");
    static Unit vaike = new Unit("Vaike");
    static Unit kellam = new Unit("Kellam");
    static Unit lonqu = new Unit("Lon'Qu");
    static Unit ricken = new Unit("Ricken");
    static Unit gaius = new Unit("Gaius");
    static Unit gregor = new Unit("Gregor");
    static Unit libra = new Unit("Libra");
    static Unit henry = new Unit("Henry");
    static Unit donnel = new Unit("Donnel");

    //Children
    static Unit fMorgan = new Child("Morgan", mRobin);
    static Unit mMorgan = new Child("Morgan", fRobin);
    static Unit lucina = new Child("Lucina", chrom);
    static Unit owain = new Child("Owain", lissa);
    static Unit kjelle = new Child("Kjelle", sully);
    static Unit laurent = new Child("Laurent", miriel);
    static Unit cynthia = new Child("Cynthia", sumia);
    static Unit brady = new Child("Brady", maribelle);
    static Unit severa = new Child("Severa", cordelia);
    static Unit nah = new Child("Nah", nowi);
    static Unit noire = new Child("Noire", tharja);
    static Unit inigo = new Child("Inigo", olivia);
    static Unit gerome = new Child("Gerome", cherche);
    static Unit yarne = new Child("Yarne", panne);

    //Extras
    static Unit sayri = new Unit("Say'Ri");
    static Unit basilio = new Unit("Basilio");
    static Unit flavia = new Unit("Flavia");
    static Unit anna = new Unit("Anna");
    static Unit tiki = new Unit("Tiki");

    //SpotPass
    static Unit gangrel = new Unit("Gangrel");
    static Unit walhart = new Unit("Walhart");
    static Unit emmeryn = new Unit("Emmeryn");
    static Unit yenfay = new Unit("Yen'fay");
    static Unit aversa = new Unit("Aversa");
    static Unit priam = new Unit("Priam");

    public static void main(String[] args) {

        initializePartners();

        launch(args);
    }

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

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        Scene scene = new Scene(root);



        stage.setTitle("FE:A Inheritance Planner");

        stage.setScene(scene);
        stage.show();
    }

    public void addParents(Group root)
    {

    }



}