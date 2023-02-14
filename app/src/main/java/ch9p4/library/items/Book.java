package ch9p4.library.items;

public class Book extends LibraryItem implements Readable {
    private final String mAuthor;
    private final String mContent;
    
    public Book(String title, String author) {
        super(title);
        mAuthor = author;
        mContent = "";
    }

    public Book(String title, String author, String content) {
        super(title);
        mAuthor = author;
        mContent = content;
    }

    public String getAuthor() {
        return mAuthor;
    }
    
    public String getContent() {
        return mContent;
    }

    public void read() {
        System.out.printf("Reading \"%s\" by %s\n", mTitle, mAuthor);
    }
}
