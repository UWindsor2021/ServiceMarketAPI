package ca.uwindsor.ase.localservicemarket.service;

import ca.uwindsor.ase.localservicemarket.repository.JoinTest;

import ca.uwindsor.ase.localservicemarket.entity.ResponceServices;
import ca.uwindsor.ase.localservicemarket.repository.JoinTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    public JoinTest2 joinTest2;

    @Autowired
    public JoinTest joinTest;

    public List<ResponceServices> getallServices(){
        return joinTest.getAllServicesOfUserCondition(1L);
    }
}
