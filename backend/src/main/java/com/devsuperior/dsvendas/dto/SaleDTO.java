package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import java.io.Serializable;

/**
 *
 * @author EmersonPC
 */
public class SaleDTO implements Serializable{
 
    private Long id;
    private int visited, deals;
    private double amount;
    
    public SaleDTO(){}

    public SaleDTO(Long id, int visited, int deals, double amount) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
    }
    
    public SaleDTO(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getDeals() {
        return deals;
    }

    public void setDeals(int deals) {
        this.deals = deals;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
