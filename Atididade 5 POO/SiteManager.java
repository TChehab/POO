import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SiteManager {
    private List<Site> sites;

    public SiteManager() {
        this.sites = new ArrayList<>();
        carregarSites();
    }

    public void cadastrarSite(String descricao, String url, String dataCadastro) {
        Site site = new Site(descricao, url, dataCadastro);
        sites.add(site);
        salvarSites();
        System.out.println("Site cadastrado com sucesso. ID do site: " + site.getId());
    }

    public void listarSites() {
        for (Site site : sites) {
            System.out.println("ID: " + site.getId() + ", Descrição: " + site.getDescricao() +
                    ", URL: " + site.getUrl() + ", Data de Cadastro: " + site.getDataCadastro());
        }
    }

    private void salvarSites() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sites.data"))) {
            oos.writeObject(sites);
        } catch (IOException e) {
            System.err.println("Erro ao salvar sites: " + e.getMessage());
        }
    }

    private void carregarSites() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sites.data"))) {
            sites = (List<Site>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Ignora se o arquivo ainda não existe
            System.out.println("Arquivo de sites não encontrado. Iniciando um novo registro.");
        }
    }
}
