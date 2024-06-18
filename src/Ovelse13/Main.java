package Ovelse13;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        JuleGave juleGave = new JuleGave();
        System.out.println(juleGave.getDoesRattle());
        System.out.println(juleGave.getIsRectangular());
        System.out.println(juleGave.getIsSoft());
        System.out.println(juleGave.couldBeLego());
    }
}
