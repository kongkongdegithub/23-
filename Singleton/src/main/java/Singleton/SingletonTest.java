package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        LazySingleton.getLazySingleton();
        LazySingletonSafe.getLazySingletonSafe();
        HardSingletonSafe.getHardSingletonSafen();
        doublecheckedlockingSingleton.getdoublecheckedlockingSingleton();


    }
}
