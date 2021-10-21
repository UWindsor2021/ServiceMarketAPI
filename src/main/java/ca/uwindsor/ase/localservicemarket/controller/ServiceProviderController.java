package ca.uwindsor.ase.localservicemarket.controller;

import ca.uwindsor.ase.localservicemarket.entity.ServiceProvider;
import ca.uwindsor.ase.localservicemarket.repository.ServiceProviderRepository;
import ca.uwindsor.ase.localservicemarket.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceProviderController {

    @Autowired
    public ProviderService providerService;

    @GetMapping("getProviderServices")
    public ResponseEntity<ServiceProvider> getAllServices(@RequestParam("name") String providerName){
        System.out.println(providerName);

        return new ResponseEntity<>(providerService.getProviderByName(providerName), HttpStatus.OK);


    }

}
