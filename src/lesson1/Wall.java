package lesson1;

public class Wall implements WallTrack{
    private int heightWall;


    public int getHeightWall() {
        return heightWall;
    }

    public void setHeightWall(int heightWall) {
        this.heightWall = heightWall;
    }

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public void runJump(JumpRun j) {
        j.jump(heightWall);
    }
}
