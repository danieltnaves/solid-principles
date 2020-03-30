package lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new PremiumUser());
        users.add(new BasicUser());
        users.add(new FreeUser());
        users.forEach(user -> user.sendMessage("123", "Hallo!"));
    }

}
