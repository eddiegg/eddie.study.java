package eddie.study.java.patterns.Iterator;

/**
 * Created by user on 2017/3/16.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(2);
        bookShelf.appendBook(new Book("设计模式"));
        bookShelf.appendBook(new Book("小王子"));
        bookShelf.appendBook(new Book("面向对象思想"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}