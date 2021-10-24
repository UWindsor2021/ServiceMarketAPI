package ca.uwindsor.ase.localservicemarket.repository;

import ca.uwindsor.ase.localservicemarket.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer>, CrudRepository<ServiceProvider, Integer> {
}
