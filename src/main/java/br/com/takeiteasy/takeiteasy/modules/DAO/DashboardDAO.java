package src.main.java.br.com.takeiteasy.takeiteasy.modules.DAO;

public class DashboardDAO {
    String jdbcURL = "jdbc:postgresql://localhost:5432/takeiteasy";
    String username = "postgres";
    String password = "1234"; 
    private void insert() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO dashboard () VALUES ()";
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
