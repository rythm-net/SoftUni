package barbershopjava;

public class Client {

    public String name;
    public int age;
    public Gender gender;
    public Barber barber;

    public Client(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
