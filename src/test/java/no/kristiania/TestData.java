package no.kristiania;

import org.flywaydb.core.Flyway;
import org.h2.jdbcx.JdbcDataSource;

import javax.sql.DataSource;
import java.util.Random;

public class TestData<T> {
    public static DataSource testDataSource() {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setUrl("jdbc:h2:mem:surveydb;DB_CLOSE_DELAY=-1");
        Flyway.configure().dataSource(dataSource).load().migrate();

        return dataSource;
    }

    private static Random random = new Random();

    public static String pickOne(String ... alternatives) {
        return alternatives[random.nextInt(alternatives.length)];
    }
    public static Integer pickOneInteger(Integer ... alternatives) {
        return alternatives[random.nextInt(alternatives.length)];
    }
}