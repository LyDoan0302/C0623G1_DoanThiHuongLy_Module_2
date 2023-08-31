package ss20_case_study_furama_resort.model.repository;

import ss20_case_study_furama_resort.model.model.Facility;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> display();
    void addFacility(Facility facility);
    LinkedHashMap<Facility, Integer> displayListFacilityMaintenance();
    void deleteFacility(String inputId);
}
