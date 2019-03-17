package Question_4_5_6_7_8_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class Dao {

    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    void printUserCount() {
        String sql="Select count(*) from UserTable;";
        System.out.println("----------------Question 4-------------------------");
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.TYPE));

    }

    String getName(){
        String sql="Select name from UserTable where username=?;";
        System.out.println("\n----------------Question 5-------------------");

        return jdbcTemplate.queryForObject(sql,new Object[]{"Harsh"},String.class);
    }

    void insertRecord(){
        String sql="Insert into UserTable values(?,?,?,?,?);";
        System.out.println("\n----------------Question 6-------------------------");

        jdbcTemplate.update(sql,new Object[]{"Anmol","123456","Anmol",21,"1997-3-30"});
        System.out.println("One record Inserted");

    }

    void getUserDetail(){
        String sql="Select * from UserTable where username=?;";
        System.out.println("\n----------------Question 7-------------------------");
        System.out.println(jdbcTemplate.queryForMap(sql,new Object[]{"Pooja"}));
    }

    void getAllUsersDetail(){
        String sql="Select * from UserTable;";
        System.out.println("\n----------------Question 8-------------------------");
        System.out.println(jdbcTemplate.queryForList(sql));
    }

    User getUserDetailsUsingMapper(){
        String sql="Select * from UserTable where username=?;";
        System.out.println("\n----------------Question 9-------------------------");
        return jdbcTemplate.queryForObject(sql,new Object[]{"Harsh"},new BeanPropertyRowMapper<User>());
    }


    void remove(){
        String sql="DELETE from UserTable where name=?;";
        jdbcTemplate.update(sql,new Object[]{"Anmol"});

    }

}
