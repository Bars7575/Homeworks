package homeWorksGit.inheritance.task2;

public class PickupType extends VehicleTypeByBodyTypes{
    public PickupType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
