package ca.uwindsor.ase.localservicemarket.review;

import javax.persistence.*;


@Entity
@Table(name = "review")
public class review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_seekerid")
    private int ServiceSeekerID;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Ranking")
    private int Ranking;
    @Column(name = "service_providerid")
    private int ServiceProviderID;
    @Column(name = "review_content")
    private String ReviewContent;

    public int ServiceSeekerID() {
        return ServiceSeekerID;
    }

    public void ServiceSeekerID(int ServiceSeekerID) {
        this.ServiceSeekerID = ServiceSeekerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int ranking) {
        Ranking = ranking;
    }

    public int getServiceProviderID() {
        return ServiceProviderID;
    }

    public void setServiceProviderID(int ServiceProviderID) {
        this.ServiceProviderID = ServiceProviderID;
    }

    public String getReviewContent() {
        return ReviewContent;
    }

    public void setReviewContent(String ReviewContent) {
        this.ReviewContent = ReviewContent;
    }

    @Override
    public String toString() {
        return "review{" +
                "ServiceSeekerID=" + ServiceSeekerID +
                ", Name='" + Name + '\'' +
                ", Ranking=" + Ranking +
                ", ServiceProviderID=" + ServiceProviderID +
                ", ReviewContent='" + ReviewContent + '\'' +
                '}';
    }
}
