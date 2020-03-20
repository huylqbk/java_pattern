//method define by name, type and parameter

interface Visit {
    void visit(DevBook b);
    void visit(CookBook c);
}

interface Book {
    void accept(Visit v);
}

class CookBook implements Book {
    public void accept(Visit v) {
        v.visit(this);
    }
    public void getName() {
        System.out.println("CookBook");
    }
}

class DevBook implements Book {
    public void accept(Visit v) {
        v.visit(this);
    }
    public void getContent() {
        System.out.println("javaaaaa");
    }
}

class SomeOne implements Visit {
    public void visit(DevBook b) {
        System.out.println("read book");
    }

    public void visit(CookBook c) {
        c.getName();
    }
}

public class visitor {
    public static void main(String[] args) {
        Book devBook = new DevBook();
        Book cookBook = new CookBook();

        Visit v = new SomeOne();
        cookBook.accept(v);
        devBook.accept(v);
    }
}
