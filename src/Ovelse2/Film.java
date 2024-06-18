package Ovelse2;

import java.time.LocalDate;
import java.time.Year;

public class Film {
    private String filmTitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmTitel, int udgivelsesår) {
        this.filmTitel = filmTitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmTitel) {
        this.filmTitel = filmTitel;
        this.udgivelsesår = Year.now().getValue();
    }

    public void tilføjProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        String producer = "Ingen Producer";

        if (this.producer != null) {
            producer = this.producer.getName();
        }

        return "Film[" + filmTitel + "," + udgivelsesår + "," + producer + "]";

    }
}
