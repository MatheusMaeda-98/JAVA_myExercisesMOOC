import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                bird.observation();
                return true;
            }
        }

        return false;
    }

    public void add(String name, String nameInLatin) {
        this.birds.add(new Bird(name, nameInLatin));
    }

    public String getOne(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                return bird.toString();
            }
        }

        return null;
    }

    public String getAll() {
        String allBirds = "";
        for (Bird bird : birds) {
            allBirds += bird.toString();
        }

        return allBirds;
    }

}
