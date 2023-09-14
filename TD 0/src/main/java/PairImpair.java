public class PairImpair {
    private final int nombre;

    public PairImpair(int nombre) {
        this.nombre = nombre;
    }

    public void determine() {
        String result = "Le nombre " + nombre + " est ";

        if (determinePosNeg() == 1)
            result += "positif ";
        else if (determinePosNeg() == 0)
            result += "nul ";
        else
            result += "négatif ";

        if (determineIfPair())
            result += "et pair.";
        else
            result += "et impair.";

        System.out.println(result);
    }

    public int determinePosNeg() {
        return Integer.compare(nombre, 0);
    }

    public boolean determineIfPair() {
        return nombre % 2 == 0;
    }

    public static void main(String[] args) {
        PairImpair pairImpair = new PairImpair(-24352);
        pairImpair.determine();
    }
}
