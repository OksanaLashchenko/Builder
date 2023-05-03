public class MySQLQuery {

    private String select;
    private String where;
    private String limit;

    public void setSelect(String select) {
        this.select = select;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "MySQLQuery{" +
                "select='" + select + '\'' +
                ", where='" + where + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }

}
