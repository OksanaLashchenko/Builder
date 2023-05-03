public class Main {

    public static void main(String[] args) {
        MySQLQueryBuilder mySQLQueryBuilder = new MySQLQueryBuilder();
        PostgreSQLQueryBuilder postgreSQLQueryBuilder = new PostgreSQLQueryBuilder();

        Director director = new Director();
        director.buildQuery(mySQLQueryBuilder);
        MySQLQuery mySQLQuery  = mySQLQueryBuilder.getSql();

        director.buildQuery(postgreSQLQueryBuilder);
        PostgreSQLQuery postgreSQLQuery = postgreSQLQueryBuilder.getSql();

        System.out.println(mySQLQuery);
        System.out.println(postgreSQLQuery);
    }

}
