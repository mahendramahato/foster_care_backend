package com.example.foster_backend.controller;

import com.example.foster_backend.exception.ResourceNotFoundException;
import com.example.foster_backend.model.Client;
import com.example.foster_backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clients")
public class FormController {

    @Autowired
    private ClientRepository clientRepository;

    // get all clients list REST API
    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // build get client form by ID REST API
    @GetMapping("{id}")
    public ResponseEntity<Client> getClientById(@PathVariable long id){
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student does not exist with this id:"+ id));
        return ResponseEntity.ok(client);
    }

    // build create a new client REST API
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    // implement delete client form REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteForm(@PathVariable long id){

        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client form does not exist with this id:"+ id));

        clientRepository.delete(client);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // implement update client form REST API
    @PutMapping("{id}")
    public ResponseEntity<Client> updateForm(@PathVariable long id, @RequestBody Client clientDetails){
        Client updateForm = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client doesn't exist with this id:"+ id));
        updateForm.setFirstName(clientDetails.getFirstName());
        updateForm.setLastName(clientDetails.getLastName());
        updateForm.setEmail(clientDetails.getEmail());
        updateForm.setCellPhone(clientDetails.getCellPhone());

        clientRepository.save(updateForm);
        return ResponseEntity.ok(updateForm);

    }
//
//
//    // get by low appointment scale
//    @GetMapping("medium/")
//    public List<Client> getAllClientByMedium(){
//        return clientRepository.getByAppointmentMedium();
//    }
//
//    // get by low appointment scale
//    @GetMapping("high/")
//    public List<Client> getAllClientByHigh(){
//        return clientRepository.getByAppointmentHigh();
//    }
//
//    @GetMapping("weekend")
//    public List<Client> getAllClientByWeekend(){
//        return clientRepository.getAllByWeekend();
//    }
//
//    @GetMapping("short")
//    public List<Client> getAllClientByShort(){
//        return clientRepository.getAllByShort();
//    }
//
//    @GetMapping("family")
//    public List<Client> getAllClientByFamily(){
//        return clientRepository.getAllByFamily();
//    }

//    @GetMapping("Program/{program}")
//    public ResponseEntity<List<Client>> getStudentByWeekend(@PathVariable String weekend){
//        List<Client> weekend_program = clientRepository.findByWeekend(weekend);
//        return ResponseEntity.ok(weekend_program);
//    }

}
