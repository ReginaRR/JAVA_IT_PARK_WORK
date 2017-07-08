import org.springframework.jdbc.datasource.DriverManagerDataSource;
import dao.UsersDao;
import dao.UsersDaoJdbcTemplateImpl;
import models.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/fatkhalislamova_project");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);

        User regina = new User("Регина", "Regina6", "Zaq12wsx");
        System.out.println(usersDao.save(regina));

    }
}