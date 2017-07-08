package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoJdbcTemplateImpl implements UsersDao {

    //language=SQL
    private final static String SQL_SELECT_ALL_USERS =
            "SELECT * FROM users";

    //language=SQL
    private final static String SQL_UPDATE_USER =
            "UPDATE users SET name = ?,  login = ?, password = ? WHERE id = ?";

    //language=SQL
    private final static String SQL_INSERT_USER =
            "INSERT INTO users(name, login, password) VALUES(?, ?, ?)";

    //language=SQL
    private final static String SQL_SELECT_BY_ID =
            "SELECT * FROM users WHERE id = ?";

    private JdbcTemplate template;

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public boolean isExistById(int userId) {
        return false;
    }

    public List<User> findByName(String name) {
        return null;
    }


    public int save(User model) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(template);
        jdbcInsert.withTableName("user").usingGeneratedKeyColumns("id");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", model.getName());
        params.put("login", model.getLogin());
        params.put("password", model.getPassword());
        int id = jdbcInsert.executeAndReturnKey(params).intValue();
        model.setId(id);
        return id;
    }

    public User find(int id) {
        return template.queryForObject(SQL_SELECT_BY_ID, userRowMapper, id);
    }

    public void update(User model) {
        template.update(SQL_UPDATE_USER, model.getName(), model.getLogin(), model.getPassword(), model.getId());
    }
    public void delete(int id) {
    }

    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            return new User(id, name, login, password);
        }
    };

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL_USERS, userRowMapper);
    }
}

