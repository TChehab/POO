import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {

    @Test
    public void testCalcularValorTotalSemDesconto() {
        Venda venda = new Venda("Cliente Teste");
        ItemVenda item1 = new ItemVenda("Produto 1", 10.0, 2.0);
        ItemVenda item2 = new ItemVenda("Produto 2", 20.0, 1.0);

        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        double valorTotal = venda.calcularValorTotal();

        assertEquals(40.0, valorTotal, 0.001);
    }

    @Test
    public void testCalcularValorTotalComDesconto() {
        Venda venda = new Venda("Cliente Teste");
        ItemVenda item1 = new ItemVenda("Produto 1", 10.0, 2.0);
        ItemVenda item2 = new ItemVenda("Produto 2", 20.0, 1.0);
        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        venda.setValorDesconto(5.0);
        double valorTotalComDesconto = venda.calcularValorTotalComDesconto();

        assertEquals(35.0, valorTotalComDesconto, 0.001);
    }

    @Test
    public void testAdicionarItem() {
        Venda venda = new Venda("Cliente Teste");
        ItemVenda item = new ItemVenda("Produto 1", 10.0, 2.0);

        venda.adicionarItem(item);

        assertEquals(1, venda.getItens().size());
        assertEquals(item, venda.getItens().get(0));
    }
}
