package bt1;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private  int mauSo;

    public PhanSo() {
    }
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.setMauSo(mauSo);
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
        if (mauSo == 0) System.out.println("mau so khac 0...");
        else this.mauSo = mauSo;}

    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tuSo...");
        this.tuSo = sc.nextInt();
        do {
            System.out.print("Nhap mauSo (khác 0): ");
            this.mauSo = sc.nextInt();
        } while (this.mauSo == 0);
    }
    public void inPhanso(){
        if (mauSo == 1) System.out.println(tuSo);
        else if (tuSo ==0) System.out.println(0);
        else System.out.println(tuSo + "/" + mauSo);
    }
    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public void rutGon() {
        int ucln = timUCLN(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
        // Đưa dấu trừ lên tử số nếu có
        if (this.mauSo < 0) {
            this.tuSo = -this.tuSo;
            this.mauSo = -this.mauSo;
        }
    }

    // Nghịch đảo phân số
    public void nghichDao() {
        if (tuSo != 0) {
            int temp = tuSo;
            tuSo = mauSo;
            mauSo = temp;
        } else {
            System.out.println("Không thể nghịch đảo vì tử số bằng 0.");
        }
    }

    // Các phép toán
    public PhanSo add(PhanSo ps2) {
        int ts = this.tuSo * ps2.mauSo + ps2.tuSo * this.mauSo;
        int ms = this.mauSo * ps2.mauSo;
        PhanSo ketQua = new PhanSo(ts, ms);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo sub(PhanSo ps2) {
        int ts = this.tuSo * ps2.mauSo - ps2.tuSo * this.mauSo;
        int ms = this.mauSo * ps2.mauSo;
        PhanSo ketQua = new PhanSo(ts, ms);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo mul(PhanSo ps2) {
        int ts = this.tuSo * ps2.tuSo;
        int ms = this.mauSo * ps2.mauSo;
        PhanSo ketQua = new PhanSo(ts, ms);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo div(PhanSo ps2) {
        int ts = this.tuSo * ps2.mauSo;
        int ms = this.mauSo * ps2.tuSo;
        PhanSo ketQua = new PhanSo(ts, ms);
        ketQua.rutGon();
        return ketQua;
    }

}
