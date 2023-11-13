import java.util.Scanner;

public class CadastroSites {
    public static void main(String[] args) {
        SiteManager siteManager = new SiteManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            switch (escolha) {
                case 1:
                    cadastrarNovoSite(scanner, siteManager);
                    break;

                case 2:
                    listarSitesCadastrados(siteManager);
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Cadastrar novo site");
        System.out.println("2 - Listar sites cadastrados");
        System.out.println("3 - Sair");
    }

    private static void cadastrarNovoSite(Scanner scanner, SiteManager siteManager) {
        System.out.println("Informe a descrição do site:");
        String descricao = scanner.nextLine();

        System.out.println("Informe a URL do site:");
        String url = scanner.nextLine();

        System.out.println("Informe a data de cadastro (dd/mm/aaaa):");
        String dataCadastro = scanner.nextLine();

        siteManager.cadastrarSite(descricao, url, dataCadastro);
    }

    private static void listarSitesCadastrados(SiteManager siteManager) {
        System.out.println("\nListagem de sites cadastrados:");
        siteManager.listarSites();
    }
}
