package com.liudi.cloud.study.entity;


public class User {
    private long id;
    private String username;
    private String name;
    private int age;
    private double balance;

    public User(){}
    public User(long id, String username, String name, int age, double balance) {
        this.id =id;
        this.username = username;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}