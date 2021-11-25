package ca.uwindsor.ase.localservicemarket.repository;

import ca.uwindsor.ase.localservicemarket.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface RequestsRepository extends JpaRepository<Request, Integer> {
    //public Request findByServiceContaining (String service);

    //@Query (" { 'service' : ?0 } ")
    public List<Request> findByServiceContainingAndStateContainingAndServiceProviderContaining (String service, String state, String service_provider);
}
