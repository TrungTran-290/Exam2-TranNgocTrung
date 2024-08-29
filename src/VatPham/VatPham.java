package VatPham;

public class VatPham {
    protected String tenvatpham;
    protected int chisosucmanh;
    protected double hesosucmanh;
    protected int quydoi;

    public int getChisosucmanh() {
        return chisosucmanh;
    }

    public String getTenvatpham() {
        return tenvatpham;
    }

    public void setTenvatpham(String tenvatpham) {
        this.tenvatpham = tenvatpham;
    }

    public void setHesosucmanh(double hesosucmanh) {
        this.hesosucmanh = hesosucmanh;
    }

    public void setChisosucmanh(int chisosucmanh) {
        this.chisosucmanh = chisosucmanh;
    }

    public double getHesosucmanh() {
        return hesosucmanh;
    }

    public void setHesosucmanh(int hesosucmanh) {
        this.hesosucmanh = hesosucmanh;
    }

    public int getQuydoi() {
        return quydoi;
    }

    public void setQuydoi(int quydoi) {
        this.quydoi = quydoi;
    }
    public double succongpha(){
        return this.chisosucmanh * this.hesosucmanh;
    }
    public void nhap(){

    }
    public double TieuThu(){
        return succongpha()*10;
    }
    public void xuat(){
        System.out.println("Thông Tin Vật Phẩm:");
        System.out.println("Tên Vật Phẩm: "+ this.tenvatpham);
        System.out.println("Chỉ Số Sức Mạnh: "+ this.chisosucmanh);
        System.out.println("Hệ Số Sức Mạnh: "+ this.hesosucmanh);
        System.out.println("Quy Đổi trên sức công phá: "+ this.quydoi+" xu");
        System.out.println("Sức Công Phá: "+succongpha());
        System.out.println("###########################");
    }
    public void VatphamnhieuXuNhat(){
        System.out.println("Tên Vật Phẩm: "+tenvatpham);
        System.out.println("Tổng Xu Tiêu Thụ: "+ TieuThu()+" Xu");
    }
    public double SoVangQuyDoi(){
        return succongpha() * this.quydoi;
    }
}
