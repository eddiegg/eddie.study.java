package eddie.study.java.patterns.FactoryMethod.toy;

import eddie.study.java.patterns.FactoryMethod.framework.Product;

/**
 * Created by eddie on 2017/3/18.
 */
public class IDCard extends Product{
    private String owner;

    IDCard(String owner) {       //default构造函数只有同包(一模一样的路径，不包含上下层包)能访问
        System.out.println("制作"+owner+"的身份证");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的身份证");
    }

    public String getOwner(){
        return owner;
    }
}
