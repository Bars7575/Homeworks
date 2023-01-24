package homeWorksGit.inheritance.task2;

public class DieselType extends VehicleTypeByFuelTypes{
    public DieselType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
