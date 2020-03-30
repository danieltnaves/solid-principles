package lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new BasicUser());
        users.add(new FreeUser());
        users.forEach(user -> {
            user.sendWave("123");
            System.out.println(user.getRoles());
        });
        PremiumMember premiumMemberUser = new PremiumUser();
        premiumMemberUser.sendMessage("123", "Hi there!");
        System.out.println(premiumMemberUser.getRoles());
    }

}
