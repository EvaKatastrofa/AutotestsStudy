import containers.PostgreSQLTestContainer;

public class Main {
    public static void main(String[] args) {
        PostgreSQLTestContainer testContainer = new PostgreSQLTestContainer();
        testContainer.start();
    }
}