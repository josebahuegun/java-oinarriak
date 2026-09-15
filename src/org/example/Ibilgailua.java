package org.example;

public class Ibilgailua {

    private static int kopurua = 0;

    private String modeloa;
    private String marka;
    private Integer prezioa;


    public Ibilgailua(String marka, String modeloa, Integer prezioa){
        this.marka = marka;
        this.modeloa = modeloa;
        this.prezioa = prezioa;

        kopurua++;
    }

    public static int getKopurua(){
        return kopurua;
    }

    public void erakutsiDatuak(){
        System.out.println("Marka: " + marka + " Modeloa: " + modeloa + " Prezioa: " + prezioa);
    }

    public String getModeloa() {
        return modeloa;
    }

    public void setModeloa(String modeloa) {
        this.modeloa = modeloa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(Integer prezioa) {
        if (prezioa > 0){
            this.prezioa = prezioa;
        }
    }
    public void mugitu(){
        System.out.println("KamioiElektrikoa mugitzen ari da");
    }
}
