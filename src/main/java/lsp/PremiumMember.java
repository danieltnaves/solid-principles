package lsp;

public abstract class PremiumMember extends User {

    public void sendMessage(String userId, String message) {
        System.out.println("Sending message " + message + " to the user " + userId);
    }

}
