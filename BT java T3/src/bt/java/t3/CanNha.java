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
public class CanNha {
    String mau;
    int soTang;
    int dai;
    int rong;
    int cao;
    CanNha(int c, int r, int d, int st){
        this.cao = c;
        this.rong = r;
        this.dai = d;
        this.soTang = st;
    }
    public void setMau(String mau){
        this.mau = mau;
    }
    public String getMau(){
        return mau;
    }
    public void setSoTang(int soTang){
        this.soTang = soTang;
    }
    public int getSoTang(){
        return soTang;
    }
    public void setDai(int dai){
        this.dai = dai;
    }
    public int getDai(){
        return dai;
    }
    public void setRong(int rong){
        this.rong = rong;
    }
    public int getRong(){
        return rong;
    }
    public void setCao(int cao){
        this.cao = cao;
    }
    public int getCao(){
        return cao;
    }
    static int dienTich(CanNha cn){
        return cn.rong*cn.dai*cn.cao*cn.soTang;
    }
    static void doCao(){
        if(soTang >= 50)
            System.out.println("Nha cao oc");
        else if(soTang < 50 && soTang > 2)
            System.out.println("Nha cao tang");
        else 
            System.out.println("Nha cap 4");
    }
    
    public static void main(String[] args){
        CanNha cn = new CanNha(5,10,15,10);
//        cn.setRong(20);
//        cn.setDai(30);
//        cn.setCao(5);
//        cn.setSoTang(10);
        System.out.println(dienTich(cn));
    }
}
