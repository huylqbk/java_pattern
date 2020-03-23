import java.util.Observable;
import java.util.Observer;

class EventSource extends Observable {
    public void run() {
        setChanged();
        notifyObservers("hehe");
    }
}

class ResponseHandle implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}


class ResponseHandle2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("------------------");
        System.out.println(arg);
    }
}

public class observer {
    public static void main(String[] args) {
        EventSource e = new EventSource();
        ResponseHandle r1 = new ResponseHandle();
        ResponseHandle2 r2 =  new ResponseHandle2();

        //stack
        e.addObserver(r2);
        e.addObserver(r1);
        e.run();
        return;
    }
}
