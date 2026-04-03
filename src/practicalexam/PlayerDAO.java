package practicalexam;

import java.sql.*;
import java.util.ArrayList;

public class PlayerDAO {

    // Câu 1: Insert Player [cite: 18, 26]
    public void insertPlayer(int nationalId, String name, int score, int level) throws SQLException {
        String sql = "INSERT INTO Player (NationalId, PlayerName, HighScore, Level) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, nationalId);
            pstmt.setString(2, name);
            pstmt.setInt(3, score);
            pstmt.setInt(4, level);
            pstmt.executeUpdate();
            System.out.println("Thêm người chơi thành công!");
        }
    }

    // Câu 1: Delete Player [cite: 18, 26]
    public void deletePlayer(int playerId) throws SQLException {
        String sql = "DELETE FROM Player WHERE PlayerId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, playerId);
            pstmt.executeUpdate();
            System.out.println("Xóa thành công!");
        }
    }

    // Câu 2: Display All [cite: 19, 26]
    public void displayAll() throws SQLException {
        String sql = "SELECT * FROM Player";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("ID | Name | Score | Level");
            while (rs.next()) {
                System.out.printf("%d | %s | %d | %d\n",
                        rs.getInt("PlayerId"), rs.getString("PlayerName"),
                        rs.getInt("HighScore"), rs.getInt("Level"));
            }
        }
    }

    // Câu 3: Find by Name [cite: 23, 26]
    public void displayAllByPlayerName(String name) throws SQLException {
        String sql = "SELECT * FROM Player WHERE PlayerName LIKE ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Tìm thấy: " + rs.getString("PlayerName"));
            }
        }
    }

    // Câu 4: Top 10 High Score [cite: 24, 26]
    public void displayTop10() throws SQLException {
        String sql = "SELECT * FROM Player ORDER BY HighScore DESC LIMIT 10";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("--- TOP 10 HIGH SCORE ---");
            while (rs.next()) {
                System.out.println(rs.getString("PlayerName") + ": " + rs.getInt("HighScore"));
            }
        }
    }
}