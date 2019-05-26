package Singleton;

public class HardSingletonSafe {
    private static HardSingletonSafe HardSingletonSafe;
    private HardSingletonSafe()
    {}
    public static HardSingletonSafe getHardSingletonSafen()
    {

            System.out.println("饿汉式线程安全对象创建成功");




        return HardSingletonSafe;


    }

}
