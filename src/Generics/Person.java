package Generics;

public class Person <T extends Number, U>{
    private int id;
    private String name;
    private T age;

    private U phoneNumber;

    public Person() {
    }

    public Person(int id, String name, T age, U phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public U getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(U phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // phuong thuc generics
    public static <T> void address(T address){
        System.out.println("Address : " + address);
    }
}
