package com.example.androidfirst;

public class UserModel {

    // POJO Class

    String name;
    String age;
    String surname;
    String team;

    public UserModel(String name, String age, String surname, String team) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.team = team;
    }

    public String getName() {
        return name;
    }
qq
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
