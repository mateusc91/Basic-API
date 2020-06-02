
package com.example.demo.api;

import com.example.demo.model.Consultor;
import com.example.demo.service.ConsultorService;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/consultor")
public class ConsultorController {
    
    private final ConsultorService consultorService;
    
    @Autowired
    public ConsultorController(ConsultorService consultorService) {
        this.consultorService = consultorService;
    }
    
    @PostMapping
    public void addConsultor(@RequestBody Consultor consultor){
        consultorService.addConsultor(consultor);
    }
    
    @GetMapping
    public List<Consultor> getAllConsultores(){
        return consultorService.getAllConsultores();
    }
   
    @GetMapping("{/id}")
    public Consultor getConsultorById (@PathVariable("id")UUID id){
        return consultorService.getConsultorById(id).orElse(null);
    }
   
    @DeleteMapping("/{id}")
    public void deleteConsultorById(@PathVariable("id") UUID id){
        consultorService.deleteConsultor(id);
    }

    @PutMapping("{/id}")
    public void updatePerson(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Consultor consultorToUpdate){
        consultorService.updateConsultor(id, consultorToUpdate);
    }
    
}
