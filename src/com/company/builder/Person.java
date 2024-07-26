package com.company.builder;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final String email;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;

        // Mandatory Field
        public PersonBuilder (int age) {
            this.age = age;

        }
        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }



        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            // Optionally, you can add validation logic here before returning the object
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age +
                ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }

    public static void main(String[] args) {
        Person person=new PersonBuilder(23).setFirstName("Raghu").build();
        System.out.println(person);
    }
}

