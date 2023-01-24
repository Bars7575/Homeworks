package homeWorksGit.inheritance.task2;

public class ElectricType extends VehicleTypeByFuelTypes{
    public ElectricType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
