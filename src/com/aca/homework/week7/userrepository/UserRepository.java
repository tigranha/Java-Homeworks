package com.aca.homework.week7.userrepository;

import java.sql.SQLException;

public interface UserRepository {

    void save(User user) throws SQLException;

    void deleteAll() throws SQLException;


}
