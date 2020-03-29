package ocp;

import java.util.List;

public class SearchQueryBuilder {

    public String buildFilterQuery(List<Pair> filters) {
        final StringBuilder query = new StringBuilder("SELECT * FROM user WHERE active = 1");
        filters.forEach(pair -> {
            if (pair.getKey().equals("NAME") && !pair.getValue().isEmpty()) {
                query.append(String.format(" AND name = %s", pair.getValue()));
            }
            if (pair.getKey().equals("COUNTRY") && !pair.getValue().isEmpty()) {
                query.append(String.format(" AND country = %s", pair.getValue()));
            }
            if (pair.getKey().equals("CITY") && !pair.getValue().isEmpty()) {
                query.append(String.format(" AND city = %s", pair.getValue()));
            }
        });
        return query.toString();
    }

}
