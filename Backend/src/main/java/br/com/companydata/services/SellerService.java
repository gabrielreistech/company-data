package br.com.companydata.services;

import br.com.companydata.dtos.SellerDTO;
import br.com.companydata.interfaces.serviceinterface.SellerServiceInterface;
import br.com.companydata.models.SellerModel;
import br.com.companydata.repositories.SellerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService implements SellerServiceInterface {

    private final SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Transactional
    @Override
    public SellerDTO post(SellerDTO sellerDTO) {
        SellerModel sellerModel = this.sellerRepository.save(new SellerModel(sellerDTO));
        return new SellerDTO(sellerModel);
    }

    @Transactional(readOnly = true)
    @Override
    public SellerDTO findById(Long id) {
        SellerModel sellerModel = this.sellerRepository.findById(id).orElseThrow(RuntimeException::new);
        return new SellerDTO(sellerModel);
    }

    @Transactional(readOnly = true)
    @Override
    public List<SellerDTO> findAll() {
        List<SellerModel> listClient = this.sellerRepository.findAll();
        List<SellerDTO> sellerDTO = new ArrayList<>();
        for(SellerModel model : listClient){
            sellerDTO.add(new SellerDTO(model));
        }
        return sellerDTO;
    }

    @Transactional
    @Override
    public SellerDTO updateSeller(Long id, SellerDTO sellerDTO) {
        SellerModel sellerModel = this.sellerRepository.findById(id).orElseThrow(RuntimeException::new);
        SellerModel sellerModelUpdate = this.sellerRepository.save(sellerModel);
        return new SellerDTO(sellerModelUpdate);
    }
}
