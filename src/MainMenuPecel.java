
public class MainMenuPecel {
    public static void main(String[] args) {
        System.out.println("=== KASIR DIGITAL UMKM ===");
        Kasir kasirPecel = new Kasir();
        
        kasirPecel.prosesOrder(new PecelKediri(true));
        kasirPecel.prosesOrder(new PecelKediri(false));
        
        System.out.println("--------------------------");
        System.out.println("TOTAL SALDO: Rp" + kasirPecel.getSaldoKasir());
    }
}