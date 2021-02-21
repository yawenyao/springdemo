package org.example.service;

public class Userservice {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Userservice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void test(){
        System.out.println("hello spring......");
    }
}
