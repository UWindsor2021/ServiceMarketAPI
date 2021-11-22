package ca.uwindsor.ase.localservicemarket.controller;

import com.project.demoproject.dto.ServiceResponse;
import com.project.demoproject.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class fetchDataController {
    @Autowired
    ServiceRepository serviceRepository;

    @GetMapping(path = "getjoinservicedata")
    public List<ServiceResponse> getServiceJoinInfo(){
        return serviceRepository.getServiceJoinInfo();

    }
}
