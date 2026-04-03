package practicalexam;

public class Main {
    public static void main(String[] args) {
        PlayerDAO dao = new PlayerDAO();

        try {
            System.out.println("BẮT ĐẦU CHẠY CHƯƠNG TRÌNH...\n");

            // --- TEST CÂU 1 ---
            System.out.println("[TEST CÂU 1: Insert dữ liệu]");
            dao.insertNational("Vietnam");
            dao.insertNational("USA");
            dao.insertNational("Japan");

            // Insert Người chơi (Giả định NationalId: 1 là VN, 2 là USA, 3 là Japan)
            dao.insertPlayer(1, "Player 1", 100, 2);
            dao.insertPlayer(2, "Player 2", 1050, 10);
            dao.insertPlayer(3, "Player 3", 200, 5);
            dao.insertPlayer(1, "Tjpro", 9999, 50);

            // --- TEST CÂU 2 ---
            System.out.println("\n[TEST CÂU 2: Hiển thị tất cả]");
            dao.displayAll();

            // --- TEST CÂU 3 ---
            System.out.println("[TEST CÂU 3: Tìm kiếm theo tên]");
            dao.displayAllByPlayerName("Player 2");

            // --- TEST CÂU 4 ---
            System.out.println("\n[TEST CÂU 4: Hiển thị Top 10]");
            dao.displayTop10();

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi kết nối hoặc truy vấn CSDL:");
            e.printStackTrace();
        }
    }
}