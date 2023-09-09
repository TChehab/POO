class ImpostoISS {
    private static final double ALIQUOTA_ISS = 0.046;

    public static double calcularImposto(Item item) {
        if (!item.isProduto()) {
            return item.getValor() * ALIQUOTA_ISS;
        } else {
            return 0.0;
        }
    }
}
