package bt6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                if (!p.getPhoneList().contains(phone)) {
                    p.getPhoneList().add(phone);
                    System.out.println("Đã thêm số mới cho " + name);
                } else {
                    System.out.println("Số điện thoại này đã tồn tại cho " + name);
                }
                return;
            }
        }
        phoneList.add(new PhoneNumber(name, phone));
        System.out.println("Đã thêm liên hệ mới thành công.");
    }

    @Override
    public void removePhone(String name) {
        boolean isRemoved = phoneList.removeIf(p -> p.getName().equals(name));
        if (isRemoved) {
            System.out.println("Đã xóa liên hệ của: " + name);
        } else {
            System.out.println("Không tìm thấy tên trong danh bạ.");
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                p.getPhoneList().clear();
                p.getPhoneList().add(newPhone);
                System.out.println("Đã cập nhật số điện thoại cho " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng này để cập nhật.");
    }

    @Override
    public void searchPhone(String name) {
        boolean found = false;
        for (PhoneNumber p : phoneList) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Kết quả tìm thấy: " + p.getName() + " - " + p.getPhoneList());
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Không tìm thấy người dùng: " + name);
    }


    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber p1, PhoneNumber p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });
        System.out.println("Danh sách đã được sắp xếp theo tên.");
    }



}
