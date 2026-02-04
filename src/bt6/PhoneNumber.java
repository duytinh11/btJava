package bt6;

import java.util.ArrayList;

public class PhoneNumber {
    private ArrayList<String> phoneList;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phoneList = new ArrayList<>();
        this.phoneList.add(phone);
    }

    public ArrayList<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<String> phoneList) {
        this.phoneList = phoneList;
    }
}
