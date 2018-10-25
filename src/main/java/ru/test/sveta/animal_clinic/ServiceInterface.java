package ru.test.sveta.animal_clinic;

import java.util.List;

public interface ServiceInterface<T> {
    void addAnimal(T t);
    List<T> getAll();
    void update(T t);

}
