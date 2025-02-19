package fea.app;

import javafx.scene.image.Image;

public class Unit {

    private final String name;
    private Image portrait;
    private Unit[] possiblePartners;

    public Unit(String name,  Unit[] possibles)
    {
        this.name = name;
        this.possiblePartners = possibles;
    }

    public Unit(String name, Image portrait)
    {
        this.name = name;
        this.portrait = portrait;
    }
    public Unit(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Unit[] getPossiblePartners() {
        return possiblePartners;
    }

    public void setPossiblePartners(Unit[] possiblePartners) {
        this.possiblePartners = possiblePartners;
    }

    public Image getPortrait() {
        return portrait;
    }

    public void setPortrait(Image portrait) {
        this.portrait = portrait;
    }
}
