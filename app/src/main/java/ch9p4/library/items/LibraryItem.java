package ch9p4.library.items;

import java.util.function.LongSupplier;

public abstract class LibraryItem {
    private static long sNextID = 0;
    protected static LongSupplier sIDSupplier = () -> { return sNextID++; };
    
    protected final String mTitle;
    protected final long mID;
    
    public LibraryItem(String title) {
        mTitle = title;
        mID = sIDSupplier.getAsLong();
    }

    public String getTitle() {
        return mTitle;
    }

    public long getID() {
        return mID;
    }
}
