
public class _3D extends FigurasGeometricas {
    private int ncaras;
    private double arista;

    public _3D(int nlados, String nombre, int ncaras, double arista) {
        super(nlados, nombre);
        this.ncaras = ncaras;
        this.arista = arista;
    }

    public int getNcaras() {
        return ncaras;
    }

    public void setNcaras(int ncaras) {
        this.ncaras = ncaras;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double calcular_volumen(double arista, int ncaras) {
        return (arista * arista) * ncaras;
    }
}