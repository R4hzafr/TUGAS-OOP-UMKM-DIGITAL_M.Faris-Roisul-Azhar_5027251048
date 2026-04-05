
class Kasir {
    private double saldoKasir = 0;

    public void prosesOrder(MenuPecel orderan) {
        double bill = orderan.hitungBill();
        this.saldoKasir += bill;
        System.out.println("Order: " + orderan.JenisPecel + " | Total: Rp" + bill);
    }

    public double getSaldoKasir() {
        return saldoKasir;
    }
}