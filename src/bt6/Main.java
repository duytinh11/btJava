package bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- QUẢN LÝ DANH BẠ ---");
            System.out.println("1. Thêm số điện thoại (Insert)");
            System.out.println("2. Xóa liên hệ (Remove)");
            System.out.println("3. Cập nhật số điện thoại (Update)");
            System.out.println("4. Tìm kiếm (Search)");
            System.out.println("5. Sắp xếp danh sách (Sort)");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng (1-6): ");

            int choice = sc.nextInt();
            sc.nextLine(); //

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String nameInsert = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phoneInsert = sc.nextLine();
                    myPhoneBook.insertPhone(nameInsert, phoneInsert);
                    break;

                case 2:
                    System.out.print("Nhập tên cần xóa: ");
                    String nameRemove = sc.nextLine();
                    myPhoneBook.removePhone(nameRemove);
                    break;

                case 3:
                    System.out.print("Nhập tên cần cập nhật: ");
                    String nameUpdate = sc.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    String newPhone = sc.nextLine();
                    myPhoneBook.updatePhone(nameUpdate, newPhone);
                    break;

                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String nameSearch = sc.nextLine();
                    myPhoneBook.searchPhone(nameSearch);
                    break;

                case 5:
                    myPhoneBook.sort();
                    for (PhoneNumber p : myPhoneBook.getPhoneList()) {
                        System.out.println(p.getName() + " : " + p.getPhoneList());
                    }
                    break;

                case 6:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
