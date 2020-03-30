package isp;

public class PremiumUser implements User, PremiumMember {

    @Override
    public void sendWave(String userId) {
        System.out.println("Sending wave to " + userId);
    }

    @Override
    public void sendMessage(String userId, String message) {
        System.out.println("Sending message to " + userId + " - message: " + message);
    }
}
