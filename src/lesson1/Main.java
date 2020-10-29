package lesson1;

public class Main {
    public static void main(String[] args) {
        JumpRun[] jumprunners = {
                new Cat("Marsik",10,9),
                new Human("John",5,8),
                new Robot("Fedor",3,4)
        };
        WallTrack[] wallTracks = {
          new Wall(5),
          new Track(4),
          new Track(3),
          new Wall(6)
        };

        for (JumpRun j : jumprunners) {
            for (WallTrack wallTrack : wallTracks) {
                wallTrack.runJump(j);
                if(!j.jumpRun()){
                    System.out.println("Участник выбыл");
                    break;
                }
            }
        }
    }
}
