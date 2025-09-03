package br.com.clientinsight.interfaces.controllerinterface;

import br.com.clientinsight.dtos.ClientDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClientControllerInterface {

    ResponseEntity<ClientDTO> post(@RequestBody @Valid ClientDTO clientDTO);

    ResponseEntity<ClientDTO> findById(Long id);

    ResponseEntity<List<ClientDTO>> findAll();

    ResponseEntity<ClientDTO> updateClient(@RequestBody @Valid Long id, ClientDTO clientDTO);
}
