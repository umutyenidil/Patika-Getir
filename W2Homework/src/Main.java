import building.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BuildingRepository buildingRepository = new BuildingRepositoryImpl();

        System.out.println(buildingRepository.getHouses());
        System.out.println(buildingRepository.getSummerHouses());
        System.out.println(buildingRepository.getVillas());
        System.out.println(buildingRepository.getBuildings());

        BuildingService buildingService = new BuildingServiceImpl(buildingRepository);

        System.out.println("Total house price: " + buildingService.getTotalHousePrice());
        System.out.println("Total summer house price: " + buildingService.getTotalSummerHousePrice());
        System.out.println("Total villa price: " + buildingService.getTotalVillaPrice());
        System.out.println("Total building price: " + buildingService.getTotalBuildingPrice());

        System.out.println("Average house square meters: " + buildingService.getAverageSquareMetersOfHouses());
        System.out.println("Average summer house square meters: " + buildingService.getAverageSquareMetersOfSummerHouses());
        System.out.println("Average villa square meters: " + buildingService.getAverageSquareMetersOfVillas());
        System.out.println("Average building square meters: " + buildingService.getAverageSquareMetersOfBuildings());

        List<Building> filteredBuildings = buildingService.filterBuildingsByRoomCountAndLivingRoomCount(3, 2);
        System.out.println("Filtered buildings: " + filteredBuildings);
    }
}