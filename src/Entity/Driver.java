package Entity;

public class Driver extends Human {
    private String driverLicense;

    public Driver(){
        super();
        this.driverLicense = "111";
    }

    public Driver(String driverLicense){
        super();
        this.driverLicense = driverLicense;
    }

    public Driver(String name, String secondName, String driverLicense){
        super(name, secondName);
        this.driverLicense = driverLicense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return super.toString() + " Humans driverLicense:" + this.driverLicense ; //+ System.getProperty("line.separator")
    }
}
