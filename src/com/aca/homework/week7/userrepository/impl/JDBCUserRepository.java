package com.aca.homework.week7.userrepository.impl;

import com.aca.homework.week7.userrepository.User;
import com.aca.homework.week7.userrepository.UserRepository;
import com.aca.homework.week7.userrepository.utils.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUserRepository implements UserRepository {
    private static PreparedStatement preparedStatement;

    @Override
    public synchronized void save(final User user) throws SQLException {
        preparedStatement =
                DBConnection.getCon().prepareStatement("insert into users (name, age) values (?, ?)");
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setInt(2, user.getAge());
        preparedStatement.execute();
        preparedStatement.close();
    }

    @Override
    public synchronized void deleteAll() throws SQLException {
        preparedStatement = DBConnection.getCon().prepareStatement("delete from users");
        preparedStatement.execute();
        preparedStatement.close();
    }
}
