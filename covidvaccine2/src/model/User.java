package model;

//import java.util.UUID;

public class User {
    private String id;
    private String name;
    private int age;
    private String state;
    private String district;
    public User(String id,String name, int age,String state,String district )
    {
//        this.id = UUID.randomUUID().toString();
        this.id = id;
        this.name = name;
        this.state = state;
        this.district = district;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

}
