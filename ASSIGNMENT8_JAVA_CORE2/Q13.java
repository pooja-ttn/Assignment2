//    Q13. Create a custom exception that do not have any stack trace.
 class NoNameFoundException extends Exception{
    public NoNameFoundException(String message){
        super(message);
    }
}

class Manager {
    public Q13 create(String name) throws NoNameFoundException {
        if (!name.equals("Pooja")) {
            return new Q13();
        }
        else
            {
            throw new NoNameFoundException("Name " + name + " Already created");
        }


    }
}

public class Q13 {
    public static void main(String[] args) {
        String name="Pooja";
        Manager mgr =new Manager();
        try{
            Q13 obj=mgr.create(name);
        }
        catch (NoNameFoundException ex){
            System.out.println(ex);

        }

    }

}

