package olive;

/**
 * Created by mostafa on 25/12/15.
 */
public class Olive {

    private String oliveName;
    private long oliveColor;


    public Olive() {
    }

    public Olive(String oliveName) {
        this.oliveName = oliveName;
    }

    public Olive(String oliveName, long color) {
        this(oliveName);
        this.oliveColor = color;
    }


    public String getOliveName() {
        return oliveName;
    }

    public void setOliveName(String oliveName) {
        this.oliveName = oliveName;
    }

    public long getOliveColor() {
        return oliveColor;
    }

    public void setOliveColor(int oliveColor) {
        this.oliveColor = oliveColor;
    }

}
