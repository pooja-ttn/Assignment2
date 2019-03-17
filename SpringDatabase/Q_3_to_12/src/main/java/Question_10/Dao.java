package Question_10;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
@Autowired
    SessionFactory sessionFactory;

    void countRecord(){
        String sql="Select count(*)from Question_10.UserTable";
        Query query=sessionFactory.openSession().createQuery(sql);
        System.out.println("Total Row count -\n"+query.uniqueResult());
    }
}
