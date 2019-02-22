

//     5. WAP to show object cloning in java using cloneable and copy constructor both.


class Q5 implements Cloneable{
        int rollno;
        String name;

        Q5(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

// Copy constructor
        Q5(Q5 obj1)
        {
            this.rollno=obj1.rollno;
            this.name=obj1.name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                Q5 s1=new Q5(11,"POOJA");

                Q5 s2=(Q5)s1.clone();   //Using Cloneable

                Q5 s3=new Q5(s2); //Using Copy Constructor

                System.out.println("S1 object values\n"+"Roll No "+s1.rollno+"\nName "+s1.name);
                System.out.println("\nCloning of S1 using Cloneable interface");
                System.out.println("Roll No "+s2.rollno+"\nName "+s2.name);
                System.out.println("\nCloning of S1 using Copy Constructor");
                System.out.println("Roll No "+s3.rollno+"\nName "+s3.name);

            }catch(CloneNotSupportedException c){
                c.printStackTrace();
            }

        }
    }

