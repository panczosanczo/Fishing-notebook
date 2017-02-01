package sample;

/**
 * Created by xxx on 08/01/2017.
 */
public class Trophy {

    private int lenghtFish;
    private String typeFish;
    private boolean zdjecie;

    public Trophy() {

    }

    public Trophy(int lenghtFish, String typeFish, boolean zdjecie) {
        this.lenghtFish = lenghtFish;
        this.typeFish = typeFish;
        this.zdjecie = zdjecie;
    }

    public int getLenghtFish() {
        return lenghtFish;
    }

    public void setLenghtFish(int lenghtFish) {
        this.lenghtFish = lenghtFish;
    }

    public String getTypeFish() {
        return typeFish;
    }

    public void setTypeFish(String typeFish) {
        this.typeFish = typeFish;
    }

    public boolean isZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(boolean zdjecie) {
        this.zdjecie = zdjecie;
    }
}
