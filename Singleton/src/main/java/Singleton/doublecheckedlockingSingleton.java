package Singleton;

public  class  doublecheckedlockingSingleton {

    //双检锁/双重校验锁
    private volatile static doublecheckedlockingSingleton doublecheckedlockingSingleton;

    private doublecheckedlockingSingleton() {
    }

    public static  doublecheckedlockingSingleton getdoublecheckedlockingSingleton() {
        synchronized (doublecheckedlockingSingleton.class) {
            if (doublecheckedlockingSingleton == null) {

                doublecheckedlockingSingleton = new doublecheckedlockingSingleton();
                System.out.println("双检锁/双重校验锁线程安全对象创建成功");


            }
        }

        return doublecheckedlockingSingleton;

    }
}