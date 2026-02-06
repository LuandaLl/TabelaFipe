package br.com.alura.LuandaLl.TabelaFibeAplication.principal;

import br.com.alura.LuandaLl.TabelaFibeAplication.model.Dados;
import br.com.alura.LuandaLl.TabelaFibeAplication.service.ConsultaApi;
import br.com.alura.LuandaLl.TabelaFibeAplication.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    
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
        var escolha = leitura.nextLine();

        if(!escolha.endsWith("s")){
            var addS = "s";
            escolha = escolha + addS;
        }
        ConsultaApi consultarApi = new ConsultaApi();
        var json = consultarApi.obterDados(ENDERECO + escolha.toLowerCase() + "/marcas");
        ConverteDados conversor = new ConverteDados();

        Dados dadosCarro = conversor.obterDados(json, Dados.class);

        System.out.println(dadosCarro);

    }
}
