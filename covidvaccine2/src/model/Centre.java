package model;

public class Centre {
        private String state;
        private String district;
        private String id;
        public Centre(String id,String state, String district)
        {
            this.setId(id);
            this.setState(state);
            this.setDistrict(district);
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getDistrict() {
            return district;
        }
        public void setDistrict(String district) {
            this.district = district;
        }

       
    }


