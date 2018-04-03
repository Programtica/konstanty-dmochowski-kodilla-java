package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testNamedQuery() {
        //Given
        Employee e1 = new Employee("Konstanty", "Dmochowski");
        Employee e2 = new Employee("Eliza", "Czaja");
        Employee e3 = new Employee("Adam", "Marzec");
        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);

        //When
        List<Employee> results = employeeDao.retrieveEmployeeWithLastName("Dmochowski");
        //Then
        Assert.assertEquals(1, results.size());
        //CleanUp
        employeeDao.deleteAll();
    }
}