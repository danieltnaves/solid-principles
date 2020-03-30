package lsp;

import java.util.Arrays;
import java.util.List;

class FreeUser extends User {

    private static final String FREE_ROLE = "FREE_ROLE";

    @Override
    public List<String> getRoles() {
        return Arrays.asList(FREE_ROLE);
    }
}
