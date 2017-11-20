package ru.hawkins.springbootprimefacesexample.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.hawkins.springbootprimefacesexample.data.DataService;
import ru.hawkins.springbootprimefacesexample.data.dto.User;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

@Component
@Scope(value = "view")
public class UserController {

    private DataService dataService;

    private User user;

    @Autowired
    public UserController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostConstruct
    public void init() {
        FacesContext context = FacesContext.getCurrentInstance();
        String userId = context.getExternalContext().getRequestParameterMap().get("userId");
        user = dataService.findUserDataById(Long.parseLong(userId));
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
