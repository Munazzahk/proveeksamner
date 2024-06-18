package Ovelse3;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    ArrayList<Integer> listAfAntalØjne = new ArrayList<>();

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
    }

    public int ryst() {
        listAfAntalØjne.clear();
        int samletAntalØjne = 0;
        Random random = new Random();

        for (int i = 0; i < this.antalTerninger; i++) {
            int øjneForTerningen = random.nextInt(6) + 1;
            listAfAntalØjne.add(øjneForTerningen);
            samletAntalØjne += øjneForTerningen;
        }

        return samletAntalØjne;
    }

    public void se() {
        for (int terning : listAfAntalØjne) {
            System.out.println(terning);
        }
    }
}
