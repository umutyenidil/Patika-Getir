package building;

import java.util.List;
import java.util.ArrayList;

public class BuildingRepositoryImpl implements BuildingRepository {
    private final List<House> houses = new ArrayList<>();
    private final List<Villa> villas = new ArrayList<>();
    private final List<SummerHouse> summerHouses = new ArrayList<>();

    public BuildingRepositoryImpl() {
        houses.add(new House(500000, 100, 2, 1));
        houses.add(new House(600000, 120, 3, 1));
        houses.add(new House(700000, 130, 3, 2));

        villas.add(new Villa(1500000, 250, 4, 2));
        villas.add(new Villa(1800000, 300, 5, 2));
        villas.add(new Villa(2000000, 350, 6, 3));

        summerHouses.add(new SummerHouse(800000, 150, 3, 1));
        summerHouses.add(new SummerHouse(850000, 160, 3, 2));
        summerHouses.add(new SummerHouse(900000, 170, 4, 1));
    }

    @Override
    public List<House> getHouses() {
        return houses;
    }

    @Override
    public List<Villa> getVillas() {
        return villas;
    }

    @Override
    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    @Override
    public List<Building> getBuildings() {
        List<Building> buildings = new ArrayList<>();
        buildings.addAll(houses);
        buildings.addAll(villas);
        buildings.addAll(summerHouses);
        return buildings;
    }
}