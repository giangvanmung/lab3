/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.java.t3;

/**
 *
 * @author GiangMung
 */
public class SinhVien {
        String ten, gioiTinh, lop;
        int xepHang,diem;

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getTen() {
            return ten;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

        public String getLop() {
            return lop;
        }
        public void setXepHang(int xepHang){
            this.xepHang = xepHang;
        }
        public int getXepHang(){
            return xepHang;
        }
        public void setDiem(int diem){
            this.diem = diem;
        }
        public int getDiem(){
            return diem;
        }
        public void Lop() {
            if (lop.equals("K62-UET"))
                System.out.println("day la hoc sinh K62");
            else 
                System.out.println("Khong phai hoc sinh K62");
        }
      
        public void XepHang() {
            if (xepHang < 10) 
                System.out.println("Co trinh do rat cao");
            else if (xepHang > 10 && xepHang < 20) 
                System.out.println("Co trinh do cao");
            else 
                System.out.println("Co trinh do trung binh va thap");
        }
        public void hocLuc(){
            if(diem >= 9)
                System.out.println("Hoc luc xuat sac");
            else if(diem >= 8 && diem < 9)
                System.out.println("Hoc luc gioi");
            else if(diem < 8 && diem >= 6.5)
                System.out.println("Hoc luc kha");
            else
                System.out.println("Hoc luc trung binh");
        }

    }