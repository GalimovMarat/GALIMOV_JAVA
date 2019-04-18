package repositories;

import models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class UserRepositoryJdbcImpl implements UserRepository {
    // private final DataBaseConnector connector;
    private JdbcTemplate jdbcTemplate;
    //language=SQL
    private static final String SQL_fingById = "select * from user_servise where id = ? ";
    //language=SQL
    private final static String SQL_selectAll = "select * from user_servise";
    // language=SQL
    private final static String SQL_Add = "insert into user_servise (first_name, last_name, login, pc_number)" +
            "values (?,?,?,?)";


    public UserRepositoryJdbcImpl(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private RowMapper<User> usersRowMapper = (row, rowNumber) ->
            User.builder().id(row.getLong("id"))
            .first_name(row.getString("first_name"))
            .last_name(row.getString("last_name"))
            .login(row.getString("login"))
            .pc_number(row.getString("pc_number"))
            .build();



    @Override
    public void save(User model) {
        //После добавления JDBCTeamplate на эта шляпа не нужна
        //language=sql
//        String insertQuery = "insert into user_servise(first_name, last_name, login, pc_number) " +
//                "values ('" + model.getFirstName() + "','" + model.getLastName() + "','" + model.getLogin()
//                + "','" + model.getPcNumber() + "');";
//        connector.executeUpdate(insertQuery);

//        if (!connector.executeUpdate(insertQuery)) {
//            throw new IllegalStateException("Some error");
//        }
        //Теперь так.
        jdbcTemplate.update(SQL_Add, model.getFirst_name(), model.getLast_name(), model.getLogin(), model.getPc_number());
    }

    @Override
    public User findById(Long id) throws SQLException {
        return jdbcTemplate.queryForObject(SQL_fingById, usersRowMapper, id);
}

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_selectAll, usersRowMapper);
    }







}


