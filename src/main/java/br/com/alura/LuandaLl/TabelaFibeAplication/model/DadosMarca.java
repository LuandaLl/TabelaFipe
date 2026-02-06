package br.com.alura.LuandaLl.TabelaFibeAplication.model;

import javax.swing.plaf.synth.SynthToolTipUI;

public class DadosMarca {
    private int codigo;
    private String marca;
    public DadosMarca(Dados dadosCarro) {
        this.codigo = Integer.valueOf(dadosCarro.codigo());
        this.marca = dadosCarro.nome();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return
                "Código = " + codigo +
                "\nMarca = '" + marca
                ;
    }
}
