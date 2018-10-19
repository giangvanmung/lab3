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
public class PhanSo {
    int tu;
    int mau;
    PhanSo(){
        this.tu = tu;
        this.mau = mau;
    }
    PhanSo(int t, int m){
        this.tu = t;
        this.mau = m;
    }
    // Cong
    static PhanSo cong(PhanSo ps, PhanSo ps1, PhanSo ps2){
        ps.tu = ps1.tu*ps2.mau + ps2.tu*ps1.mau;
        ps.mau = ps1.mau*ps2.mau;
        return ps;
    }
    // Tru
    static PhanSo tru(PhanSo ps, PhanSo ps1, PhanSo ps2){
        ps.tu = ps1.tu*ps2.mau - ps2.tu*ps1.mau;
        ps.mau = ps1.mau*ps2.mau;
        //if(ps.tu == 0)
        //  ps.mau =  0;
        return ps;
    }
     //Nhan
    
    public static int UCLN(int a, int b){
        while(a != b){
            if(a > b)
                a = a - b;
            else 
                b = b - a;
        }
        return a;   
    }
   
    static PhanSo nhan(PhanSo ps, PhanSo ps1, PhanSo ps2){
        int uc;
        PhanSo ps3 = new PhanSo();
        ps.tu = ps1.tu*ps2.tu;
        ps.mau = ps1.mau*ps2.mau;
        uc = UCLN(ps.tu, ps.mau);
        if(ps.tu % uc == 0 && ps.mau % uc == 0)
            ps3.tu = ps.tu/uc;
            ps3.mau = ps.mau/uc;
         
        return ps3;
    }
    static PhanSo chia(PhanSo ps, PhanSo ps1, PhanSo ps2){
        ps.tu = ps1.tu*ps2.mau;
        ps.mau = ps1.mau*ps2.tu;
        return ps;
    }
    // So sanh
    static boolean equals(PhanSo ps1, PhanSo ps2){
        return ps1.tu == ps2.tu && ps1.mau == ps2.mau|| ps1.tu = UCLN(ps.tu, ps.mau) *ps2.tu
                   &&ps1.mau = UCLN(ps.tu,ps.mau)*ps2.mau||ps2.tu = UCLN(ps.tu,ps.mau)*ps1.tu&&ps2.mau = UCLN(ps.tu,ps.mau)*ps1.mau;   
    }
    public static void main(String[] args){
        PhanSo ps1 = new PhanSo(2, 4);
        PhanSo ps2 = new PhanSo(2, 5);
        PhanSo ps = new PhanSo();
       
        //cong(ps,ps1,ps2);
        //tru(ps,ps1,ps2);
        nhan(ps,ps1,ps2);
        //chia(ps,ps1,ps2);
        System.out.println(ps.tu + "/" + ps.mau);
 
        System.out.println(equals(ps1,ps2));
    }
            
}
