package dip;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StorageService storageService = new StorageService(Arrays.asList(new MongoRepository(), new PostgresRepository()));
        storageService.saveData();
    }

}
