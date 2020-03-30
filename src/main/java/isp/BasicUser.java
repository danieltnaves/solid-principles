package isp;

public class BasicUser implements User {

    @Override
    public void sendWave(String userId) {
        System.out.println("Sending message to " + userId);
    }

}
