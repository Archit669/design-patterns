
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



class Main {
    public static void main(String[] args) {
       SingletonLazy singleton1 = SingletonLazy.getInstance();
       SingletonLazy singleton2 = SingletonLazy.getInstance();

       System.out.println(singleton1.hashCode());
       System.out.println(singleton2.hashCode());


       try {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream("archit.ob")
        );

        objectOutputStream.writeObject(singleton1);
           
       } catch (Exception e) {
         System.out.println(e);
       }
       

       
    }
}