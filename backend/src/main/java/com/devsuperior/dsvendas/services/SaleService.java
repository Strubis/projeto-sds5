package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EmersonPC
 */

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;
    
    public List<SaleDTO> findAll(){
        List<Sale> result = saleRepository.findAll();
        
        return result.stream().map( 
                sale -> new SaleDTO( sale ) )
                .collect( Collectors.toList() );
    }
    
}
