public class Cat extends AbstractAnimal {

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String scream() {
        return "miaou";
    }

    @Override
    public String color() {
        return this.color;
    }
}
