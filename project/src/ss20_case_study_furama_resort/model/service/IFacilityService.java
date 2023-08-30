package ss20_case_study_furama_resort.model.service;

import ss20_case_study_furama_resort.model.model.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityService {
    LinkedHashMap<Facility, Integer> display();
    void addFacility(Facility facility);
    LinkedHashMap<Facility, Integer> displayListFacilityMaintain();
    void deleteFacility(Facility facility);
}
