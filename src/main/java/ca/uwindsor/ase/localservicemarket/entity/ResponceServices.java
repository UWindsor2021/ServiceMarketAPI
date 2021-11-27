package ca.uwindsor.ase.localservicemarket.entity;

    public class ResponceServices {

        private Long userID;
        private String userName;
        private String firstName;
        private String lastname;
        private int rating;
        private String imageURL;
        private String skill;

        public ResponceServices(Long userID, String userName, String firstName, String lastname, int rating, String imageURL, String skill) {
            this.userID = userID;
            this.userName = userName;
            this.firstName = firstName;
            this.lastname = lastname;
            this.rating = rating;
            this.imageURL = imageURL;
            this.skill = skill;
        }

        public ResponceServices() {
        }

        public Long getUserID() {
            return userID;
        }

        public void setUserID(Long userID) {
            this.userID = userID;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getImageURL() {
            return imageURL;
        }

        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        @Override
        public String toString() {
            return "ResponceServices{" +
                    "userID=" + userID +
                    ", userName='" + userName + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", rating=" + rating +
                    ", imageURL='" + imageURL + '\'' +
                    ", skill='" + skill + '\'' +
                    '}';
        }
    }


