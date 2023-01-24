package homeWorksGit.inheritance.task2;

public class VehicleAd {
    private String id;
    private String model; // возможно надо использовать Enum
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuelTypes vehicleTypeByFuelTypes;

    public VehicleAd(String id, String model, VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuelTypes vehicleTypeByFuelTypes) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
    }

    public VehicleAd(String id, String model, VehicleTypeByPurpose vehicleTypeByPurpose) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
    }

    public VehicleAd(String id, String model, VehicleTypeByBodyTypes vehicleTypeByBodyTypes) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
    }

    public VehicleAd(String id, String model, VehicleTypeByFuelTypes vehicleTypeByFuelTypes) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
    }


    //for creating new Car
    public VehicleAd(String model) {
        this.model = model;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public VehicleTypeByFuelTypes getVehicleTypeByFuelTypes() {
        return vehicleTypeByFuelTypes;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        return this.model;
    }
}
