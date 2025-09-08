package br.com.companydata.controllers;

import br.com.companydata.interfaces.controllerinterface.SellerControllerInterface;
import br.com.companydata.dtos.SellerDTO;
import br.com.companydata.services.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
@CrossOrigin(origins = "http://localhost:4200")
public class SellerController implements SellerControllerInterface {

    SellerService clientService;

    private SellerController(SellerService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    @Override
    public ResponseEntity<SellerDTO> post(SellerDTO sellerDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.post(sellerDTO));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<SellerDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.findById(id));
    }

    @GetMapping
    @Override
    public ResponseEntity<List<SellerDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.findAll());
    }

    @PutMapping
    @Override
    public ResponseEntity<SellerDTO> updateClient(Long id, SellerDTO sellerDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.updateSeller(id, sellerDTO));
    }
}
