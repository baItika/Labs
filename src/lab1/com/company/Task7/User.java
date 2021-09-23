package lab1.com.company.Task7;

import java.util.Objects;

public class User {

    private String firstName;
    private String lastName;
    private Integer age;
    private String email;

    public User(String firstName, String lastName, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }


    public static void main(String[] args) {
        User userOne = new User ("Ivan","Ivanov",26,"ivan@email");
        User userTwo = new User ("Vasyl","Ivanov",40,"ivan@email");
        System.out.println (userOne.equals (userTwo));
        System.out.println (userOne.hashCode ());
    }

}
