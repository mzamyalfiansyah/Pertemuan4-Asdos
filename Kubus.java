public class Kubus extends BangunRuang{
    double S;

    public Kubus(double S){
        this.S = S;
    }


    @Override
    public double Volume(){
        return S * S * S;
    }


    @Override
    public double Luas(){
        return 6 * S * S;
    }
}
