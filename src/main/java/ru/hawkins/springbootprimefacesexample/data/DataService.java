package ru.hawkins.springbootprimefacesexample.data;

import ru.hawkins.springbootprimefacesexample.data.dto.User;
import ru.hawkins.springbootprimefacesexample.data.dto.UserSearchData;

import java.util.List;
import java.util.Map;

public interface DataService {
    List<UserSearchData> findUsersSearchDataByParams(Map<String, Object> params);

    User findUserDataById(long id);
}
