package Ovelse6;

public class Bil {
    private Trailer trailer;
    private double vægt;

    public Bil(double vægt) {
        this.vægt = vægt;
    }

    public double totalVægt(Trailer trailer) {
        return this.vægt + trailer.getVægt();
    }

    public void tilkobelTrailer(Trailer trailer) {
        if (totalVægt(trailer) < 3500) {
            this.trailer = trailer;
            System.out.println("Trailer tilkoblet");
        } else {
            System.out.println("Vægten overskrider 3500 kg. Trailer ikke tilkoblet");
        }
    }

}
