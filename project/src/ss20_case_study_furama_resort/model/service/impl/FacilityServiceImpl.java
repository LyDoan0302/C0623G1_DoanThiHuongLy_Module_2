package ss20_case_study_furama_resort.model.service.impl;



import ss20_case_study_furama_resort.model.model.Facility;
import ss20_case_study_furama_resort.model.repository.IFacilityRepository;
import ss20_case_study_furama_resort.model.repository.impl.FacilityRepositoryImpl;
import ss20_case_study_furama_resort.model.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.List;

public class FacilityServiceImpl implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepositoryImpl();


    @Override
    public LinkedHashMap<Facility, Integer> display() {

        return facilityRepository.display();
    }

    @Override
    public void addFacility(Facility facility) {

        facilityRepository.addFacility(facility);
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayListFacilityMaintain() {
        return facilityRepository.displayListFacilityMaintenance();
    }

    @Override
    public void deleteFacility(String inputId) {
        facilityRepository.deleteFacility(inputId);
    }
}
