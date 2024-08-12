import java.util.Scanner;

public class Phong {
    private String loai;
    private int gia;

    public Phong() {

    }

    public Phong(String loai, int gia) {
        this.loai = loai;
        this.gia = gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "";
    }
}
