package br.com.alura.LuandaLl.TabelaFibeAplication.service;

public interface iConverteDados {
    <T> T obterDados(String json, Class<T>classe);
}
