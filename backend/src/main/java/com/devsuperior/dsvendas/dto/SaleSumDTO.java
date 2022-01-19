package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import java.io.Serializable;

/**
 *
 * @author EmersonPC
 */
public class SaleSumDTO implements Serializable{
    
    private String saleName;
    private double sum;
    
    public SaleSumDTO(){}
    
    public SaleSumDTO(Seller seller, double sum){
        this.saleName = seller.getName();
        this.sum = sum;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
    
    
}
