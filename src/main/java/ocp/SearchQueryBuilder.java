package ocp;

import java.util.List;

public class SearchQueryBuilder {

    private static final String FILTER_QUERY = "SELECT * FROM user WHERE active = 1";

    public String buildFilterQuery(List<FilterCriteria> filtersCriterias) {
        final StringBuilder query = new StringBuilder(FILTER_QUERY);
        filtersCriterias.forEach(filterCriteria -> query.append(filterCriteria.getCriteria()));
        return query.toString();
    }

}
