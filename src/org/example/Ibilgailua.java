package org.example;

public class Ibilgailua {
    String modeloa;
    String marka;
    Integer prezioa;

    public Ibilgailua(String marka, String modeloa, Integer prezioa){
        this.marka = marka;
        this.modeloa = modeloa;
        this.prezioa = prezioa;
    }

    public void erakutsiDatuak(){
        System.out.println("Marka: " + marka + " Modeloa: " + modeloa + " Prezioa: " + prezioa);
    }
}
