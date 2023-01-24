package homeWorksGit.inheritance.task2;

public class CarType extends VehicleTypeByPurpose{
    public CarType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
