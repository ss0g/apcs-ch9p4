package ch9p4.library.items;

public class Magazine extends LibraryItem implements Readable {
    private final int mIssueNumber;
    private final String mContent;
    
    public Magazine(String title, int issueNumber) {
        super(title);
        mIssueNumber = issueNumber;
        mContent = "";
    }

    public Magazine(String title, int issueNumber, String content) {
        super(title);
        mIssueNumber = issueNumber;
        mContent = content;
    }

    public int getIssueNumber() {
        return mIssueNumber;
    }

    public void read() {
        System.out.printf("Reading %s issue %d\n", mTitle, mIssueNumber);
    }

    public String getContent() {
        return mContent;
    }
}
