package homeWorksGit.inheritance.task2;

public class HybridType extends VehicleTypeByFuelTypes{
    public HybridType(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
