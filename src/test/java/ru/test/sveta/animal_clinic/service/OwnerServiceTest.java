package ru.test.sveta.animal_clinic.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.test.sveta.animal_clinic.ServiceInterface;
import ru.test.sveta.animal_clinic.entity.Owner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OwnerServiceTest {
    private OwnerService service;
    private List<Owner> owners;
    private Owner testOwner1;
    private Owner testOwner2;
    private Owner testOwner3;

    @Before
    public void init(){
        //service = new OwnerService();
       /* owners = new ArrayList<>();
        testOwner1 = new Owner();
        testOwner1.setID(1);
        testOwner1.setName("Sveta");
        testOwner1.setAnimal("Cat");
        testOwner1.setStatus("test status");
        testOwner2 = new Owner();
        testOwner2.setID(2);
        testOwner2.setName("Dima");
        testOwner2.setAnimal("Parrot");
        testOwner2.setStatus("test status");
        testOwner3 = new Owner();
        testOwner3.setID(3);
        testOwner3.setName("Renat");
        testOwner3.setAnimal("Dog");
        testOwner3.setStatus("test status");
        owners.addAll(Arrays.asList(testOwner1, testOwner2, testOwner3));
        when(service.getAll()).thenReturn(owners); */
    }

    @Test
    public void addAnimal() {
        service.addAnimal(testOwner1);
        //Assert.assertNotNull();
    }

    @Test
    public void getAll() {
        List<Owner> testOwnerList = service.getAll();
        Assert.assertNotNull(testOwnerList);
    }

    @Test
    public void update() {
        service.update(testOwner2);
    }
}
