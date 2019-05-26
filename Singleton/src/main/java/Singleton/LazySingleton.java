package Singleton;

public class LazySingleton {

    /**懒汉式设计模式*/
    private static LazySingleton lazySingleton;
    private LazySingleton()
    {}
    public static LazySingleton getLazySingleton()
    {
        if(lazySingleton==null)
        {

            lazySingleton=new LazySingleton();
            System.out.println("懒汉式线程不安全对象创建成功");


        }

        return lazySingleton;


    }




}
