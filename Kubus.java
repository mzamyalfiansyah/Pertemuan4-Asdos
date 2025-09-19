public class Kubus {
    double S;

    public Kubus(double S){
        this.S = S;
    }

    public double Volume(){
        return S * S * S;
    }

    public double Luas(){
        return 6 * S * S;
    }
}
