
package br.edu.uricer.model;

import java.math.BigDecimal;

public class Produto {
   private String desc;
   private BigDecimal preco; 

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
