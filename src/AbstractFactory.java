import sun.tools.jconsole.Tab;

interface Chair {
    void create();
}
interface Table {
    void create();
}

class PlasticChair implements Chair {
    public void create() {
        System.out.println("PlasticChair");
    }
}

class WoodChair implements Chair {
    public void create() {
        System.out.println("WoodChair");
    }
}

class PlasticTable implements Table {
    public void create() {
        System.out.println("PlasticTable");
    }
}

class WoodTable implements Table {
    public void create() {
        System.out.println("WoodTable");
    }
}


abstract class AbstractFurniture {
    public abstract Chair createChair();
    public abstract Table createTable();
}

class PlasticFactory extends AbstractFurniture {
    public Chair createChair() {
        return new PlasticChair();
    }
    public Table createTable() {
        return new PlasticTable();
    }
}


class WoodFactory extends AbstractFurniture {
    public Chair createChair() {
        return new WoodChair();
    }
    public Table createTable() {
        return new WoodTable();
    }
}

enum MaterialType {
    Plastic,
    Wood;
}


class FurnitureFactory {
    private FurnitureFactory(){}
    public static final AbstractFurniture getFactory(MaterialType type) {
        if (type==MaterialType.Plastic) {
            return new PlasticFactory();
        } else if (type == MaterialType.Wood) {
            return new WoodFactory();
        } else {
            return null;
        }
    }
}

public class AbstractFactory {
    public static void main(String[] args){
        AbstractFurniture factory = FurnitureFactory.getFactory(MaterialType.Wood);
        Chair chair = factory.createChair();
        chair.create();
        return;
    }
}
