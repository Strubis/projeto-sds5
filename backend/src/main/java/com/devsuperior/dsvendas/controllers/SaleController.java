package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.services.SaleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author EmersonPC
 */

@RestController
@RequestMapping( value = "v1/sale" )
public class SaleController {
    
    @Autowired
    private SaleService service;
    
    @GetMapping
    public ResponseEntity<List<SaleDTO>> findAll(){
        List<SaleDTO> list = service.findAll();
        
        return ResponseEntity.ok( list );
    }
    
}
