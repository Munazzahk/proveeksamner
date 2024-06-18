package Ovelse14;

public class Image {
    private String filename;
    private int height;
    private int width;

    public Image(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType() {
        if (filename.endsWith(".jpg") ||
                filename.endsWith(".png") ||
                filename.endsWith(".gif") ||
                filename.endsWith(".jpeg") ||
                filename.endsWith(".webp") ||
                filename.endsWith(".bmp")) {
            return true;
        }
        return false;
    }

    public boolean isPotrait() {
        if (height > width) {
            return true;
        }
        return false;
    }

    public boolean isLandscape() {
        if (height < width) {
            return true;
        }
        return false;
    }
}
