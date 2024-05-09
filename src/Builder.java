public class Builder {

    public Builder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private final String firstName;
    private final String lastName;
    private String address;
    private int age;

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, address, age);
    }
}
