package srp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserRepository {

    static final String userStoreFileName = "user-store.dat";

    public void store(User user) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userStoreFileName))) {
            writer.write(user.toString());
        }
    }
}
