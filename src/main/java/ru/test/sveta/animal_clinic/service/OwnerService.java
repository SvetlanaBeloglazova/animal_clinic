package ru.test.sveta.animal_clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.test.sveta.animal_clinic.ServiceInterface;
import ru.test.sveta.animal_clinic.entity.Owner;

import java.util.List;

public class OwnerService implements ServiceInterface<Owner> {

    @Override
    public void addAnimal(Owner owner) {
        throw new RuntimeException();
    }

    @Override
    public List<Owner> getAll() {
        throw new RuntimeException();
    }

    @Override
    public void update(Owner owner) {
        throw new RuntimeException();
    }
}
