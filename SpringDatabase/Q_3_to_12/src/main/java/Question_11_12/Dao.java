package Question_11_12;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class Dao {
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    int insertRecord(UserTable user){
        String sql="Insert into UserTable values(?,?,?,?,?);";
        return jdbcTemplate.update(sql,new Object[]{user.getUsername(),user.getPassword(),user.getName(),user.getAge(),user.getDate()});
    }

}
