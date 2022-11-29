package src.main.java.br.com.takeiteasy.takeiteasy.modules.DAO;

public class SubjectDAO {
    String jdbcURL = "jdbc:postgresql://localhost:5432/takeiteasy";
    String username = "postgres";
    String password = "1234"; 
    private void insert() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO discipline () VALUES ()";
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
