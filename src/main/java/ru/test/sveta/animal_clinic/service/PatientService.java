package ru.test.sveta.animal_clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.test.sveta.animal_clinic.ServiceInterface;
import ru.test.sveta.animal_clinic.entity.Patient;

import java.util.List;

@Service

public class PatientService implements ServiceInterface<Patient> {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PatientService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void addAnimal(Patient patient) {
        String insert = "INSERT INTO patient VALUES ("
                +patient.getAnimal() + ","
                + patient.getName() +");"
                +patient.getDescription() + ","
                +patient.getHeals() + ","
                +patient.getAge() + "," ;
        jdbcTemplate.execute(insert);
    }

    @Override
    public List<Patient> getAll() {
        return jdbcTemplate.query("select * from patients", (rs,i) -> new Patient(
                rs.getInt("id"),
                rs.getString("animal"),
                rs.getString("name"),
                rs.getString ( "Description"),
                rs.getString ( "Heals"),
                rs.getInt("age")
        ) );
    }

    @Override
    public void update(Patient patient) {
        jdbcTemplate.update("update patients set animal=? , name=? , Description=? , Heals=? , age=? ,  where id=?",
                patient.getAnimal(),patient.getName(),patient.getDescription(),patient.getHeals(), patient.getAge(),  patient.getID());

    }
}
