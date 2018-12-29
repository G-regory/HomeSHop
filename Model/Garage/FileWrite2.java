package com.carriel.souleyman.Model.Garage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite2 implements Writer2 {
    String contenu;
    String fileName;
    Path facture;

    public FileWrite2(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void start() {
         facture = Paths.get(fileName);
        contenu="";
    }

    @Override
    public void writeLine(String line) {
        contenu+=line+"\n";
    }

    @Override
    public void stop() {
        try {
            Files.write(facture, contenu.getBytes() );
        } catch (IOException e) {
            System.out.println("erreur");;
        }

    }

}
