package br.com.alura.LuandaLl.TabelaFibeAplication.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Veiculos(@JsonAlias("Valor") String valor,
                       @JsonAlias("Marca") String marca,
                       @JsonAlias("Modelo") String modelo,
                       @JsonAlias("AnoModelo") int ano,
                        @JsonAlias("Combustivel") String tipoCombustivel) {

    @Override
    public String toString() {
        return  "**********************"+
                "\nAno: " + ano +
                "\nValor: '" + valor + '\'' +
                "\nMarca: '" + marca + '\'' +
                "\nModelo: '" + modelo + '\'' +
                "\nTipo de combustível " + tipoCombustivel
                ;
    }
}
