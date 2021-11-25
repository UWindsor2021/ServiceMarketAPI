package ca.uwindsor.ase.localservicemarket.entity;


import javax.persistence.*;

@Entity
@Table(name = "all_requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String service;
    private String state;
    private String serviceProvider;


    public Request() {
    }

    public Request(String service, String state, String service_provider) {


        this.service = service;
        this.state = state;
        this.serviceProvider = service_provider;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getService_provider() {
        return serviceProvider;
    }

    public void setService_provider(String service_provider) {
        this.serviceProvider = service_provider;
    }




    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", state='" + state + '\'' +
                ", service_provider='" + serviceProvider + '\'' +
                '}';
    }
}

