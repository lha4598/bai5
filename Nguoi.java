import java.util.Scanner;

public class Nguoi {
    private String ten;
    private int tuoi, songay;
    private String cccd;
    private Phong phong;

    public Nguoi() {

    }
    public Nguoi(String ten, int tuoi, String cccd, int songay, Phong phong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.cccd = cccd;
        this.songay = songay;
        this.phong = phong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên : ");
        ten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập CCCD");
        cccd = sc.nextLine();
        phong = new Phong();
        phong.NhapPhong();
        System.out.println("Nhập số ngày thuê: ");
        songay = sc.nextInt();
        sc.nextLine();
    }

}
