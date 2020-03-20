interface Vietnamese {
    void say(String str);
}

class ChinaAdaptee {
    public void listen(String str){
        System.out.println("Chinese Listen....");
        System.out.println(str);
    }
}

class Tranlator implements Vietnamese{
    private ChinaAdaptee adaptee;
    public Tranlator(ChinaAdaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void say(String str) {
        System.out.println("VN Say... ");
        System.out.println(str);
        String china = this.translate(str);
        adaptee.listen(china);
    }
    private String translate(String str) {
        if (str == "chao") {
            return "你好";
        } else {
            return "unknown";
        }
    }
}

public class Adapter {
    public static void main(String[] args) {
        Vietnamese vn = new Tranlator(new ChinaAdaptee());
        vn.say("chao");
        return;
    }
}
