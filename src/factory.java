interface Bank{
    String getBankName();
}

class OCB implements Bank {
    @Override
    public String getBankName() {
        return "ocb";
    }
}

class MSB implements Bank {
    public String getBankName(){
        return  "msb";
    }
}

enum BankType {
    OCB,
    MSB;
}

class BankFactory {
    private BankFactory(){}
    public static final Bank getBank(BankType type) {
        if (type==BankType.OCB) {
            return new OCB();
        } else if (type ==BankType.MSB){
            return new MSB();
        } else {
            return null;
        }
    }
}

public class factory {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.MSB);
        System.out.println(bank.getBankName());
        return;
    }
}
