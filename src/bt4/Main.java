package bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee("Nguyễn Văn A", "FT01", 15000000));
        list.add(new PartTimeEmployee("Trần Thị B", "PT01", 80, 50000));

        System.out.println("----- DANH SÁCH LƯƠNG NHÂN VIÊN -----");
        for (Employee e : list) {
            System.out.println(e.NV() + " | Lương: " + String.format("%,.0f VNĐ", e.getSalary()));
        }
    }
}