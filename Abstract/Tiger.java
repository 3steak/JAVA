public class Tiger extends AbstractAnimal implements Medic {

    public Tiger(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String scream() {
        return "roaaaarrr";
    }

    @Override
    public String color() {
        return this.color;
    }

    public String medication(String medication) {
        return "Tiger have to take " + medication;
    }

    public String specialFood(String food) {
        return "Tiger have to eat " + food;
    }
}
