package eddie.study.java.patterns.AbstractFactory.factory;

/**
 * Created by user on 2017/3/22.
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
