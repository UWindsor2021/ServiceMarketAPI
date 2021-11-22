package ca.uwindsor.ase.localservicemarket.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.*;

@Configuration
@RestController
@RequestMapping(path = "/demo2")
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;


    @PostMapping(path = "/add")
    public @ResponseBody
    String addnewReview(@RequestParam String Name, @RequestParam int Ranking, @RequestParam int ServiceProviderID,@RequestParam String ReviewContent ){

        review r=new review();


        r.setName(Name);
        r.setRanking(Ranking);
        r.setServiceProviderID(ServiceProviderID);
        r.setReviewContent(ReviewContent);
        reviewRepository.save(r);

        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<review> getAllreview(){
        return reviewRepository.findAll();
    }


}
