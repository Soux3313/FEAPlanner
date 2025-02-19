package com.example.app;

import javafx.scene.image.Image;

public class Child extends Unit{
    private final Unit rootParent;
    private Unit parent;
    public Child(String name, Unit parent) {
        super(name);
        this.rootParent = parent;
    }
    public Child(String name, Image image, Unit parent) {
        super(name, image);
        this.rootParent = parent;
    }

    public Unit getRootParent() {
        return rootParent;
    }

    public void setParent(Unit parent) {
        this.parent = parent;
    }

    public Unit getParent() {
        return parent;
    }
}
