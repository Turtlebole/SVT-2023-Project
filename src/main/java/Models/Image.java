package Models;

public class Image {
    private String path;

    public Image() {
    }

    public Image(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Image{" +
                "path='" + path + '\'' +
                '}';
    }
}
