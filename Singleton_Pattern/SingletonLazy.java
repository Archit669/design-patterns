import java.io.Serializable;


public class SingletonLazy implements Serializable, Cloneable{
    public static volatile SingletonLazy singleton;
    private SingletonLazy(){
        if(singleton!=null){
            throw new RuntimeException("handle reflection api bug");
        }
    }

    public static SingletonLazy getInstance(){
        if (singleton == null){
            synchronized (SingletonLazy.class){
                if (singleton == null){
                    singleton = new SingletonLazy();
                }
            }
        }

        return singleton;
    }

    private Object readResolve(){
        return singleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        if (singleton != null){
            throw new CloneNotSupportedException("clone not supported");
        }

        return singleton;
    }
}