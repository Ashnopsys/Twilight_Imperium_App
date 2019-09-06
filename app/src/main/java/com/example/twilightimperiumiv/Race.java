package com.example.twilightimperiumiv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Race implements Serializable {
    private String name;
    private String imageName; //name of file within drawable
    private String loreFileName;

    public String getLoreFileName() {
        return loreFileName;
    }

    public String getName() {
        return name;
    }

    public String getImageName() {
        return imageName;
    }
    public Race() {

    }

    public Race (String name, String imageName, String loreFileName) {
        this.name = name;
        this.imageName = imageName;
        this.loreFileName = loreFileName;
    }



}
