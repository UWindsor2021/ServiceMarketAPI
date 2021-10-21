package ca.uwindsor.ase.localservicemarket.controller;


import ca.uwindsor.ase.localservicemarket.dto.ServiceSeeker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping
    public String index() {
        return "<h1>Welcome!</h1>";
    }

/*    @GetMapping("/getDetails")
    public ServiceSeeker getServiceSeekerDetails(@RequestParam Long id){
        ServiceSeeker s = new ServiceSeeker();
        ServiceSeeker seeker = s;
        seeker.setId(id);
        seeker.setTitle("Hello Kalyan");
        return seeker;

    }*/
    //Checking Connection
}
