package ru.test.sveta.animal_clinic.entity;

public class Patient {
    private Integer ID;
    private String Animal;
    private String name;
    private Integer age;
    private String description;
    private String Heals;

    public Patient(Integer ID,String Animal,String name,Integer age,String description,String Heals){
        this.ID=ID;
        this.Animal=Animal;
        this.name=name;
        this.age=age;
        this.description=description;
        this.Heals=Heals;
    }
    public Patient(int id, String animal, String name, String description, String heals, int age){

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String animal) {
        Animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeals() {
        return Heals;
    }

    public void setHeals(String heals) {
        Heals = heals;
    }
}
