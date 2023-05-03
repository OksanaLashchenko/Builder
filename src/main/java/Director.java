public class Director {

    public void buildQuery(Builder builder) {
        builder.reset();
        builder.setSelectQuery();
        builder.setWhereQuery();
        builder.setLimitQuery();
    }

}
