package mylabs.mylab4.human;

public class MyHuman {
    protected int age;

    public MyHuman(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyHuman{" +
                "age=" + age +
                '}';
    }
}
