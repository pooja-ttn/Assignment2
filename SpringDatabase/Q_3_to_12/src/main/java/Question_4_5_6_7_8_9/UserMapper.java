package Question_4_5_6_7_8_9;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user=new User();
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        user.setUsername(rs.getString("username"));
        user.setAge(rs.getInt("age"));
        user.setDate(rs.getDate("dob"));
        return user;
    }
}
