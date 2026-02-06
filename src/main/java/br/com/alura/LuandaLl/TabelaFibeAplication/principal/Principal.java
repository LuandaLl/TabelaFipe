package br.com.alura.LuandaLl.TabelaFibeAplication.principal;

import br.com.alura.LuandaLl.TabelaFibeAplication.model.Dados;
import br.com.alura.LuandaLl.TabelaFibeAplication.model.Modelos;
import br.com.alura.LuandaLl.TabelaFibeAplication.service.ConsultaApi;
import br.com.alura.LuandaLl.TabelaFibeAplication.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;


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

        System.out.println("\nDigite um trecho do nome do modelo escolhido");
        var trecho = leitura.nextLine();

        List<Dados> modelosFiltrados = modelos.
                modelos().stream()
                .filter(m-> m.nome().toLowerCase().contains(trecho.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("\nModelos filtrados");
        modelosFiltrados.forEach(System.out::println);

        System.out.println("\nDigite por favor o código do modelo desejado para buscar os valores de avaliação ");
        var modeloDesejado = leitura.nextLine();

        endereco = endereco + "/" + modeloDesejado + "/anos";

        json = consultaApi.obterDados(endereco);

        List<Dados> listaAnos = conversor.obterLista(json, Dados.class);

        listaAnos.forEach(System.out::println);






    }
}
