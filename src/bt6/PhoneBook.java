package bt6;

import java.util.ArrayList;

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


    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String newPhone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }


}
