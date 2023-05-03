public class PostgreSQLQuery {

    private String select;
    private String where;
    private String limit;

    public String setSelect(String select) {
        this.select = select;
        return select;
    }

    public String setWhere(String where) {
        this.where = where;
        return where;
    }

    public String setLimit(String limit) {
        this.limit = limit;
        return limit;
    }

    @Override
    public String toString() {
        return "PostgreSQLQuery{" +
                "select='" + select + '\'' +
                ", where='" + where + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }

}
