package homeWorksGit.inheritance.task2;

public class PassengerType extends VehicleTypeByPurpose{
    public PassengerType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
