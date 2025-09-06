package br.com.clientinsight.controllers;

import br.com.clientinsight.interfaces.controllerinterface.ClientControllerInterface;
import br.com.clientinsight.dtos.ClientDTO;
import br.com.clientinsight.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController implements ClientControllerInterface {

    ClientService clientService;

    private ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    @Override
    public ResponseEntity<ClientDTO> post(ClientDTO clientDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.post(clientDTO));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.findById(id));
    }

    @GetMapping
    @Override
    public ResponseEntity<List<ClientDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.findAll());
    }

    @PutMapping
    @Override
    public ResponseEntity<ClientDTO> updateClient(Long id, ClientDTO clientDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(this.clientService.updateClient(id, clientDTO));
    }
}
