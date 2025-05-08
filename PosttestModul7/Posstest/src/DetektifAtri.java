class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama di subclass: " + nama);
        System.out.println("Nama di superclass: " + super.nama);
    }
}

public class DetektifAtri {
    public static void main(String[] args) {
        GedungSekolah School = new GedungSekolah();
        School.tampilkanInfo();
    }
}

