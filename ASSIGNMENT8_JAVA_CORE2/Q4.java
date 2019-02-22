class SingletonClass {

//     Q4. WAP to create singleton class.

    private static SingletonClass single_ins=null;
    public int a=5;
    public int b=0;
    private SingletonClass()
    {
        a=a++;
    }

    public static SingletonClass get_instance()
    {
        if(single_ins==null)
        {
            single_ins=new SingletonClass();
        }
        return single_ins;
    }
}

public class Q4
{
    public static void main(String[] args) {
        SingletonClass st=SingletonClass.get_instance();
        SingletonClass st1=SingletonClass.get_instance();
        System.out.println("Value of 'a' using instance 1 - "+st.a);
        System.out.println("Value of 'a' using instance 2 - "+st1.a);

    }

        }