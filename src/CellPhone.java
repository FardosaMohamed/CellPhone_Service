
public class CellPhone{
    // These are fields (a.k.a instance variables)
    long serialNumber ;
    String model;
    String carrier;
    String phoneNumber ;
    String owner;

// A constructor
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

 //Getter/Setter Methods
    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

