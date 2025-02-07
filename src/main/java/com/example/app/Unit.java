package com.example.app;

public class Unit {

    private final String name;
    private Unit[] possiblePartners;

    public Unit(String name, Unit[] possibles)
    {
        this.name = name;
        this.possiblePartners = possibles;
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
}
