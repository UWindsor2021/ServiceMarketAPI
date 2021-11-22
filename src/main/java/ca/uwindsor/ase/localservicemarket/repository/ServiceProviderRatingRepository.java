package ca.uwindsor.ase.localservicemarket.repository;

import com.project.demoproject.dto.ServiceResponse;
import com.project.demoproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceRepository extends JpaRepository<User,Integer> {
    @Query("SELECT new com.project.demoproject.dto.ServiceResponse (u.userName,u.firstName,u.lastName,s.serviceName,s.rating,s.skill,s.imageUrl) FROM User u JOIN u.service s")
    public List<ServiceResponse> getServiceJoinInfo();
}
