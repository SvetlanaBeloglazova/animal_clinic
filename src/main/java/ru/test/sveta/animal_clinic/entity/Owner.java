package ru.test.sveta.animal_clinic.entity;

import ru.test.sveta.animal_clinic.AnimalClinicApplication;

public class Owner {
    private Integer ID;
    private String name;
    private String Animal;
    private String status;

    public Owner( Integer ID, String name, String Animal, String status){
        this.ID=ID;
        this.name=name;
        this.Animal=Animal;
        this.status=status;
    }
    public  Owner(){}

      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String animal) {
        Animal = animal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
