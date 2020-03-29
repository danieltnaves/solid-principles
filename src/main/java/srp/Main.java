package srp;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();
        userService.sendWave("123");
        userService.store(new User("123", "John Doe"));
    }

}
