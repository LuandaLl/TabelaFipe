package br.com.alura.LuandaLl.TabelaFibeAplication.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(@JsonAlias("código") String codigo, @JsonAlias ("nome:") String nome) {
}
