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
    public void NhapPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại phòng:");
        System.out.println("A \n" +
                "B \n" +
                "C");
        loai = sc.nextLine();
        if (loai.equals("A")) {
            Phong phongA = new PhongA();
        }
        if (loai.equals("B")) {
            Phong phongB = new PhongB();
        }
        if (loai.equals("C")) {
            Phong phongC = new PhongC();
        }
    }


}
