package ca.uwindsor.ase.localservicemarket.controller;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;


@Configuration
@RestController
@RequestMapping(path = "/demo")
public class ServiceController {
    @Autowired
    private ServiceRepository serviceRepository;




    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewService(@RequestParam String service_title, @RequestParam String description) {

        service s = new service();

        s.setService_title(service_title);
        s.setdescription(description);
        serviceRepository.save(s);
        return "saved";
    }


    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<service> getAllservices() {
        return serviceRepository.findAll();
    }



}
