package Ovelse9;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        SataDrive drive1 = new SataDrive("Hej");
        SataDrive drive2 = new SataDrive("Nej");
        SataDrive drive3 = new SataDrive("Måske");
        SataDrive drive4 = new SataDrive("Ja");
        SataDrive drive5 = new SataDrive("Test");

        MotherBoard motherBoard = new MotherBoard();

        motherBoard.tilkobel(drive1);
        motherBoard.tilkobel(drive2);
        motherBoard.tilkobel(drive3);
        motherBoard.tilkobel(drive4);
        motherBoard.tilkobel(drive5);
        motherBoard.tilkobletDrives();

    }
}
