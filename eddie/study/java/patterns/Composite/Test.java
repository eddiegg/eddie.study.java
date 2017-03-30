package eddie.study.java.patterns.Composite;

import eddie.study.java.patterns.Builder.Director;

/**
 * Created by user on 2017/3/30.
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Create root entry");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 5000));

            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries");
            Directory eddie = new Directory("eddie");
            usrdir.add(eddie);
            eddie.add(new File("hi.txt", 100));
            eddie.add(new File("test.java", 200));
            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }

    }
}
