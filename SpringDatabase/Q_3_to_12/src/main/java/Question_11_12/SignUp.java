package Question_11_12;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SignUp{

    @Autowired
    private Dao dao;

    @Autowired
    private EmailService emailService;

    // Outer Transaction
//    @Transactional(propagation = Propagation.REQUIRED)
//    public void signUp(UserTable user) {
//        int res = dao.insertRecord(user);
//        System.out.println("\nSignup: " + ((res == 1) ? "Sucessfully added" : "Failed"));
//        try {
//            emailService.sendMail(user);
//        } catch (RuntimeException e) {
//            System.err.println("\n" + e.getMessage());
//        }
//    }
//
    @Transactional(readOnly = true)
    public void signUp(UserTable user){
        int res = dao.insertRecord(user);
        System.out.println("\nSignup: " + ((res == 1) ? "success": "failed"));
    }
//
//    @Transactional(timeout = 2)
//    public void signUp(UserTable user){
//        try {
//            Thread.sleep(5000L);
//            int res = dao.insertRecord(user);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("\nSignup: " + ((res == 1) ? "success": "failed"));
//    }
//
//    @Transactional(rollbackFor = RuntimeException.class)
//    public void signUp(UserTable user){
//        int res = dao.insertRecord(user);
//        System.out.println("\nSignup: " + ((res == 1) ? "success": "failed"));
//        throw new RuntimeException("Signup Failed!!");
//    }
//
//    @Transactional(noRollbackFor = UnsupportedOperationException.class)
//    public void signUp(UserTable user){
//        int res = dao.insertRecord(user);
//
//        System.out.println("\nSignup: " + ((res == 1) ? "success": "failed"));
//        throw new UnsupportedOperationException("Signup Failed!!");
//    }


}