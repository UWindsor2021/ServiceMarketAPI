package ca.uwindsor.ase.localservicemarket.entity;


import javax.persistence.*;
import java.util.List;

    @Entity
    @Table(name = "userw")
    public class Userw {

        @Id
        private Long userid;
        private String username;
        private String firstname;
        private String lastname;

        @OneToMany(targetEntity = Serviceprovider1.class, cascade = CascadeType.ALL)
        @JoinColumn(name = "userid" , referencedColumnName = "userid")
        private List<Serviceprovider1> services;


        public Userw() {
        }

        public Long getUserid() {
            return userid;
        }

        public void setUserid(Long userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public List<Serviceprovider1> getServices() {
            return services;
        }

        public void setServices(List<Serviceprovider1> services) {
            this.services = services;
        }

        @Override
        public String toString() {
            return "Userw{" +
                    "userid=" + userid +
                    ", username='" + username + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", services=" + services +
                    '}';
        }
    }


