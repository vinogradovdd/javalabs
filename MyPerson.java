package mylabs.mylab2;

import com.google.gson.Gson;

import java.util.Objects;

public final class MyPerson {
    private final String firstName;
    private final String lastName;
    private final int age;

    public MyPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPerson person = (MyPerson) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    private static Gson gson = new Gson();

    public static String toJson(MyPerson person) {
        return gson.toJson(person);
    }

    public static MyPerson fromJson(String json) {
        return gson.fromJson(json, MyPerson.class);
    }
}
