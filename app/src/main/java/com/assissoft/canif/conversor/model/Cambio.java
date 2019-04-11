package com.assissoft.canif.conversor.model;

import java.io.Serializable;

/**
 * Created by Marcos on 18/05/2016.
 * <p>
 * pacote -> model
 * com todos os modelos, interfaces de metadata, providers, metadatas
 * <p>
 * pacote -> utils
 * com todos os helpers, classes auxiliares ou de apoio
 * <p>
 * pacote -> ui
 * com todos os fragments, activities e interfaces de ui
 */
public class Cambio implements Serializable {
    private String sigla;
    private double txCompra;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double getTaxaCompra() {
        return txCompra;
    }

    public void setTaxaCompra(double txCompra) {
        this.txCompra = txCompra;
    }


}
