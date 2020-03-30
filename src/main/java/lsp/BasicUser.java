package lsp;

public class BasicUser extends User {

    @Override
    public void sendMessage(String userId, String message) {
        throw new RuntimeException("Basic users can't send messages.");
    }

}
