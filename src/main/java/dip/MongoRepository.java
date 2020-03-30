package dip;

public class MongoRepository implements Repository {

    private void persist() {
        System.out.println("Persisting to MongoDB...");
    }

    @Override
    public void save() {
        persist();
    }
}
