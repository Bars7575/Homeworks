package homeWorksGit.inheritance.task2;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("123", "Volvo", new PassengerType(VehicleTypeEnum.PASSENGER),
                new SedanType(VehicleTypeEnum.SEDAN), new PetrolType(VehicleTypeEnum.PETROL));
        VehicleAd kamazAd = new VehicleAd("45", "Kamaz", new TruckType(VehicleTypeEnum.TRUCK),
                new PickupType(VehicleTypeEnum.PICKUP), new DieselType(VehicleTypeEnum.DIESEL));



        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType(VehicleTypeEnum.PASSENGER));

        adsService.filterByVehicleTypeByPurpose(new TruckType(VehicleTypeEnum.TRUCK));

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом
    }
}
