class Item {
    private String nome;
    private double valor;
    private boolean isProduto; // true se é um produto, false se é um serviço

    public Item(String nome, double valor, boolean isProduto) {
        this.nome = nome;
        this.valor = valor;
        this.isProduto = isProduto;
    }

    public double getValor() {
        return valor;
    }

    public boolean isProduto() {
        return isProduto;
    }
}
