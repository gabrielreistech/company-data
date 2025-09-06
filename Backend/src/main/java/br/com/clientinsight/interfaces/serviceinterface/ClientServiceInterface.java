package br.com.clientinsight.interfaces.serviceinterface;

import br.com.clientinsight.dtos.ClientDTO;

import java.util.List;

public interface ClientServiceInterface {

   ClientDTO post(ClientDTO clientDTO);

   ClientDTO findById(Long id);

   List<ClientDTO> findAll();

   ClientDTO updateClient(Long id, ClientDTO clientDTO);
}
