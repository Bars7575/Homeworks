package homeWorksGit.inheritance.task2;

public class VehicleType {
    protected VehicleTypeEnum attribute;

    public VehicleType(VehicleTypeEnum attribute) {
        this.attribute = attribute;
    }

    public VehicleType() {
    }

    public String getAttributeOfType() {
        return attribute.getNameOfAttribute();
    }
    public String getTypeName() {
        return attribute.getNameOfAttribute();
    }
}
