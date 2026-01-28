package bt1;

public class Bt1 {
    private int tuSo;
    private  int mauSo;

    public Bt1(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
            this.mauSo = mauSo;}

    public Double phanSo(){
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public Double phanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo == 0) {
            System.out.println("mau so khac 0");
        } else {
            this.mauSo = mauSo;
        }
    }


}
