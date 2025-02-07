package com.example.app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.util.*;

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

        Group root = new Group();
        Scene scene = new Scene(root);

        addParents(root);

        stage.setTitle("FE:A Inheritance Planner");
        stage.setWidth(1200);
        stage.setHeight(900);
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }

    public void addParents(Group root)
    {
        FlowPane parentBoxes = new FlowPane();
        parentBoxes.setHgap(10); // Horizontal spacing
        parentBoxes.setVgap(10); // Vertical spacing
        parentBoxes.setPrefWrapLength(1100); // Wraps to new line when reaching this width
        parentBoxes.setLayoutY(10); // Position near the top

        // Store selected values to prevent duplicates
        Set<String> selectedUnits = new HashSet<>();

        // Map dropdowns to track previous selections
        HashMap<ComboBox<String>, String> previousSelections = new HashMap<>();

        List<Unit> parents = List.of(fRobin, mRobin, chrom, lissa, sully, miriel,
                sumia, maribelle, cordelia, nowi, tharja,
                olivia, cherche, panne);


        for (Unit parent : parents) {
            Text parentName = new Text(parent.getName());
            parentName.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

            String[] partners = new String[parent.getPossiblePartners().length];
            for(int i=0; i < parent.getPossiblePartners().length;i++)
            {
                partners[i] = parent.getPossiblePartners()[i].getName();
            }

            // Dropdown menu (ComboBox)
            ComboBox<String> dropdown = new ComboBox<>();
            dropdown.getItems().addAll(partners); // Replace with actual options
            dropdown.setPromptText("none");

            // Store the dropdown's previous value
            previousSelections.put(dropdown, "None");

            Rectangle border = new Rectangle(80, 40); // width, height of each box
            border.setFill(Color.TRANSPARENT);
            border.setStroke(Color.BLACK);

            StackPane box = new StackPane(border, parentName);

            // VBox to stack elements (name on top, dropdown below)
            VBox parentContainer = new VBox(5, box, dropdown); // 5px spacing between items
            parentContainer.setStyle("-fx-alignment: center;");

            parentBoxes.getChildren().add(parentContainer);
        }

        root.getChildren().add(parentBoxes);
    }



}