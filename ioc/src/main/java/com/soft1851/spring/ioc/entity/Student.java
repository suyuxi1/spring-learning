package com.soft1851.spring.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author su
 * @className Student
 * @Description TODO
 * @Date 2020/3/17 9:35
 * @Version 1.0
 **/
public class Student {
    private Integer id;
    private String name;
    private List<String> hobbies;
    private List<Phone> phones;
    private Map<String,String> car;
    private Set<String> computer;

    public Map<String, String> getCar() {
        return car;
    }

    public void setCar(Map<String, String> car) {
        this.car = car;
    }

    public Set<String> getComputer() {
        return computer;
    }

    public void setComputer(Set<String> computer) {
        this.computer = computer;
    }

    public Student() {
    }

    public Student(Integer id, String name, List<String> hobbies, List<Phone> phones, Map<String, String> car, Set<String> computer) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.phones = phones;
        this.car = car;
        this.computer = computer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", phones=" + phones +
                ", car=" + car +
                ", computer=" + computer +
                '}';
    }
}
