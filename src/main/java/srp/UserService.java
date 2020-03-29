package srp;

import java.io.IOException;

public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void sendWave(String userId) {
        System.out.println("Sending wave to " + userId);
    }

    public void store(User user) throws IOException {
        userRepository.store(user);
    }

}
