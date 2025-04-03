package building;

import java.util.List;
import java.util.stream.Collectors;

public class BuildingServiceImpl implements BuildingService {
    private final BuildingRepository repository;

    public BuildingServiceImpl(BuildingRepository repository) {
        this.repository = repository;
    }

    @Override
    public int getTotalHousePrice() {
        return repository.getHouses().stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public int getTotalVillaPrice() {
        return repository.getVillas().stream().mapToInt(Villa::getPrice).sum();
    }

    @Override
    public int getTotalSummerHousePrice() {
        return repository.getSummerHouses().stream().mapToInt(SummerHouse::getPrice).sum();
    }

    @Override
    public int getTotalBuildingPrice() {
        return repository.getBuildings().stream().mapToInt(Building::getPrice).sum();
    }

    @Override
    public double getAverageSquareMetersOfHouses() {
        return repository.getHouses().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfVillas() {
        return repository.getVillas().stream().mapToInt(Villa::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfSummerHouses() {
        return repository.getSummerHouses().stream().mapToInt(SummerHouse::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfBuildings() {
        return repository.getBuildings().stream().mapToInt(Building::getSquareMeters).average().orElse(0);
    }

    @Override
    public List<Building> filterBuildingsByRoomCountAndLivingRoomCount(int roomCount, int livingRoomCount) {
        return repository.getBuildings().stream()
                .filter(b -> b.getRoomCount() == roomCount && b.getLivingRoomCount() == livingRoomCount)
                .collect(Collectors.toList());
    }
}