package homeWorksGit.inheritance.task2;

public class VehicleTypeByFuelTypes extends VehicleType{
    public VehicleTypeByFuelTypes(VehicleTypeEnum attribute) {
        super(attribute);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
