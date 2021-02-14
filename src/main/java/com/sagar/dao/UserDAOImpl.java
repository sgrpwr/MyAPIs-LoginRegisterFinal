package com.sagar.dao;

import com.sagar.model.UserRegDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    String sql = "insert into tbl_user(user_name, user_email, user_password) values (?,?,?)";

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public int registerUser(UserRegDTO u) {
        try {
            return jdbc.update(sql, u.getUserName(), u.getUserEmail(), u.getPassword());
        }catch (Exception e){
            System.out.print(e);
            return 0;
        }
    }
}
