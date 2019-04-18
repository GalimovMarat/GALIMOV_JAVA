import org.springframework.jdbc.datasource.DriverManagerDataSource;
import repositories.UserRepositoryJdbcImpl;
import utils.UserFromConsoleRetriever;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        // чтобы конструкция была более гибкой из DataBaseConnector в MAIN
        // вытаскиваем следующее:
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
//        После применения JDBCTeamplate нам и это не нужно
//        final String DB_USER = "postgres";
//        final String DB_PASSWORD ="zapcon";
//        final String DB_URL = "jdbc:postgresql://localhost:5432/";
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("zapcon");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/");
        UserRepositoryJdbcImpl userRepositoryJdbc = new UserRepositoryJdbcImpl(dataSource);
//
//        // Соответственно меняем тут:
////        DataBaseConnector connector = new DataBaseConnector();
//        DataBaseConnector connector = new DataBaseConnector(DB_URL, DB_USER, DB_PASSWORD);
//        UserRepositoryJdbcImpl userRepositoryJdbc = new UserRepositoryJdbcImpl(connector);

//      Connection connection = connector.getConnection ();

        // После всех изменений в DataBaseConnector тут в Statement
        // connection меняем на connector.
//      Statement statement = connection.createStatement();

        // После реализации ResultSet в DataBaseConnector
        // удаляем строку, она больше не нужна
//        Statement statement = connector.createStatement();

        // В строке ResultSet resultset
        // опять возникает необходимость обрабатывать исключения
        // поэтому опять делаем это в DataBaseConnector
//       ResultSet resultset =  statement.executeQuery("select *from user_servise");
        // и меняем statement.executeQuery("select *from user_servise")
        // на сtatement.executeQuery("select *from user_servise");
//        ResultSet resultset =  connector.executeQuery("select *from user_servise");
//        while (resultset.next()){
//            try {
//                System.out.println(resultset.getString("first_name") + " " +  resultset.getString("last_name"));
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

        System.out.println(userRepositoryJdbc.findById(2l));
//        System.out.println(userRepositoryJdbc.findById(21l));
//        userRepositoryJdbc.save(retriever.retrieveUser());







    }
}
