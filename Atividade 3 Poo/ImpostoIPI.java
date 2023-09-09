class ImpostoIPI {
    private static final double ALIQUOTA_IPI = 0.25;

    public static double calcularImposto(Item item) {
        if (item.isProduto()) {
            return item.getValor() * ALIQUOTA_IPI;
        } else {
            return 0.0;
        }
    }
}
