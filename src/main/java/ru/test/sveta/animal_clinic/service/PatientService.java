package ru.test.sveta.animal_clinic.service;

import ru.test.sveta.animal_clinic.ServiceInterface;
import ru.test.sveta.animal_clinic.entity.Patient;

import java.util.List;

public class PatientService implements ServiceInterface<Patient> {
    @Override
    public void addAnimal(Patient patient) {
        throw new RuntimeException();
    }

    @Override
    public List<Patient> getAll() {
        throw new RuntimeException();
    }

    @Override
    public void update(Patient patient) {
        throw new RuntimeException();
    }
}
