package lsp;

import java.util.List;

public abstract class User {

    private List<User> friends;

    public List<User> getFriends() {
        return friends;
    }

    public abstract List<String> getRoles();

    public void sendWave(String userId) {
        System.out.println("Sending a Wave to " + userId);
    }

}
