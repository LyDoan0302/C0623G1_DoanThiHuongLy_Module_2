package ss20_case_study_furama_resort.model.repository.impl;
import ss20_case_study_furama_resort.model.model.Facility;
import ss20_case_study_furama_resort.model.model.House;
import ss20_case_study_furama_resort.model.model.Room;
import ss20_case_study_furama_resort.model.model.Villa;
import ss20_case_study_furama_resort.model.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class FacilityRepositoryImpl implements IFacilityRepository {

    private static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    static {
        Room room1 = new Room("SVRO-0001","R 01",32,800, 4,"Hour","Breakfast");
        Room room2 = new Room("SVRO-0002","R 02",32,800, 4,"Day","Breakfast");
        Villa villa1= new Villa("SVVL-0001","V 01",70,2000,8,"Day","Standard",30,2);
        Villa villa2= new Villa("SVVL-0002","V 02",70,3000,8,"Day","Family",30,2);
        House house1 = new House("SVHO-0001","H 01",70, 3000, 10, "Month", "Family", 1);
        House house2 = new House("SVHO-0002","H 02",80, 4000, 12, "Year", "Luxury", 2);
        linkedHashMap.put(room1, 0);
        linkedHashMap.put(room2,0);
        linkedHashMap.put(villa1,0);
        linkedHashMap.put(villa2,0);
        linkedHashMap.put(house1,0);
        linkedHashMap.put(house2,0);
    }

    @Override
    public LinkedHashMap<Facility, Integer> display() {
        return linkedHashMap;
    }

    @Override
    public void addFacility(Facility facility) {
        for(Map.Entry<Facility, Integer> entry: linkedHashMap.entrySet()) {
            if(entry.getKey().equals(facility)) {
                linkedHashMap.put(facility,0);
            }
        }
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayListFacilityMaintenance() {
        LinkedHashMap<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
        for(Map.Entry<Facility, Integer> entry: linkedHashMap.entrySet()) {
            if(entry.getValue()%5==0) {
                facilityMaintenance.put(entry.getKey(), entry.getValue());
            }
        }
        return facilityMaintenance;
    }

    @Override
    public void deleteFacility(Facility key) {
        for(Map.Entry<Facility, Integer> entry: linkedHashMap.entrySet()) {
            if(key.equals(entry.getKey())) {
                linkedHashMap.remove(key);
                break;
            }
        }
    }
}
