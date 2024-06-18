package Ovelse14;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Image image = new Image("Hej.jpg", 200, 70);

        System.out.println(image.isKnownFileType());
        System.out.println(image.isLandscape());
        System.out.println(image.isPotrait());
    }
}
