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
public class CaiBan {
    String mau;
    int cao;
    int rong;
    int dai;
    int gia;
    
    CaiBan(){
      this.rong = rong;
      this.dai = dai;
      this.cao = cao;
    }
    public void setMau(String mau){
        this.mau = mau;
    }
    public String getMau(){
        return mau;
    }
    public void setCao(int cao){
        this.cao = cao;   
    }
    public int getCao(){
        return cao;
    }
    public void setRong(int rong){
        this.rong = rong;
    }
    public int getRong(){
        return rong;
    }
    public void setDai(int dai){
        this.dai = dai;
    }
    public int getDai(){
        return dai;
    }
    public void setGia(int gia){
        this.gia = gia;
    }
    public int getGia(){
        return gia;
    }
    static int dienTich(CaiBan cb){
        return cb.rong*cb.dai;
    }
    static void giaCa(CaiBan cb){
        if(cb.gia > 100000)
            System.out.println("Dat");
        else 
            System.out.println("Re");
    }
    public static void main(String [] args){
        CaiBan cb = new CaiBan();
        cb.setDai(20);
        cb.setRong(25);
        System.out.println(dienTich(cb));
        cb.setGia(90000);
        giaCa(cb);
        
    }
    
    }
    
