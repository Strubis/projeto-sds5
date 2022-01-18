package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author EmersonPC
 */
public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
