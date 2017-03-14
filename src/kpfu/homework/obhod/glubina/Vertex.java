package kpfu.homework.obhod.glubina;

/**
 * Created by Tony on 14.03.2017.
 */
public class Vertex {

    private String label;
    protected boolean isVisited;

    protected Vertex(String label)
    {
        this.label = label;
        isVisited = false;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

}