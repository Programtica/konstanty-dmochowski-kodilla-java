package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryFascadeTestSuite {
    @Autowired
    public EmployeeDao employeeDao;
    @Autowired
    public CompanyDao companyDao;
    @Autowired
    public QueryFascade queryFascade;

    @Test
    public void testRetrieveCompaniesLike() {
        //Given
        Company movieDistributions = new Company("Vision");
        Company computerProducers = new Company("ASUS");
        Company carProducers = new Company("Audi");

        companyDao.save(movieDistributions);
        companyDao.save(computerProducers);
        companyDao.save(carProducers);
        //When
        List<Company> resultsOfRetrieve = queryFascade.retrieveTheCompany("A");
        //Then
        Assert.assertEquals(2, resultsOfRetrieve.size());
        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testRetrieveEmployeesLike() {
        //Given
        Employee elise = new Employee("Eliza", "Adamczyk");
        Employee constantin = new Employee("Konstanty", "Dmochowski");
        Employee maximilian = new Employee("Maksymilian", "Koczorowski");

        employeeDao.save(elise);
        employeeDao.save(constantin);
        employeeDao.save(maximilian);
        //When
        List<Employee> resultsOfRetrieve = queryFascade.retrieveTheEmployee("ski");
        //Then
        Assert.assertEquals(2, resultsOfRetrieve.size());
        //CleanUp
        employeeDao.deleteAll();
    }
}
