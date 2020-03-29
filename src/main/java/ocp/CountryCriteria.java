package ocp;

public class CountryCriteria implements FilterCriteria {

    private final String filterValue;

    CountryCriteria(String filterValue) {
        this.filterValue = filterValue;
    }

    @Override
    public String getCriteria() {
        return filterValue.isEmpty() ? "" : String.format(" AND country = %s", filterValue);
    }
}
