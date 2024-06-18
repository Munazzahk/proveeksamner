package Ovelse9;

import java.util.ArrayList;

public class MotherBoard {
    private ArrayList<SataDrive> listeAfTilkoblet = new ArrayList<>();


    public void tilkobletDrives() {
        for (SataDrive tekst : listeAfTilkoblet) {
            System.out.println("-" + tekst.getName());
        }
    }

    public void tilkobel(SataDrive sataDrive) {
        if (listeAfTilkoblet.size() < 4) {
            listeAfTilkoblet.add(sataDrive);
            System.out.println("Tilkoblet Mother Boardet");
        } else {
            System.out.println("Der er ikke flere pladser i dette Mother Board");
        }
    }


}
