package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author EmersonPC
 */

@Entity
@Table( name = "tb_sales" )
public class Sale {
    
    // Os nomes devem estar idênticos ao da query .sql
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private int visited, deals;
    private double amount;
    private LocalDate date;
    
    @ManyToOne
    @JoinColumn( name = "seller_id" )
    private Seller seller;
    
    public Sale(){}
    
    public Sale(Long id, int visited, int deals, double amount, LocalDate date, Seller seller){
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.visited = visited;
        this.deals = deals;
        this.seller = seller;
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

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    
}
