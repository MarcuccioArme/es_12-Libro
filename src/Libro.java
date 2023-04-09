public class Libro {

    final float COSTO = 5.5f;

    private String Titolo;
    private String Autore;
    private int Pagine;

    private float CostoPagine = 0.05f;
    private float CostoLibro;

    public Libro(String Titolo, String Autore, int Pagine) {
        this.Titolo = Titolo;
        this.Autore = Autore;
        this.Pagine = Pagine;

        this.CostoLibro = (Pagine*CostoPagine)+COSTO;
    }

    public String getTitolo() {
        return this.Titolo;
    }

    public String getAutore() {
        return this.Autore;
    }

    public int getPagine() {
        return this.Pagine;
    }

    public float getCostoLibro() {
        return this.CostoLibro;
    }

    public void Visualizza() {
        System.out.println("Il libro: '"+Titolo+"' di: '"+Autore+"' costa "+CostoLibro+" €");
    }

}