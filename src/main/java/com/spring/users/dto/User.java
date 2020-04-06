package com.spring.users.dto;

import javax.validation.constraints.*;
import java.util.Date;

public class User {
    private Integer id;

    @NotNull
    @Size(min = 3, message = "Name should be at least 3 characters")
    private String name;

    @Size(min = 6, message = "Password should be at least 6 characters")
    private String password;

    @Email(message = "Email should be valid")
    private String email;

    @Positive(message = "Age should not be less than 0")
    private Integer age;

    @Past(message = "Date of birth should be in the past")
    private Date birthDate;

    @NotNull
    private String gender;

    public User() {
    }

    public User(Integer id, String name, String password, String email, Integer age, Date birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}
