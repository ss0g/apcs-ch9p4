package ch9p4.library.items;

public class Video extends LibraryItem implements Playable {
    public final double mRuntimeSeconds;
    
    public Video(String title) {
        super(title);
        mRuntimeSeconds = 0;
    }

    public Video(String title, double runtimeSeconds) {
        super(title);
        mRuntimeSeconds = runtimeSeconds;
    }

    public void play() {
        System.out.printf("Watching %s\n", mTitle);
    }

    public double getRuntimeSeconds() {
        return mRuntimeSeconds;
    }
}
