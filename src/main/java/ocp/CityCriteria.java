package ocp;

public class CityCriteria implements FilterCriteria {

    private final String filterValue;

    CityCriteria(String filterValue) {
        this.filterValue = filterValue;
    }

    @Override
    public String getCriteria() {
        return filterValue.isEmpty() ? "" : String.format(" AND city = %s", filterValue);
    }
}
