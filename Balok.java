public class Balok extends BangunRuang{
    double P,L,T;

    public Balok(double P,double L, double T){
        this.P = P;
        this.L = L;
        this.T = T;
    }


    @Override
    public double Volume(){
        return P * L * T;
    }


    @Override
    public double Luas(){
        return 2 * (P * L + P * T + L * T);
    }


}