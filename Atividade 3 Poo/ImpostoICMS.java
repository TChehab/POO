class ImpostoICMS {
    private static final double ALIQUOTA_ICMS = 0.17;

    public static double calcularImposto(Item item) {
        return item.getValor() * ALIQUOTA_ICMS;
    }
}
