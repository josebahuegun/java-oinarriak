package org.example;

public class Motoa extends Ibilgailua {

    private Integer zilindrada;
    private String mota;
    private Integer gurpilak;

    public Motoa(String marka, String modeloa, Integer prezioa,
                 Integer zilindrada, String mota, Integer gurpilak) {

        super(marka, modeloa, prezioa);

        this.zilindrada = zilindrada;
        this.mota = mota;
        this.gurpilak = gurpilak;
    }
    public void erakutsidatuak(){
        System.out.println("Marka: " + getMarka() + "Modeloa: " + getModeloa() + "Prezioa: " + getPrezioa() + "Zilindrada: " + getZilindrada() + "Mota: " + getMota() + "Gurpil mota: " + getGurpilak());
    }

    public Integer getZilindrada() {
        return zilindrada;
    }

    public String getMota() {
        return mota;
    }

    public Integer getGurpilak() {
        return gurpilak;
    }

    public void setZilindrada(Integer zilindrada) {
        this.zilindrada = zilindrada;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setGurpilak(Integer gurpilak) {
        this.gurpilak = gurpilak;
    }
}