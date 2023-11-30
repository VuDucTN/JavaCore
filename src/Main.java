import Generics.Person;

public class Main {
    public static void main(String[] args) {
        Person<Integer, Integer> person = new Person<>();
        person.setId(1);
        person.setName("VuDuc");
        person.setAge(21);
        person.setPhoneNumber(123456789);

        System.out.println("No. " + person.getId() + ": " + person.getName() + ", age: " + person.getAge() +", phone: " + person.getPhoneNumber());
        Person.address("Da Nang");
    }
}


