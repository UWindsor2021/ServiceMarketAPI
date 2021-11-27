package ca.uwindsor.ase.localservicemarket.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "serviceprovider1")
    public class Serviceprovider1 {

        @Id
        private Long serviceid;
        private int rating;
        private String imageurl;
        private String skill;
        private Long userid;

        public Serviceprovider1() {
        }

        public Long getServiceid() {
            return serviceid;
        }

        public void setServiceid(Long serviceid) {
            this.serviceid = serviceid;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        public Long getUserid() {
            return userid;
        }

        public void setUserid(Long userid) {
            this.userid = userid;
        }

        @Override
        public String toString() {
            return "Serviceprovider{" +
                    "serviceid=" + serviceid +
                    ", rating=" + rating +
                    ", imageurl='" + imageurl + '\'' +
                    ", skill='" + skill + '\'' +
                    ", userid=" + userid +
                    '}';
        }
    }

