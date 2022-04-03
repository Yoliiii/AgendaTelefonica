public class Contact {

    //Attributes
    private String name;
    private int phone;
    private String direction;
    private String email;

    //Constructor
    public Contact(){

    }
    public Contact(String name, int phone, String direction, String email){
        this.name = name;
        this.phone = phone;
        this.direction = direction;
        this.email = email;
    }

    //Methods get
    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getDirection() {
        return direction;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Contact " + '\n' + "name: " + name +  ", phone: " + phone + ", direction: " + direction + ", email: " + email;
    }
}
