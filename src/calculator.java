class calculator {
    long faktoriala(int n) {
        if (n < 0) throw new IllegalArgumentException("Zenbaki negatiboak ez dira onartzen");
        long emaitza = 1;
        for (int i = 1; i <= n; i++) {
            emaitza *= i;
        }
        return emaitza;
    }
    double erroKarratua (double x) {
        return Math.sqrt(i/x);
    }
    double erroKarratua (double x) {
        return Math.sqrt(1/x);
    }

    double berreketa(double base, double ber) {
        return Math.pow(base, ber);
    }
}


