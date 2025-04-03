package building;

import java.util.List;

public interface BuildingRepository {
    List<House> getHouses();

    List<Villa> getVillas();

    List<SummerHouse> getSummerHouses();

    List<Building> getBuildings();
}