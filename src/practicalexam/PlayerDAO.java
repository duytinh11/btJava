package practicalexam;

import java.sql.*;

public class PlayerDAO {


    public void insertNational(String nationalName) throws SQLException {
        String sql = "INSERT INTO National (NationalName) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nationalName);
            pstmt.executeUpdate();
            System.out.println("-> Đã thêm quốc gia: " + nationalName);
        }
    }


    public void deleteNational(int nationalId) throws SQLException {
        String sql = "DELETE FROM National WHERE NationalId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, nationalId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("-> Đã xóa quốc gia có ID: " + nationalId);
        }
    }


    public void insertPlayer(int nationalId, String playerName, int highScore, int level) throws SQLException {
        String sql = "INSERT INTO Player (NationalId, PlayerName, HighScore, Level) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, nationalId);
            pstmt.setString(2, playerName);
            pstmt.setInt(3, highScore);
            pstmt.setInt(4, level);
            pstmt.executeUpdate();
            System.out.println("-> Đã thêm người chơi: " + playerName);
        }
    }


    public void deletePlayer(int playerId) throws SQLException {
        String sql = "DELETE FROM Player WHERE PlayerId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, playerId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("-> Đã xóa người chơi có ID: " + playerId);
        }
    }



    public void displayAll() throws SQLException {
        String sql = "SELECT p.PlayerId, p.PlayerName, p.HighScore, p.Level, n.NationalName " +
                "FROM Player p JOIN National n ON p.NationalId = n.NationalId";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- DANH SÁCH TẤT CẢ NGƯỜI CHƠI ---");
            System.out.printf("%-10s | %-15s | %-12s | %-6s | %-10s\n",
                    "Player Id", "Player name", "High Score", "Level", "National");
            System.out.println("-------------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-10d | %-15s | %-12d | %-6d | %-10s\n",
                        rs.getInt("PlayerId"),
                        rs.getString("PlayerName"),
                        rs.getInt("HighScore"),
                        rs.getInt("Level"),
                        rs.getString("NationalName"));
            }
            System.out.println("-------------------------------------------------------------------\n");
        }
    }



    public void displayAllByPlayerName(String name) throws SQLException {
        String sql = "SELECT p.PlayerId, p.PlayerName, p.HighScore, p.Level, n.NationalName " +
                "FROM Player p JOIN National n ON p.NationalId = n.NationalId " +
                "WHERE p.PlayerName LIKE ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();

            System.out.println("--- KẾT QUẢ TÌM KIẾM: '" + name + "' ---");
            while (rs.next()) {
                System.out.printf("Tìm thấy: ID: %d - Name: %s - Score: %d - Level: %d - National: %s\n",
                        rs.getInt("PlayerId"),
                        rs.getString("PlayerName"),
                        rs.getInt("HighScore"),
                        rs.getInt("Level"),
                        rs.getString("NationalName"));
            }
            System.out.println();
        }
    }


    public void displayTop10() throws SQLException {
        String sql = "SELECT p.PlayerName, p.HighScore, n.NationalName " +
                "FROM Player p JOIN National n ON p.NationalId = n.NationalId " +
                "ORDER BY p.HighScore DESC LIMIT 10";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("--- TOP 10 HIGH SCORE PLAYERS ---");
            int rank = 1;
            while (rs.next()) {
                System.out.printf("%d. %-15s | Score: %-6d | %-10s\n",
                        rank++,
                        rs.getString("PlayerName"),
                        rs.getInt("HighScore"),
                        rs.getString("NationalName"));
            }
        }
    }
}