package homeWorksGit.inheritance.task2;

public class PetrolType extends VehicleTypeByFuelTypes{
    public PetrolType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
