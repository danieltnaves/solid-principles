package srp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserService {

    private static final String userStoreFileName = "user-store.dat";

    public void sendWave(String userId) {
        System.out.println("Sending wave to " + userId);
    }

    public void store(User user) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userStoreFileName))) {
            writer.write(user.toString());
        }
    }

}
