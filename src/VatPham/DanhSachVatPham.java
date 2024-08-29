package VatPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    List<VatPham> list;

    public DanhSachVatPham() {
        list = new ArrayList<>();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng vật phẩm Spon sẽ thu hoạch");
        int sl = scanner.nextInt();
        for (int count = 0; count < sl; count++) {
            System.out.println("Các Sản Phẩm Có Thể Thu Hoạch:");
            System.out.println("1: Chiếc búa thần");
            System.out.println("2: Bao tay sấm sét");
            System.out.println("3: Hòn đá kích nổ");
            System.out.println("4: Cây rìu phép thuật");
            System.out.println("5: Cây gậy chiến thần");
            System.out.println("Hãy đưa ra lựa chọn của bạn:");
            int i = scanner.nextInt();
            if (i == 1) {
                VatPham vatPham = new BuaThan();
                vatPham.nhap();
                list.add(vatPham);
            } else if (i == 2) {
                VatPham vatPham = new BaoTaySamSet();
                vatPham.nhap();
                list.add(vatPham);
            } else if (i == 3) {
                VatPham vatPham = new HonDaKickNo();
                vatPham.nhap();
                list.add(vatPham);
            } else if (i == 4) {
                VatPham vatPham = new CayRiuPhepThuat();
                vatPham.nhap();
                list.add(vatPham);
            } else if (i == 5) {
                VatPham vatPham = new CayGayChienThan();
                vatPham.nhap();
                list.add(vatPham);
            }
        }
    }

    public void xuat() {
        for (VatPham i : list) {
            i.xuat();
        }
    }

    public double TieuThuXuMax() {
        double maxXu= 0;
        for (VatPham i : list) {
            if(i.TieuThu()>=maxXu){
                maxXu =i.TieuThu();
            }
        }
        return maxXu;
    }

    public void cau3() {
        System.out.println("Các Vật Phẩm Tiêu Thụ Nhiều Xu Nhất Chính Là:");
        list.stream()
                .filter(vatPham -> vatPham.TieuThu() == TieuThuXuMax())
                .forEach(vatPham -> vatPham.VatphamnhieuXuNhat());
    }
    List<VatPham> listFull = new ArrayList<>();


    public double XuDeWin(){
        double tong = listFull.stream()
                .mapToDouble(value -> value.SoVangQuyDoi())
                .sum();
        return tong;
    }
    public void cau4(){
        VatPham vatPham1 = new BuaThan();
        listFull.add(vatPham1);
        VatPham vatPham2 = new BaoTaySamSet();
        listFull.add(vatPham2);
        VatPham vatPham3 = new HonDaKickNo();
        listFull.add(vatPham3);
        VatPham vatPham4 = new CayRiuPhepThuat();
        listFull.add(vatPham4);
        VatPham vatPham5 = new CayGayChienThan();
        listFull.add(vatPham5);
        System.out.print("Số Vàng Mà Spon thu được là: ");
        double tong = list.stream()
                .mapToDouble(value -> value.SoVangQuyDoi())
                .sum();
        System.out.println(tong + " Xu");
        System.out.println("Số Vàng Mà Spon cần để cứu đồng đội mình là: "+XuDeWin()+" Xu");
        if (tong<XuDeWin()){
            System.out.println("Spon đã không thu thập đủ xu và không thể cứu đồng đội mình\n"+ "Spon còn thiếu: "+(XuDeWin()-tong));
        } else if (tong >= XuDeWin()) {
            System.out.println("Spon đã chiến thắng và giải cứu đồng đội của mình\n"+ "Spon còn lại: "+(tong-XuDeWin())+" Xu");
            System.out.println("########-END-########");
        }
    }
}
