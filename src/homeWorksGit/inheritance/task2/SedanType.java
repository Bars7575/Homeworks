package homeWorksGit.inheritance.task2;

public class SedanType extends VehicleTypeByBodyTypes{
    public SedanType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
