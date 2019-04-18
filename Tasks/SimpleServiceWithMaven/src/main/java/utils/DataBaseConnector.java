package utils;

import java.sql.*;

public class DataBaseConnector {
//    private static final String DB_USER = "postgres";
//    private static final String DB_PASSWORD ="zapcon";
//    private static final String DB_URL = "jdbc:postgresql://localhost:5432/";





// 1.Чтобы в MAIN не обрабатывать исключения для STATEMENT, оборачиваем STATEMENT тут,
// для этого Connection getConnection из public переделываем в private, соответственно
// он блокирается в MAIN и мы его от туда удаляем.

//    public Connection getConnection ()  {
//        try {
//            return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
//        }
//        catch (SQLException e) {
//            throw new IllegalStateException(e);
//        }
//    }

    // После того как в MAIN выносим URL, LOGIN и PASSWORD
    // Переделываем:
//    private Connection getConnection ()  {
////        try {
////            return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
////        }
////        catch (SQLException e) {
////            throw new IllegalStateException(e);
////        }
////    }
    private Connection getConnection (String url, String user, String password)  {
        try {
            return DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    // 2.Добавляем.
    private Connection connection;

   // 3. Далее пишем конструктор для DataBaseConnector (раньше его не было).
//    public DataBaseConnector () {
//        this.connection = getConnection();
//    }
    // После того как в MAIN выносим URL, LOGIN и PASSWORD
    // Переделываем конструктор
        public DataBaseConnector (String url, String user, String password) {
        this.connection = getConnection(url, user, password);
    }


    // 4. Пишем метод
//    public Statement createStatement() {
//        try {
//            return connection.createStatement();
//        } catch (SQLException e) {
//            throw new IllegalStateException(e);
//        }
//    }


    // Перед реализацией ResultSet метод createStatement
    // переделываем в private

    private Statement createStatement() {
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    //Оборачиваем (реализуем) ResultSet тут
    public ResultSet executeQuery (String sql) {
        Statement statement = createStatement();
        try {
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    // Эта штука добавляет в БД
   public boolean executeUpdate (String sql){
            Statement statement = createStatement();
       int rowsAffected = 0;
       try {
           rowsAffected = statement.executeUpdate(sql);
       } catch (SQLException e) {
           throw new IllegalStateException(e);
       }
       return rowsAffected == 1;
   }


   //Эта штука должна вытаскивать всех из БД

}


