package eddie.study.java.patterns.Builder;

/**
 * Created by user on 2017/3/22.
 */
public class MyHouse extends Builder {
    @Override
    public void makeFoundation(String place) {
        System.out.println("选址："+place+" 构建地基");
    }

    @Override
    public void makeWalls(String[] str) {
        System.out.print("建筑墙壁: ");
        for (String st: str ) {
            System.out.print(st+ " ");
        }
        System.out.println();
    }

    @Override
    public void makeRoof(String style) {
        System.out.println(style+"样式的屋顶建好了");

    }

    @Override
    public void decorate() {
        System.out.println("装修完毕，等待入住");
    }
}
