package ch9p4.library.items;

public class Article extends LibraryItem implements Readable {
    public String[] mAuthors;
    public String mContent;

    public Article(String title, String[] authors) {
        super(title);
        mAuthors = authors;
        mContent = "";
    }

    public Article(String title, String[] authors, String content) {
        super(title);
        mAuthors = authors;
        mContent = content;
    }

    public String[] getAuthors() {
        return mAuthors;
    }

    public void read() {
        System.out.printf("Reading %s\n", mTitle);
    }

    public String getContent() {
        return mContent;
    }
}
