package Singleton;

public class LazySingletonSafe {
    private  static LazySingletonSafe lazySingletonSafe;

     private LazySingletonSafe() {
    }

    public static synchronized  LazySingletonSafe getLazySingletonSafe() {
     if(lazySingletonSafe==null)
     {
         lazySingletonSafe=new LazySingletonSafe();
         System.out.println("懒汉式线程安全对象创建成功");

     }
     return lazySingletonSafe;
    }
}
