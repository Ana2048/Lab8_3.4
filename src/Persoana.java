public class Persoana implements Comparable<Persoana> {
    private String nume;
    private int varsta;
    private String prenume;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", prenume='" + prenume + '\'' +
                '}';
    }

   // @Override
   /* public int compareTo(Persoana o) {
        return this.nume.compareTo(o.nume);
    }
    */

    @Override
    public int compareTo(Persoana other){
        return Integer.compare(this.varsta, other.varsta);
    }
}
