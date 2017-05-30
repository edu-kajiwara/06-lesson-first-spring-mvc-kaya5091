package tama.ac.jp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import tama.ac.jp.model.Password;
import tama.ac.jp.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by YK on 2017/05/30.
 */

@Service
public class PasswordDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Password> selectPasswordList(){
        return jdbcTemplate.query("SELECT * FROM password;", new RowMapper<Password>() {
            @Override
            public Password mapRow(ResultSet rs, int rowNum) throws SQLException {
                Password password = new Password(rs.getString("user_id"),rs.getString("user_password"));
                return password;
            }
        });
    }

    public void insertPassword(Password password){
        jdbcTemplate.update(
                "INSERT INTO user(user_id, user_name) VALUES (?,?)",
                password.getUser_id(),password.getUser_password());
    }
}
