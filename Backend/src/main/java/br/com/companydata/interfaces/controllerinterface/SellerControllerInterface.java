package br.com.companydata.interfaces.controllerinterface;

import br.com.companydata.dtos.SellerDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SellerControllerInterface {

    ResponseEntity<SellerDTO> post(@RequestBody @Valid SellerDTO sellerDTO);

    ResponseEntity<SellerDTO> findById(Long id);

    ResponseEntity<List<SellerDTO>> findAll();

    ResponseEntity<SellerDTO> updateClient(@RequestBody @Valid Long id, SellerDTO sellerDTO);
}
