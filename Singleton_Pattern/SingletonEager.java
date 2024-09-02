public class SingletonEager {
    private static final SingletonEager singleton = new SingletonEager();
    private SingletonEager() {}

    public static SingletonEager getInstance(){
        return singleton;
    }
}