package org.example;

import java.util.ArrayList;
import java.util.List;

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

        Elektrikoa[] elektrikoa = {
                new KamioiElektrikoa("Tesla", "Model X", 8)
        };

        List<Elektrikoa> elektrikoaList = new ArrayList<>();
        elektrikoaList.add(new KamioiElektrikoa("Tesla", "MODEL Y", 2020));

        elektrikoaList.get(0).kargatu();

        System.out.println("Ibilgailu kopurua: " + Ibilgailua.getKopurua());
    }
}

