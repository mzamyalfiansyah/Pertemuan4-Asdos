public class Main {
        public static void main(String[] args) {
            BangunRuang blk = new Balok(10, 5, 8);
            BangunRuang kbs = new Kubus(10);

            System.out.println("=================================");
            System.out.println("BALOK");
            System.out.println("Volume Balok adalah = " + blk.Volume());
            System.out.println("Luas Balok adalah = " + blk.Luas());
            
            System.out.println("=================================");

            System.out.println("KUBUSD");
            System.out.println("Volume Kubus adalah = " + kbs.Volume());
            System.out.println("Luas Kubus adalah = " + kbs.Luas());    
            System.out.println("=================================");  
        }
}
