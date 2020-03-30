package isp;

public class BasicUser implements User {

    @Override
    public void sendWave(String userId) {
        System.out.println("Sending message to " + userId);
    }

    @Override
    public void sendMessage(String userId, String message) {
        throw new RuntimeException("Basic user can't send messages");
    }

}
