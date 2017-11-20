package ru.hawkins.springbootprimefacesexample.views;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.hawkins.springbootprimefacesexample.data.DataService;
import ru.hawkins.springbootprimefacesexample.data.dto.UserSearchData;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Scope(value = "session")
public class SearchController {
    private static final Logger logger = LogManager.getLogger(SearchController.class);

    private DataService dataService;

    private String surname;
    private String name;
    private String patronymic;
    private String passportNumber;

    private List<UserSearchData> userSearchData;

    @Autowired
    public SearchController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostConstruct
    public void init() {
        userSearchData = null;
    }

    public void search(ActionEvent actionEvent) {
        Map<String, Object> params = new HashMap<>();

        if (!surname.isEmpty()) {
            params.put("surname", surname);
        }
        if (!name.isEmpty()) {
            params.put("name", name);
        }
        if (!patronymic.isEmpty()) {
            params.put("patronymic", patronymic);
        }
        if (!passportNumber.isEmpty()) {
            params.put("passportNumber", patronymic);
        }

        userSearchData = dataService.findUsersSearchDataByParams(params);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public List<UserSearchData> getUserSearchData() {
        return userSearchData;
    }

    public void setUserSearchData(List<UserSearchData> userSearchData) {
        this.userSearchData = userSearchData;
    }
}
