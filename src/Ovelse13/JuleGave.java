package Ovelse13;

import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    Random random = new Random();

    public JuleGave() {
        this.isSoft = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
    }

    public boolean getDoesRattle() {
        return doesRattle;
    }

    public boolean getIsRectangular() {
        return isRectangular;
    }

    public boolean getIsSoft() {
        return isSoft;
    }

    public boolean couldBeLego() {
        if (isSoft == false && isRectangular == true && doesRattle == true) {
            return true;
        }
        return false;
    }

}
