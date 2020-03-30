package lsp;

public class FreeUser extends User {

    @Override
    public void sendMessage(String userId, String message) {
        throw new RuntimeException("Free users can't send messages.");
    }

}
