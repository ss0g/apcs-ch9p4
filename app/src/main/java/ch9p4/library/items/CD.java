package ch9p4.library.items;

public class CD extends LibraryItem implements Playable {
    private final double mRuntimeSeconds;
    
    public CD(String title) {
        super(title);
        mRuntimeSeconds = 0;
    }

    public CD(String title, double runtimeSeconds) {
        super(title);
        mRuntimeSeconds = runtimeSeconds;
    }

    public void play() {
        System.out.printf("Listening to %s\n", mTitle);
    }

    public double getRuntimeSeconds() {
        return mRuntimeSeconds;
    }
}
