package lsp;

public class PremiumUser extends User {

    @Override
    public void sendMessage(String userId, String message) {
        System.out.println("Sending message " + message + " to the user " + userId);
    }
}
