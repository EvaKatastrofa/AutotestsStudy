package clients;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClient {

    private static String url = null;
    @Getter
    private static Connection connection;
    private static Logger logger = LogManager.getLogger(DBClient.class);

    public static void openDBConnection(String host, String database, String schema, String user, String password) throws SQLException {
        url = String.format("jdbc:postgresql://%s:5432/%s?currentSchema=%s", host, database, schema);
        connection = DriverManager.getConnection(url, user, password);
        logger.info("Подключение к PostgreSQL создано");

    }

    public static void closeDBConnection() {
        try {
            connection.close();
        } catch (Exception exception) {
            logger.info("При запуске тестов не выполнялось подключение к БД");
            logger.info(exception);
        }

        logger.info("Соединение с PostgreSQL успешно закрыто");
    }

    public static Result<Record> insertIntoTable(Table table, Record record) {
        DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);

        String sql = create
                .insertInto(table)
                .set(record)
                .getSQL(ParamType.INLINED);

        logger.info("Запрос: {}", sql);
        Result<Record> result = create.fetch(sql);
        logger.info("\n" + result);

        return result;
    }




}
