/**
 * Created by YanMing on 2017/5/10.
 */
public class Singleton {
    public volatile static Singleton singleton;

    private Singleton(){

    }

    public void function(){
        System.out.println("Hello World");
    }

    public static  Singleton  getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){ //进入临界区
                if(singleton == null){ //再检查一次
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
