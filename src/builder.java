class BankAccount {
    private String name;
    private int id;
    private String email;
    private String address;

    public BankAccount(String name,int id,String email, String address) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return "USER:"+name+" "+id+" "+email+" "+address;
    }
}

class BankBuilder {
    private String name;
    private int id;
    private String email;
    private String address;

    public BankBuilder(String name) {
        this.name = name;
    }

    public BankBuilder setID(int id) {
        this.id = id;
        return this;
    }

    public BankBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    public BankBuilder setAdress(String address) {
        this.address = address;
        return this;
    }

    public BankAccount build() {
        return new BankAccount(name,id,email,address);
    }
}

public class builder {

    public static void main(String[] args) {
        BankAccount user = new BankBuilder("huy").
                setAdress("hcm").
                setEmail("huylq7@gmail.com").
                setID(1222).
                build();

        System.out.println(user.toString());
    }
}
