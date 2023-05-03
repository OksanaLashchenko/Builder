public class PostgreSQLQueryBuilder implements Builder {

    private PostgreSQLQuery result;

    @Override
    public void reset() {
        result = new PostgreSQLQuery();
    }

    @Override
    public void setSelectQuery() {
        result.setSelect("PostgreSQLQuerySelect");
    }

    @Override
    public void setWhereQuery() {
        result.setWhere("PostgreSQLQueryWhere");
    }

    @Override
    public void setLimitQuery() {
        result.setLimit("PostgreSQLQueryLimit");
    }

    public PostgreSQLQuery getSql() {
        return result;
    }

}
