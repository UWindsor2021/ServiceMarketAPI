package ca.uwindsor.ase.localservicemarket.service;

import javax.persistence.*;

@Entity
@Table(name = "service_list")
public class service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int service_id;
    @Column(name = "service_title")
    private String service_title;
    @Column(name = "service_description")
    private String description;

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_title() {
        return service_title;
    }

    public void setService_title(String service_title) {
        this.service_title = service_title;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "service{" +
                "service_id=" + service_id +
                ", service_title='" + service_title + '\'' +
                ", service_description='" + description + '\'' +
                '}';
    }
}
