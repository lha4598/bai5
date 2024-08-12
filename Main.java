import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyKhach khach = new QuanLyKhach();
        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ KHÁCH SẠN---");
            System.out.println("1. Thêm khách thuê");
            System.out.println("2. Xóa khách trả phòng");
            System.out.println("3. Tính tiền cho khách");
            System.out.println("4. Hiện thông tin khách hàng");
            System.out.println("5. Thoát");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    Nguoi nguoi = new Nguoi();
                    nguoi.Nhap();
                    khach.addNguoi(nguoi);
                    break;
                }
                case 2: {

                }
                case 3: {
                    System.out.println("Nhập cccd cần thanh toán: ");
                    String c = sc.nextLine();
                    System.out.println("Số tiền phải trả là: " + khach.tinhTien(c));

                }
                case 4: {

                }
                case 5: {
                    break;
                }

            }
        }
    }
}