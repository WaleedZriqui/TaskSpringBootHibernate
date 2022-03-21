package com.example.demo.Person;

import javax.persistence.*;

@Entity
@Table
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "person_sequence",
            strategy = GenerationType.SEQUENCE
    )

    private long id;
    private String name;
    private int age;
    private String city;
    // list permissions

    public Person() {
    }

    public Person(long id,
                  String name,
                  int age,
                  String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(String name,
                  int age,
                  String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
