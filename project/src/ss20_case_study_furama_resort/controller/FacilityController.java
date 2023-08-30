package ss20_case_study_furama_resort.controller;

import ss20_case_study_furama_resort.model.model.Facility;
import ss20_case_study_furama_resort.model.service.IFacilityService;
import ss20_case_study_furama_resort.model.service.impl.FacilityServiceImpl;

import java.util.LinkedHashMap;

public class FacilityController {
    private static final IFacilityService facilityService = new FacilityServiceImpl();
    public LinkedHashMap<Facility, Integer> display(){
        return facilityService.display();
    }
    public void addFacility(Facility facility){
        facilityService.addFacility(facility);
    }
    public LinkedHashMap<Facility, Integer> displayListFacilityMaintain(){
        return facilityService.displayListFacilityMaintain();
    }
    public void deleteFacility(Facility facility){
        facilityService.deleteFacility(facility);
    }
}
