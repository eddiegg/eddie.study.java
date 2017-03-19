package eddie.study.java.patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eddie on 2017/3/16.
 */
public class BookShelf implements Aggregate{
//    private Book[] books;
    private List<Book> books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
//        return books[index];
        return books.get(index);
    }

    public void appendBook(Book book){
//        this.books[last] = book;
        this.books.add(last,book);
        last++;
    }

    public int getLength(){
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
