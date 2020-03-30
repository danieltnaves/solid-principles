package lsp;

import java.util.List;

public abstract class User {

    private List<User> friends;

    public List<User> getFriends() {
        return friends;
    }

    void sendWave(String userId) {
        System.out.println("Sending a Wave to " + userId);
    }

    //This feature must be available just for PREMIUM users
    abstract void sendMessage(String userId, String message);

}
