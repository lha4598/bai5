import java.util.ArrayList;
import java.util.List;

public class QuanLyKhach {
    private List<Nguoi> nguois;
    public QuanLyKhach() {
        nguois = new ArrayList<Nguoi>();
    }
    public void addNguoi(Nguoi nguoi) {
        nguois.add(nguoi);
    }
    public int tinhTien(String c) {
        Nguoi nguoi = this.nguois.stream().filter(nguoi1 -> nguoi1.getCccd().equals(c)).findFirst().orElse(null);
        if (nguoi == null) {
            return 0 ;
        }else {
            return nguoi.getPhong().getGia() * nguoi.getSongay();
        }
    }
    public void showDanhSach(Nguoi nguoi) {
        this.nguois.forEach(n -> System.out.println("hh"));
    }

}
