package ru.hawkins.springbootprimefacesexample.data;


import org.springframework.stereotype.Repository;
import ru.hawkins.springbootprimefacesexample.data.dto.User;
import ru.hawkins.springbootprimefacesexample.data.dto.UserHistoryRecord;
import ru.hawkins.springbootprimefacesexample.data.dto.UserSearchData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class DataServiceMock implements DataService {

    @Override
    public List<UserSearchData> findUsersSearchDataByParams(Map<String, Object> params) {
        List<UserSearchData> findedUsers = new ArrayList<>();

        UserSearchData user = new UserSearchData();
        user.setId(1L);
        user.setSurname("ivanov");
        user.setName("ivan");
        user.setPatronymic("ivanovich");
        user.setPassportNumber("1234 567890");

        findedUsers.add(user);

        return findedUsers;
    }

    @Override
    public User findUserDataById(long id) {
        User user = new User();
        user.setSurname("ivanov");
        user.setName("ivan");
        user.setPatronymic("ivanovich");
        user.setBirthday(LocalDate.now());
        user.setPassportNumber("1234 567890");
        user.setPassportDate(LocalDate.now());
        user.setPassportDepartment("department");

        List<UserHistoryRecord> historyRecords = new ArrayList<>();
        user.setChangesHistory(historyRecords);

        UserHistoryRecord record = new UserHistoryRecord();
        record.setSurname("ivanov");
        record.setName("ivan");
        record.setPatronymic("ivanovich");
        record.setBirthday(LocalDate.now());
        record.setPassportNumber("1234 567890");
        record.setPassportDate(LocalDate.now());
        record.setPassportDepartment("department");
        record.setCreatedDate(LocalDate.now());

        historyRecords.add(record);
        return user;
    }
}
