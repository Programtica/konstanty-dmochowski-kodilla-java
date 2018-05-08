package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryFacade {
    public final CompanyDao companyDao;
    public final EmployeeDao employeeDao;

    public QueryFacade(final CompanyDao companyDao, final EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveTheCompany(String arg) {
        return companyDao.retrieveCompaniesLike("%" + arg + "%");
    }

    public List<Employee> retrieveTheEmployee(String arg) {
        return employeeDao.retrieveEmployeeSurname("%" + arg + "%");
    }
}
