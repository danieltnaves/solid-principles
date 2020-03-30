package isp;

public class Main {

    public static void main(String[] args) {
        User basicUser = new BasicUser();
        PremiumUser premiumUser = new PremiumUser();
        basicUser.sendWave("123");
        premiumUser.sendWave("123");
        premiumUser.sendMessage("123", "Hi there!");
    }

}
