package Question_11_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//Inner Transaction
@Service
public class EmailService {

    @Autowired
Dao dao;
    // Inner Transaction
//    @Transactional(propagation = Propagation.REQUIRED)
//    public void sendMail(UserTable user) {
//        throw new RuntimeException("Email sent failed! - Server Down");
//    }
//
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void sendMail(UserTable user){

        throw new RuntimeException("Email sent failed! - Server Down");
    }
//
//    @Transactional(propagation = Propagation.NESTED)
//    public void sendMail(UserTable user){
//        throw new RuntimeException("Email sent failed! - Server Down");
//    }
//
//    @Transactional(propagation = Propagation.MANDATORY)
//    public void sendMail(UserTable user){
//        throw new RuntimeException("Email sent failed! - Server Down");
//    }
//
//    @Transactional(propagation = Propagation.NEVER)
//    public void sendMail(UserTable user){
//        throw new RuntimeException("Email sent failed! - Server Down");
//    }
//
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
//    public void sendMail(UserTable user){
//        throw new RuntimeException("Email sent failed! - Server Down");
//    }
//
//
//    @Transactional(propagation = Propagation.SUPPORTS)
//    public void sendMail(UserTable user){
//        throw new RuntimeException("Email sent failed! - Server Down");
//    }

}
