package ru.hawkins.springbootprimefacesexample.data.dto;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthday;
    private String passportNumber;
    private String passportDepartment;
    private LocalDate passportDate;

    private List<UserHistoryRecord> changesHistory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportDepartment() {
        return passportDepartment;
    }

    public void setPassportDepartment(String passportDepartment) {
        this.passportDepartment = passportDepartment;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public List<UserHistoryRecord> getChangesHistory() {
        return changesHistory;
    }

    public void setChangesHistory(List<UserHistoryRecord> changesHistory) {
        this.changesHistory = changesHistory;
    }
}
