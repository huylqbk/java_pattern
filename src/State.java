
enum StateType {
    SUBMIT,
    APPROVED,
    REJECT;
}
class DocumentService {
    DocumentService() {
        System.out.println("New Object");
    }
    private StateType state;

    public StateType getState() {
        return state;
    }

    public void setState(StateType state) {
        this.state = state;
    }

    public void handleRequest() {
        switch (state) {
            case SUBMIT:
                System.out.println("File Submited");
                break;
            case REJECT:
                System.out.println("file Rejected");
                break;
            case APPROVED:
                System.out.println("file Approved");
                break;
            default:
                break;
        }
    }
}


public class State {
    public static void main(String[] args) {
        DocumentService doc = new DocumentService();
        doc.setState(StateType.APPROVED);
        doc.handleRequest();

        doc.setState(StateType.REJECT);
        doc.handleRequest();
    }
}
