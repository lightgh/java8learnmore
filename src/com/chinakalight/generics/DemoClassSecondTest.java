package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class DemoClassSecondTest {
    public static void main(String[] args) {
        DemoClassSecond<Person> demoClassSecond =  new DemoClassSecond<Person>();

        Person person = new Person("Chinaka", "Ihechukwu", "Light");
        demoClassSecond.set(person);
        System.out.println(demoClassSecond.get());

        System.out.println(demoClassSecond.get());

    }
}

class Person {
    private String firstName;
    private String lastName;
    private String otherName;

    public Person() {
    }

    public Person(String firstName, String lastName, String otherName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    @Override
    public String toString(){
        return String.format("FirstName: %s, LastName: %s, OtherName: %s", this.firstName,
                this.lastName, this.otherName);
    }

}
