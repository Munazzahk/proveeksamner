package Ovelse1;

import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> tekstLinjer = new ArrayList<>();

    public void tilføj(String tekst) {
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke() {
        ArrayList<String> unikTekst = new ArrayList<>();

        for (String tekst : this.tekstLinjer) {
            if (!unikTekst.contains(tekst)) {
                unikTekst.add(tekst);
            }
        }

        return unikTekst.size();
    }
}
