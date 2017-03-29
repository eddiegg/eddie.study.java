package eddie.study.java.OOConcepts;

/**
 * Created by eddie on 2017/3/17.
 */

class Father{
    int age = 34;

    public int getAge() {
        return age;
    }
}

class Child extends Father{
    int age = 4;

    @Override
    public int getAge() {
        return age;
    }
    public void childPrint(){
        System.out.println("I am son");
    }
}
public class FatherAndChild {

    public static void main(String[] args) {
        Father f = new Child();
        System.out.println(f.age);      //访问变量看申明类型
        System.out.println(f.getAge());  //访问方法看实际对象类型
        Child c = new Child();
        Father n = c;                   //n引用c对象，只有一个c对象
        System.out.println(n.age);      //访问变量看申明，n申明为Father类型
        System.out.println(n.getAge());   //访问方法看实际对象类型
        System.out.println(c.age);
        System.out.println(c.getAge());
    }

}
