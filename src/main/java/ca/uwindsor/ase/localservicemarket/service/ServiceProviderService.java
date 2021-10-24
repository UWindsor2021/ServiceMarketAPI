package ca.uwindsor.ase.localservicemarket.service;

import ca.uwindsor.ase.localservicemarket.dto.ServiceProviderDto;
import ca.uwindsor.ase.localservicemarket.model.ServiceProvider;
import ca.uwindsor.ase.localservicemarket.repository.ServiceProviderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ServiceProviderService {
    private final ServiceProviderRepository serviceProviderRepository;
    public ServiceProviderService(ServiceProviderRepository serviceProviderRepository){
        this.serviceProviderRepository = serviceProviderRepository;
    }

    @Transactional
    public ServiceProvider createServiceProvider(ServiceProviderDto serviceProvider) throws Exception {
        if (serviceProvider.getId() != null) {
            throw new Exception("Invalid argument");
        }
        return serviceProviderRepository.save(builder(serviceProvider));
    }

    private ServiceProvider builder(ServiceProviderDto personDTO) {
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setDescription(personDTO.getDescription());
        return serviceProvider;
    }
}
