package ss20_case_study_furama_resort.model.service;

import ss20_case_study_furama_resort.model.model.Facility;

import java.util.List;

public interface IFacilityService extends IService<Facility> {
    List<Facility> displayListFacilityMaintain();
    void deleteFacility(String id);
}
