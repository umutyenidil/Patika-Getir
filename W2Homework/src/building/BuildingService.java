package building;

import java.util.List;

public interface BuildingService {
    int getTotalHousePrice();
    int getTotalVillaPrice();
    int getTotalSummerHousePrice();
    int getTotalBuildingPrice();

    double getAverageSquareMetersOfHouses();
    double getAverageSquareMetersOfVillas();
    double getAverageSquareMetersOfSummerHouses();
    double getAverageSquareMetersOfBuildings();

    List<Building> filterBuildingsByRoomCountAndLivingRoomCount(int roomCount, int livingRoomCount);
}