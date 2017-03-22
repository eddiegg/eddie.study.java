package eddie.study.java.patterns.Builder;

/**
 * Created by user on 2017/3/22.
 */
public abstract class Builder {
    protected abstract void makeFoundation(String place);
    protected abstract void makeWalls(String[] str);
    protected abstract void makeRoof(String style);
    protected abstract void decorate();
}
