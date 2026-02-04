package bt1;

public class Main {
    public static void main(String [] args){
        PhanSo ps1 = new PhanSo();
        System.out.println("--- Nhập phân số 1 ---");
        ps1.nhapPhanSo();

        PhanSo ps2 = new PhanSo(1, 3); // Tạo nhanh phân số 1/3
        System.out.print("Phân số 2: ");
        ps2.inPhanso();


        PhanSo tong = ps1.add(ps2);
        System.out.print("Kết quả cộng (ps1 + 1/3): ");
        tong.inPhanso();


        System.out.println("Nghịch đảo phân số 1...");
        ps1.nghichDao();
        ps1.inPhanso();
    }
}