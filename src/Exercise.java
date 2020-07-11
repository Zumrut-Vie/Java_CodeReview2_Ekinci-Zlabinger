public class Exercise {
    String name;
    String description;
    String position;
    int duration;
    boolean floor;
    public Exercise(String name, String description, int duration, String position) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
        this.floor = position.equals("floor");
    }
    public Exercise(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void print() {
        System.out.println( name + " " +"DURATION: " + duration + " seconds.\n" +
                "---------------------------------------------\n" + "DESCRIPTION: " + description + "\n");
    }
    public void printFloorOnly() {
        if (floor) {
            print();
        }
    }
    public void printFloorOnly(int moreThan) {
        if (floor && duration > moreThan) {
            print();
        }
    }

}

