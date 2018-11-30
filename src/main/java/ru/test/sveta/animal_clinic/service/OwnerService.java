package ru.test.sveta.animal_clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.test.sveta.animal_clinic.ServiceInterface;
import ru.test.sveta.animal_clinic.entity.Owner;

import java.util.List;

@Service
public class OwnerService implements ServiceInterface<Owner> {
private final JdbcTemplate jdbcTemplate;

    @Autowired
    public OwnerService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addAnimal(Owner owner) {
        String insert = "INSERT INTO owners VALUES ("
                +owner.getAnimal() + ","
                + owner.getStatus() + ","
                + owner.getName() +");";
        jdbcTemplate.execute(insert);
    }

    @Override
    public List<Owner> getAll() {

        return jdbcTemplate.query("select * from owners", (rs,i) -> new Owner(
                rs.getInt("id"),
                rs.getString("animal"),
                rs.getString("status"),
                rs.getString("name")
        ) );
    }

    @Override
    public void update(Owner owner) {
        jdbcTemplate.update("update owners set animal=? , status=? , name=? where id=?",
                owner.getAnimal(),owner.getStatus(),owner.getName(),owner.getID());
    }
}
