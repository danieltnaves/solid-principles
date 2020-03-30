package lsp;

import java.util.Arrays;
import java.util.List;

class PremiumUser extends PremiumMember {

    private static final String PREMIUM_ROLE = "PREMIUM_ROLE";

    @Override
    public List<String> getRoles() {
        return Arrays.asList(PREMIUM_ROLE);
    }
}
