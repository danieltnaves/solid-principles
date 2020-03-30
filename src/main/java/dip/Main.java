package dip;

public class Main {

    public static void main(String[] args) {
        StorageService storageService = new StorageService(new MongoRepository(), new PostgresRepository());
        storageService.saveData();
    }

}
