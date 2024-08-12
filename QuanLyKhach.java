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
    public boolean xoaNguoi(String cccd) {
        Nguoi nguoi = this.nguois.stream().filter(nguoi1 -> nguoi1.getCccd().equals(cccd)).findFirst().orElse(null);
        if (nguoi == null) {
            return false;
        } else {
            this.nguois.remove(nguoi);
            return true;

        }
    }

    public int tinhTien(String cccd) {
        Nguoi nguoi = this.nguois.stream().filter(nguoi1 -> nguoi1.getCccd().equals(cccd)).findFirst().orElse(null);
        if (nguoi == null) {
            return 0 ;
        }else {
            return nguoi.getPhong().getGia() * nguoi.getSongay();
        }
    }
    public void showDanhSach() {
        this.nguois.forEach(nguoi -> System.out.println(nguoi.toString()));
    }

}
