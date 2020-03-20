class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo(){
        System.out.println("instance");
    }
    public static SingletonDemo getInstance() {
        if (instance==null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
public class singleton {
    public static void main(String[] args){
        System.out.println("---Singleton---");
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();
        if (s1.equals(s2)){
            System.out.println("done");
        }
        return;
    }
}
