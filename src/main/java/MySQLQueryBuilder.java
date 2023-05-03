public class MySQLQueryBuilder implements Builder {

    private MySQLQuery result;

    @Override
    public void reset() {
        result = new MySQLQuery();
    }

    @Override
    public void setSelectQuery() {
        result.setSelect("MySQLQuerySelect");
    }

    @Override
    public void setWhereQuery() {
        result.setWhere("MySQLQueryWhere");
    }

    @Override
    public void setLimitQuery() {
        result.setLimit("MySQLQueryLimit");
    }

    public MySQLQuery getSql() {
        return this.result;
    }

}

