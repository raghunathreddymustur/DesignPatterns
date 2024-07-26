package com.company.builder.Mutable;

public final class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    private Person() {
        // Private constructor to enforce the use of the builder
    }

    public static class PersonBuilder {
        private final Person person;

        public PersonBuilder() {
            person = new Person();
        }

        public PersonBuilder setFirstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            person.address = address;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            person.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            person.email = email;
            return this;
        }

        public Person build() {
            // Optionally, you can add validation logic here before returning the object
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age +
                ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }
}

