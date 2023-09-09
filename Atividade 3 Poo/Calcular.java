import java.text.DecimalFormat;

public class CalculadoraImpostos {
    public static void main(String[] args) {
        // Criação dos itens de exemplo
        Item produto = new Item("Notebook", 1500.0, true);
        Item servico = new Item("Manutenção", 200.0, false);

        // Cálculo dos impostos
        double impostoISS = ImpostoISS.calcularImposto(servico);
        double impostoICMS = ImpostoICMS.calcularImposto(produto);
        double impostoIPI = ImpostoIPI.calcularImposto(produto);

        // Cálculo do valor total
        double valorTotalProduto = produto.getValor() + impostoICMS + impostoIPI;
        double valorTotalServico = servico.getValor() + impostoISS;

        // Exibição dos resultados
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Detalhes da Operação Comercial:");
        System.out.println("Item: " + produto.isProduto() + " - " + produto.getNome());
        System.out.println("Valor do Item: R$ " + df.format(produto.getValor()));
        System.out.println("Imposto ICMS: R$ " + df.format(impostoICMS));
        System.out.println("Imposto IPI: R$ " + df.format(impostoIPI));
        System.out.println("Valor Total do Produto: R$ " + df.format(valorTotalProduto));

        System.out.println();

        System.out.println("Item: " + servico.isProduto() + " - " + servico.getNome());
        System.out.println("Valor do Item: R$ " + df.format(servico.getValor()));
        System.out.println("Imposto ISS: R$ " + df.format(impostoISS));
        System.out.println("Valor Total do Serviço: R$ " + df.format(valorTotalServico));
    }
}
