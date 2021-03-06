package singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Singleton created.");
    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE_HOLDER = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE_HOLDER;
    }
}
