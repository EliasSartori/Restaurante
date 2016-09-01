
package br.edu.uricer.model;

import java.math.BigDecimal;
import java.util.List;


public class Mesa {
    private boolean ocupada; 
    private List<Item> itens;
    private BigDecimal valorTotal;

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupar(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    public void ocupar(){ 
        ocupada = true;
    }
           
    public void desocupar(){ 
        ocupada = false;
    }
    
    public void totalizar(){ 
        valorTotal = new BigDecimal("0.0");
        
    }
    
}
