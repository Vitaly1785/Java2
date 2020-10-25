package lesson1;

public class Robot implements JumpRun {
    String name;
    private int maxRun;
    private int maxJump;
    private boolean onDistance;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onDistance = true;
    }

    @Override
    public void jump(int heightWall) {
        if(maxJump >= heightWall){
            System.out.println("Робот " + name + " перепрыгнул стену");
        } else{
            System.out.println("Робот " + name + " не смог перепрыгнуть стену");
            onDistance = false;
        }
    }

    @Override
    public void run(int lengthTrack) {
        if(maxRun >= lengthTrack){
            System.out.println("Робот " + name + " пробежал дорожку номер");
        } else{
            System.out.println("Робот " + name + " не смог пробежать дорожку");
            onDistance = false;
        }
    }

    @Override
    public boolean jumpRun() {
        return onDistance;
    }
}
