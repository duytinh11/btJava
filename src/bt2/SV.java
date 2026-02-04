package bt2;

public class SV {
    private String maSV, HoTen;
    private int Age;
    private  Double diemTB;

    public SV(String maSV, String hoTen, int age, Double diemTB) {
        this.maSV = maSV;
        HoTen = hoTen;
        Age = age;
        this.diemTB = diemTB;
    }
    public SV() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    public void ThongTin(){
        System.out.println("Ho Ten SV: "+HoTen);
        System.out.println("MSV: "+maSV );
        System.out.println("Tuoi: "+Age);
        System.out.println("Diem TB: "+diemTB);
    }
}
