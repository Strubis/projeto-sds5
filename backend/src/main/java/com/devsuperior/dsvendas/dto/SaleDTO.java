package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author EmersonPC
 */
public class SaleDTO implements Serializable{
 
    private Long id;
    private int visited, deals;
    private double amount;
    private LocalDate date;
    
    private SellerDTO seller;
    
    public SaleDTO(){}

    public SaleDTO(Long id, int visited, int deals, double amount, LocalDate date, SellerDTO seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }
    
    public SaleDTO(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO( entity.getSeller() );
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }
    
    
}
