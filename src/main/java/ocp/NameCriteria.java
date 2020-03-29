package ocp;

public class NameCriteria implements FilterCriteria {

    private final String filterValue;

    NameCriteria(String filterValue) {
        this.filterValue = filterValue;
    }

    @Override
    public String getCriteria() {
        return filterValue.isEmpty() ? "" : String.format(" AND name = %s", filterValue);
    }
}
