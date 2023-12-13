import clients.DBClient;
import containers.PostgreSQLTestContainer;
import models.db.test_schema.Tables;
import models.db.test_schema.tables.records.StudentsRecord;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        PostgreSQLTestContainer testContainer = new PostgreSQLTestContainer();
        testContainer.start();

        StudentsRecord record1 = new StudentsRecord(1, "Анна", "Экономика");
        StudentsRecord record2 = new StudentsRecord(2, "Дмитрий", "Информатика");
        StudentsRecord record3 = new StudentsRecord(3, "Анастасия", "Переводоведение");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DBClient.openDBConnection("localhost", "test_db", "test_schema", "test_user", "qwerty");

        DBClient.insertIntoTable(Tables.STUDENTS, record1);
        DBClient.insertIntoTable(Tables.STUDENTS, record2);
        DBClient.insertIntoTable(Tables.STUDENTS, record3);

        DBClient.closeDBConnection();

        System.out.println("stop");
    }
}
