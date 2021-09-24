package com.aca.homework.week7.userrepository;

import com.aca.homework.week7.userrepository.impl.JDBCUserRepository;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        final JDBCUserRepository jdbcUserRepository = new JDBCUserRepository();
        final User user = new User("Valodik", 33);

        jdbcUserRepository.save(user);
        jdbcUserRepository.deleteAll();
    }

}
