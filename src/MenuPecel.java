
abstract class MenuPecel {
    protected String JenisPecel;
    protected double hargaPecelOri;

    public MenuPecel(String JenisPecel, double hargaPecelOri) {
        this.JenisPecel = JenisPecel;
        this.hargaPecelOri = hargaPecelOri;
    }

    public abstract double hitungBill();
}