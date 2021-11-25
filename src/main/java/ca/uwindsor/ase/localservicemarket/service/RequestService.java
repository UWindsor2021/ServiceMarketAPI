package ca.uwindsor.ase.localservicemarket.service;

import ca.uwindsor.ase.localservicemarket.entity.Request;
import ca.uwindsor.ase.localservicemarket.entity.ServiceProvider;
import ca.uwindsor.ase.localservicemarket.repository.RequestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RequestService {
    @Autowired
    RequestsRepository RequestsRepository;
    public void getRequestByService(String service){
//        Request request= RequestsRepository.findByServiceContaining(
//                service);
//        if(!Objects.isNull(request)) {
//            return request;
//        }
//        else{
//            return new Request();
//        }

        System.out.println("Hello");

    }
}
