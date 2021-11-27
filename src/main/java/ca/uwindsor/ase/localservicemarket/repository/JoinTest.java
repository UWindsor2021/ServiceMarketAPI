package ca.uwindsor.ase.localservicemarket.repository;


import ca.uwindsor.ase.localservicemarket.entity.ResponceServices;
import ca.uwindsor.ase.localservicemarket.entity.Userw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JoinTest extends JpaRepository<Userw, Long> {

    @Query(" select new ca.uwindsor.ase.localservicemarket.entity.ResponceServices(u.userid,u.username,u.firstname,u.lastname,s.rating,s.imageurl,s.skill) from Userw u join u.services s ")
    public List<ResponceServices> getAllServicesOfUser();

    @Query(" select new ca.uwindsor.ase.localservicemarket.entity.ResponceServices(u.userid,u.username,u.firstname,u.lastname,s.rating,s.imageurl,s.skill) from Userw u join u.services s where u.userid = ?1")
    public List<ResponceServices> getAllServicesOfUserCondition(Long userid);
}
