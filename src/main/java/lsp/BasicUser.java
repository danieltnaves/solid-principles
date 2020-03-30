package lsp;

import java.util.Arrays;
import java.util.List;

class BasicUser extends User {

    private static final String BASIC_ROLE = "BASIC_ROLE";

    @Override
    public List<String> getRoles() {
        return Arrays.asList(BASIC_ROLE);
    }
}
