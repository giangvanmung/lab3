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
public class TamGiac {
        double a, b, c;

        public TamGiac(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getA() {
            return a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getB() {
            return b;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double getC() {
            return c;
        }

        public void KiemTraDacBiet() {
            if (a == b && b == c) 
                System.out.println("tam giac deu");
            else if (a == b || a == c|| b == c) 
                System.out.println("tam giac can");
        }

        public void tamGiacVuong() {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                System.out.println("tam giac vuong");
            else System.out.println("tam giac khong vuong");
        }

        public double chuvi() {
            return a + b + c;
        }
}
