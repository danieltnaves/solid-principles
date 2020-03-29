package ocp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<FilterCriteria> filters = new ArrayList<>();
        filters.add(new NameCriteria("Daniel"));
        filters.add(new CityCriteria("Berlin"));
        filters.add(new CountryCriteria("German"));
        System.out.println(new SearchQueryBuilder().buildFilterQuery(filters));
    }
}
