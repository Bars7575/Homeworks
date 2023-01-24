package homeWorksGit.inheritance.task2;

public class BusType extends VehicleTypeByBodyTypes{
    public BusType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
