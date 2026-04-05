
class PecelKediri extends MenuPecel {
    private boolean pakaiRempeyek;

    public PecelKediri(boolean pakaiRempeyek) {
        super("PecelKediri", 10000);
        this.pakaiRempeyek = pakaiRempeyek;
    }

    @Override
    public double hitungBill() {
        return pakaiRempeyek ? hargaPecelOri + 1000 : hargaPecelOri;
    }
}