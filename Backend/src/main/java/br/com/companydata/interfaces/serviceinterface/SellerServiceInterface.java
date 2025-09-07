package br.com.companydata.interfaces.serviceinterface;

import br.com.companydata.dtos.SellerDTO;

import java.util.List;

public interface SellerServiceInterface {

   SellerDTO post(SellerDTO sellerDTO);

   SellerDTO findById(Long id);

   List<SellerDTO> findAll();

   SellerDTO updateSeller(Long id, SellerDTO sellerDTO);
}
