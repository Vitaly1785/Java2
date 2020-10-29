package lesson1;

public class Cat implements JumpRun {
    String name;
    private int maxRun;
    private int maxJump;
    private boolean onDistance;


    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onDistance = true;
    }

    @Override
    public void jump(int heightWall) {
        if(maxJump >= heightWall){
            System.out.println("Кот " + name + " перепрыгнул стену");
        } else{
            System.out.println("Кот " + name + " не смог перепрыгнуть стену");
            onDistance = false;
        }

    }

    @Override
    public void run(int lengthTrack) {
        if(maxRun >= lengthTrack){
            System.out.println("Кот " + name + " пробежал дорожку");
        } else{
            System.out.println("Кот " + name + " не смог пробежать");
            onDistance = false;
        }
    }

    @Override
    public boolean jumpRun() {
        return onDistance;
    }
}
