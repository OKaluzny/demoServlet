package com.example.demo1;

public class Employee {

    private int id;
    private String name;
    private String email;
    private String country;
    private String dateOfBirth;
    private String specialty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name: " + name +
                "; email: \"" + email + "\"" +
                "; country: " + country +
                "; dateOfBirth: " + dateOfBirth +
                "; specialty: " + specialty + ";";
    }
}
