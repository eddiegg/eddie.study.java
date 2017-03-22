package eddie.study.java.patterns.Builder;

/**
 * Created by user on 2017/3/22.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void cons(){
        builder.makeFoundation("suzhou");
        builder.makeWalls(new String[]{"North","West","East"});
        builder.makeRoof("tranditional");
        builder.decorate();
    }
}
