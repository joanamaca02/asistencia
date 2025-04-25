package ar.edu.itec1misiones.controller;


import ar.edu.itec1misiones.dto.response.PearsonResponse;
import ar.edu.itec1misiones.service.PearsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pearsons")
public class PearsonController {
    private PearsonService pearsonService;

    public PearsonController(PearsonService pearsonService) {
        this.pearsonService = pearsonService;
    }

        @GetMapping
    public ResponseEntity<List<PearsonResponse>> findAll (){
            List<PearsonResponse> pearsonResponses = pearsonService.findAll();
        return new ResponseEntity<>(pearsonResponses, HttpStatus.OK);
    }

    @GetMapping(value = "/{dni}")
    public ResponseEntity<PearsonResponse> findByDni (@PathVariable("dni")String dni){
        PearsonResponse pearsonResponses = pearsonService.findByDni(dni);
        return new ResponseEntity<>(pearsonResponses, HttpStatus.OK);
    }

}
