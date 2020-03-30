package dip;

import java.util.List;

public class StorageService {

    private final List<Repository> repositories;

    StorageService(List<Repository> repositories) {
        this.repositories = repositories;
    }

    public void saveData() {
        repositories.forEach(Repository::save);
    }

}
