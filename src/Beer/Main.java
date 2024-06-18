package Beer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        ArrayList<Beer> beers = new ArrayList<>();

        Beer beer1 = new Beer("Lara", 32, 103.8);
        Beer beer2 = new Beer("Sara", 12, 139);
        Beer beer3 = new Beer("Lona", 13, 134);

        beers.add(beer1);
        beers.add(beer2);
        beers.add(beer3);

        System.out.printf("%.2f", averagePrice(beers));

    }

    private double averagePrice(ArrayList<Beer> beers) {
        double totalPrice = 0;
        for (Beer beer : beers) {
            totalPrice += beer.getPrice();
        }

        return totalPrice/beers.size();
    }


}
