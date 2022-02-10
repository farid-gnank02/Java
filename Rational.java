/* TP1 de Java*/

public class Rational{
    private int n;
    private int d;

    public Rational(int a, int b) {
        this.n=a;
        this.d=b;

        /* Condition sur le dénominateur */
        if (d==0){
            throw new IllegalArgumentException("Le dénominateur doit être non nul!");
        }
    }
    public int getD() {
        return d;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setD(int d) {
        if (d==0){
            throw new IllegalArgumentException("Le dénominateur doit être non nul!");
        }
        this.d = d;
    }
    public String toString() {
        return "La fraction est:"+n+"/"+d+" Numerateur:"+n+" Denominateur:"+d;
    }

    public void mult(Rational r) {
        this.n=n*(r.n);
        this.d=d*(r.d);
    }

    public void addition(Rational r) {
        this.n= n*(r.d) +(r.n)*d;
        this.d= d*(r.d);
    }
}