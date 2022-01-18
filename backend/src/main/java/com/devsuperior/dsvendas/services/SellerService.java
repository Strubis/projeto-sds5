package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author EmersonPC
 */

@Service
public class SellerService {
    
    // Injeção de dependências, ao invés de fazer um new...
    @Autowired
    private SellerRepository sellerRepository;
    
    public List<SellerDTO> findAll(){
        List<Seller> result = sellerRepository.findAll();
        
        return result.stream().map( 
                seller -> new SellerDTO( seller ) )
                .collect( Collectors.toList() );
    }
    
}
