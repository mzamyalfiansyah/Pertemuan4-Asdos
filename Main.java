public class Main {
        public static void main(String[] args) {
            Balok blk = new Balok(10, 5, 8);
            Kubus kbs = new Kubus(10);

            System.out.println("BALOK");
            System.out.println("Volume Balok adalah = " + blk.Volume());
            System.out.println("Luas Balok adalah = " + blk.Luas());
            
            System.out.println("KUBUSR");
            System.out.println("Volume Kubus adalah = " + kbs.Volume());
            System.out.println("Luas Kubus adalah = " + kbs.Luas());      
        }
}
