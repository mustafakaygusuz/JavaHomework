package day4Homework1.Entities;

import java.util.Date;

import day4Homework1.Abstract.Entity;


public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String NationalityId;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }


}
