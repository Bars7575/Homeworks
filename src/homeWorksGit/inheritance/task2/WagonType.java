package homeWorksGit.inheritance.task2;

public class WagonType extends VehicleTypeByBodyTypes{
    public WagonType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
