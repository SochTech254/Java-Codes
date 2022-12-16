package Abstract.simpliLearn;

abstract class Person {
    private final String name;
    private final String gender;

    public Person(String nm, String gen) {
        this.name = nm;
        this.gender = gen;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Name: " + this.name +", " + " Gender: " + this.gender;
    }
}
