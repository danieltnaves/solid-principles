package ocp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pair> filters = new ArrayList<>();
        filters.add(new Pair("NAME", "Maria"));
        filters.add(new Pair("CITY", "Berlin"));
        filters.add(new Pair("COUNTRY", "German"));
        System.out.println(new SearchQueryBuilder().buildFilterQuery(filters));
    }
}
