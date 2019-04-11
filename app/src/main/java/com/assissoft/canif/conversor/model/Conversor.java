package com.assissoft.canif.conversor.model;

import java.io.Serializable;

/**
 * Created by Marcos on 01/12/2016.
 */
public class Conversor implements Serializable {

    private String titulo;
    private String descricao;
    private int imagem;
    private String nomeApp;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return this.imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNomeApp() {
        return this.nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

}
