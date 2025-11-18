class calculator {
    long faktoriala(int n) {
        if (n < 0) throw new IllegalArgumentException("Zenbaki negatiboak ez dira onartzen");
        long emaitza = 1; 
        for (int i = 1; i <= n; i++) {
            emaitza *= i;
        }
        return emaitza;
    }
    }


