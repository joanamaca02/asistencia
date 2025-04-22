package ar.edu.itec1misiones.controller;

import ar.edu.itec1misiones.dto.request.SaludoRequest;
import ar.edu.itec1misiones.dto.response.SaludoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping(path ="/{name}")
    public String sayHello(@PathVariable String name){
        return "hello "+name;

    }
    @GetMapping(path ="/{name}")
    public ResponseEntity<SaludoResponse> sayHello2(SaludoRequest request){
        SaludoResponse response = new SaludoResponse();
        return new ResponseEntity<SaludoResponse>(response, HttpStatus.OK);

    }
}





