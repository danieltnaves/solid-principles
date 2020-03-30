package dip;

public class PostgresRepository implements Repository {

    public void save() {
        System.out.println("Saving to PostgreSQL...");
    }

}
