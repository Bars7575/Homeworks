package homeWorksGit.inheritance.task2;

public class TruckType extends VehicleTypeByPurpose{
    public TruckType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
