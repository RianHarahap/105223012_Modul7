class Orang {
    Orang() {
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang {
    Dosen() {
        super(); 
        System.out.println("Dosen dibuat!");
    }
}

public class AktivasiConsSuperclass {
    public static void main(String[] args) {
        Dosen dos = new Dosen();
    }
}
