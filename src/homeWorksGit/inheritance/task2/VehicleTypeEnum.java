package homeWorksGit.inheritance.task2;

public enum VehicleTypeEnum {
    TRUCK("Грузовой"),
    CAR("Легковая"),
    PASSENGER("Пасажирский"),
    SEDAN("Седан"),
    WAGON("Универсал"),
    PICKUP("Грузовик"),
    BUS("Автобус"),
    PETROL("Бензиновый"),
    DIESEL("Дизельный"),
    HYBRID("Гибридный"),
    ELECTRIC("Электрический");

    private String nameOfAttribute;

    VehicleTypeEnum(String nameOfAttribute) {
        this.nameOfAttribute = nameOfAttribute;
    }

    public String getNameOfAttribute() {
        return nameOfAttribute;
    }
}
