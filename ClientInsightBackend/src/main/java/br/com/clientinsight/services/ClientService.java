package br.com.clientinsight.services;

import br.com.clientinsight.dtos.ClientDTO;
import br.com.clientinsight.interfaces.serviceinterface.ClientServiceInterface;
import br.com.clientinsight.models.ClientModel;
import br.com.clientinsight.repositories.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService implements ClientServiceInterface {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    @Override
    public ClientDTO post(ClientDTO clientDTO) {
        ClientModel clientModel = this.clientRepository.save(new ClientModel(clientDTO));
        return new ClientDTO(clientModel);
    }

    @Transactional(readOnly = true)
    @Override
    public ClientDTO findById(Long id) {
        ClientModel clientModel = this.clientRepository.findById(id).orElseThrow(RuntimeException::new);
        return new ClientDTO(clientModel);
    }

    @Transactional(readOnly = true)
    @Override
    public List<ClientDTO> findAll() {
        List<ClientModel> listClient = this.clientRepository.findAll();
        List<ClientDTO> clientDTO = new ArrayList<>();
        for(ClientModel model : listClient){
            clientDTO.add(new ClientDTO(model));
        }
        return clientDTO;
    }

    @Transactional
    @Override
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        ClientModel clientModel = this.clientRepository.findById(id).orElseThrow(RuntimeException::new);
        ClientModel clientModelUpdate = this.clientRepository.save(clientModel);
        return new ClientDTO(clientModelUpdate);
    }
}
