import java.util.Random;

public class NbPremier {
    private int[] tabEntiers;
    private final int max;
    private int size;

    public NbPremier(int max) {
        this.max = max;
        this.size = 0;
        this.tabEntiers = new int[max];
    }

    public void add(int entier) {
        if (size < max) {
            tabEntiers[size] = entier;
            size++;
        } else
            throw new IllegalStateException("La collection est pleine, impossible d'ajouter plus d'entiers.");
    }

    public void initRandom(int n, int m) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomEntier = random.nextInt(m) + 1;
            add(randomEntier);
        }
    }

    private boolean isPrime(int p) {
        if (p <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0)
                return false;
        }
        return true;
    }

    public void printPrimes() {
        for (int i = 0; i < size; i++) {
            if (isPrime(tabEntiers[i]))
                System.out.println(tabEntiers[i]);
        }
    }

    public static void main(String[] args) {
        NbPremier collection = new NbPremier(100);
        collection.initRandom(100, 100);
        collection.printPrimes();
    }
}
