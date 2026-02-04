package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SV a =new SV();


        System.out.println(" NHẬP THÔNG TIN SINH VIÊN ");
        System.out.print("Nhập họ tên: ");
        String Ten = sc.nextLine();
        a.setHoTen(Ten);

        System.out.print("Nhập mã SV: ");
        String ma = sc.nextLine();
        a.setMaSV(ma);

        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
        a.setAge(tuoi);

        System.out.print("Nhập điểm TB: ");
        double diem = sc.nextDouble();
        a.setDiemTB(diem);

        System.out.println("THÔNG TIN VỪA NHẬP");
        a.ThongTin();

    }
}
