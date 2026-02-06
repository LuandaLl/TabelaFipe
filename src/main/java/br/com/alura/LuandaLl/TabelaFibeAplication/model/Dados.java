package br.com.alura.LuandaLl.TabelaFibeAplication.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(String codigo, String nome) {
    @Override
    public String toString() {
        return "Código: '" + codigo + '\'' +
                "Nome: '" + nome + '\'';
    }
}
