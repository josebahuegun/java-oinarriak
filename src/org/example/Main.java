package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    void main() {
        Ibilgailua ibilgailua = new Ibilgailua("Seat", "Leon", 2000);

        ibilgailua.erakutsiDatuak();
        ibilgailua.setMarka("Tonto");
        ibilgailua.erakutsiDatuak();

        kotxea kotxea = new kotxea("joseba", "huegun", 4000);
        kotxea.erakutsiDatuak();

        Motoa motoa = new Motoa("Honda", "CBR", 8000, 600, "Kirol", 2);
        motoa.erakutsidatuak();
    }
}

