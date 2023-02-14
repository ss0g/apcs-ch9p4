package ch9p4.library;

import ch9p4.library.items.LibraryItem;

public class Library {
    private LibraryItem[] mItems;

    public Library() {}

    public Library(LibraryItem... items) {
        mItems = items;
    }

    public LibraryItem getItem(int index) {
        try {
            return mItems[index];
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        return null;
    }

    public LibraryItem getItemByID(int ID) {
        for (LibraryItem i : mItems) {
            if (i.getID() == ID) {
                return i;
            }
        }
        return null;
    }
}
