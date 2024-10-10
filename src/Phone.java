import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        EdinaPhone newPhone = new EdinaPhone("Dawa Edina");

        newPhone.showPhoneOwner();
        newPhone.initiateCall();
        newPhone.initiateText();
        newPhone.showCallHistory();
        newPhone.showTextHistory();

    }
}
interface Phone {
    void call(String contact);
    void text(String contact, String message);
    void showCallHistory();
    void showTextHistory();
}

abstract class SimplePhone implements Phone {
    ArrayList<String> callHistory = new ArrayList<String>();
    ArrayList<String> textHistory = new ArrayList<String>();

    public void call(String contact){
        callHistory.add("Called: " + contact);
        System.out.println("Calling " +contact);

    }

    public void text(String contact, String message){
        textHistory.add("Texted: " + contact + ": " + message);
        System.out.println("Text sent to " + contact + ": " + message);
    }

    public void showCallHistory(){
        System.out.println("CALL HISTORY: ");
        if (callHistory.isEmpty()) {
            System.out.println("No calls made");

        }

        else {
            for (String call : callHistory) {
                System.out.println(call);
            }
        }
    }
}

class EdinaPhone extends SimplePhone{
    private String phoneOwner;


    public EdinaPhone(String phoneOwner){
        this.phoneOwner = phoneOwner;
    }


    public void showPhoneOwner() {
        System.out.println("This phone belongs to: " + phoneOwner);

    }

    public void initiateCall() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Who do you want to call? " );
    String contact = scanner.nextLine();
    call(contact);
    }

    public void initiateText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who would you like to text? " );
        String contact = scanner.nextLine();
        text(contact);
        System.out.println("Input your message please: " );
        String message = scanner.nextLine();
        text(message);

    }

    private void text(String message) {

    }


    @Override
    public void showTextHistory() {

    }
}
