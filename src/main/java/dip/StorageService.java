package dip;

public class StorageService {

    private final MongoRepository mongoRepository;

    private final PostgresRepository postgresRepository;

    StorageService(MongoRepository mongoRepository, PostgresRepository postgresRepository) {
        this.mongoRepository = mongoRepository;
        this.postgresRepository = postgresRepository;
    }

    public void saveData() {
        mongoRepository.persist();
        postgresRepository.save();
    }

}
