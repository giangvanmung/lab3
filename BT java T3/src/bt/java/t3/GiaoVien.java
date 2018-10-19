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
public class GiaoVien {
    String ten, gioiTinh;
    int tuoi, luong, diem;
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setTrinhDo(int trinhDo){
        this.diem = trinhDo;
    }
    public int getTrinhDo(){
        return diem;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setLuong(int luong){
        this.luong = luong;
    }
    public int getLuong(){
        return luong;
    }
    public void ThuNhap(){
        if(this.luong >= 5000000)
            System.out.println("Co thu nhap Cao");
        else 
            System.out.println("co thu nhap thap");
    }
    public void KiemTraTuoi(){
        if(this.tuoi > 60)
            System.out.println("Giao vien da nghi huu");
        else if(this.tuoi > 18 && this.tuoi < 60)
            System.out.println("Giao vien dang cong tac");
        else 
            System.out.println("Chua du tuoi lao dong");
    }
    public void trinhDo(){
        if(diem >= 9)
            System.out.println("trinh do rat cao");
        else if(diem >= 8 && diem < 9)
            System.out.println("trinh do cao");
        else
            System.out.println("trinh do trung binh");
        
}
}
