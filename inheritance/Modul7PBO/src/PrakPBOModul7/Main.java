package PrakPBOModul7;

class Kendaraan { //parent class
    String merk = "GWM";

    Kendaraan(){
        System.out.println("ini constructor parent");
    }
    void jalan() {
        System.out.println("Mobil berjalan");
    }
}



class Mobil extends Kendaraan {// Child Class
    String merk = "BMW";
    Mobil() {
        super();
        System.out.println("ini constructor child");
    }
    void printInfo(){
        System.out.println("Merk Mobil child " + merk);
        System.out.println("Merk mobil parent " + super.merk);
    }
    void klakson(String merk){
        System.out.println("Mobil " + super.merk + " Klakson");
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Mobil bmw = new Mobil();
        bmw.jalan();
        bmw.printInfo();
        bmw.klakson("BMW");
        System.out.println(bmw.merk);
    }
}
