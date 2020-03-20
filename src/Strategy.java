interface PayMent {
    void pay();
}

class Momo implements PayMent {
    public void pay() {
        System.out.println("pay with momo");
    }
}
class ZaloPay implements PayMent {
    public void pay() {
        System.out.println("pay with zalopay");
    }
}

class PayList {
    private PayMent payMent;
    public void setPayMent(PayMent payMent) {
        this.payMent = payMent;
    }
    public void pay() {
        this.payMent.pay();
    }
}

public class Strategy {
    public static void main(String[] args) {
        PayList payList = new PayList();
        payList.setPayMent(new ZaloPay());
        payList.pay();
    }
}
