package mylabs.mylab2;

import java.util.Scanner;

public class MyLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        String json = MyPerson.toJson(new MyPerson(firstName, lastName, age));
        System.out.println("toJson: " + json);

        System.out.println("fromJson: " + MyPerson.fromJson(json));
    }
}
