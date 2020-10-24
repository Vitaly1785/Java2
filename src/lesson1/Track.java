package lesson1;

public class Track implements WallTrack{
    private int lengthTrack;

    public Track(int lengthTrack) {
        this.lengthTrack = lengthTrack;
    }

    public int getLengthTrack() {
        return lengthTrack;
    }

    public void setLengthTrack(int lengthTrack) {
        this.lengthTrack = lengthTrack;
    }

    @Override
    public void runJump(JumpRun j) {
        j.run(lengthTrack);
    }
}
