import java.util.ArrayList;
import java.util.List;

class Orgiginator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public History saveStateToMemento() {
        return new History(state);
    }
    public void getStateToMemento(History memento) {
        this.state = memento.getState();
    }
}

class History {
    private String state;

    public History(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class StoreHistory {
    private List<History> histories = new ArrayList<History>();
    public void add(History memento) {
        histories.add(memento);
    }
    public History get(int i) {
        return histories.get(i);
    }
}


public class Memento {
    public static void main(String[] args) {
        Orgiginator org = new Orgiginator();
        StoreHistory store = new StoreHistory();
        org.setState("A");
        store.add(org.saveStateToMemento());
        org.setState("B");
        store.add(org.saveStateToMemento());

        org.getStateToMemento(store.get(1));
        System.out.println(org.getState());
    }
}
