package ca.uwindsor.ase.localservicemarket.controller;

import ca.uwindsor.ase.localservicemarket.entity.Request;
import ca.uwindsor.ase.localservicemarket.repository.RequestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/")
public class RequestController {

    @Autowired
    public RequestsRepository requestsRepository;;

    @GetMapping("getRequestByService")
    public ResponseEntity<List<Request>> getRequestbyService(@RequestParam("service") String serviceName, @RequestParam("state") String stateName, @RequestParam("service_provider") String serviceProvider){
        System.out.println(serviceProvider);

        return new ResponseEntity<List<Request>>(requestsRepository.findByServiceContainingAndStateContainingAndServiceProviderContaining(serviceName, stateName, serviceProvider), HttpStatus.OK);
    }
}
