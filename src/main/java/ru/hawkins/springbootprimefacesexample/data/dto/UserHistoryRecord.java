package ru.hawkins.springbootprimefacesexample.data.dto;

import java.time.LocalDate;

public class UserHistoryRecord {
    private LocalDate createdDate;
    private final User user = new User();

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return user.getName();
    }

    public void setName(String name) {
        user.setName(name);
    }

    public String getSurname() {
        return user.getSurname();
    }

    public void setSurname(String surname) {
        user.setSurname(surname);
    }

    public String getPatronymic() {
        return user.getPatronymic();
    }

    public void setPatronymic(String patronymic) {
        user.setPatronymic(patronymic);
    }

    public LocalDate getBirthday() {
        return user.getBirthday();
    }

    public void setBirthday(LocalDate birthday) {
        user.setBirthday(birthday);
    }

    public String getPassportNumber() {
        return user.getPassportNumber();
    }

    public void setPassportNumber(String passportNumber) {
        user.setPassportNumber(passportNumber);
    }

    public String getPassportDepartment() {
        return user.getPassportDepartment();
    }

    public void setPassportDepartment(String passportDepartment) {
        user.setPassportDepartment(passportDepartment);
    }

    public LocalDate getPassportDate() {
        return user.getPassportDate();
    }

    public void setPassportDate(LocalDate passportDate) {
        user.setPassportDate(passportDate);
    }
}
