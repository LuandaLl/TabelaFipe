package br.com.alura.LuandaLl.TabelaFibeAplication.principal;

import br.com.alura.LuandaLl.TabelaFibeAplication.model.Dados;
import br.com.alura.LuandaLl.TabelaFibeAplication.model.Modelos;
import br.com.alura.LuandaLl.TabelaFibeAplication.service.ConsultaApi;
import br.com.alura.LuandaLl.TabelaFibeAplication.service.ConverteDados;

import java.util.*;


public class Principal {
    private ConsultaApi consultaApi = new ConsultaApi();
    private Scanner leitura = new Scanner(System.in);
    private  ConverteDados conversor = new ConverteDados();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu(){
        String mensagemInicial = """
                **************************************************
                OPÇÕES
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar valores:
                """;

        System.out.println(mensagemInicial);
        var escolha = leitura.nextLine().trim();
        String endereco;
        if(escolha.toLowerCase().contains("carr")){
            endereco = URL_BASE + "carros/marcas";
        } else if(escolha.toLowerCase().contains("mot")){
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";

        }

        var json = consultaApi.obterDados(endereco);


        var marcas= conversor.obterLista(json, Dados.class);

        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("Digite o codigo desejado: ");
        var escolhaModelo= leitura.nextLine();

        endereco = endereco + "/" + escolhaModelo + "/modelos";
        json = consultaApi.obterDados(endereco);

        var modelos = conversor.obterDados(json, Modelos.class); //Usa obter dados poque a classe modelos ja esta com LIsta

        System.out.println("\nModelos da marca: ");
        modelos.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);




    }
}
