package ca.uwindsor.ase.localservicemarket.model;

import javax.persistence.*;

@Entity
@Table(name = "ServiceProvider")
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ServiceProviderID")
    private Integer id;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
