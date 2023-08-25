package case_study_furama_resort.model.service;

import case_study_furama_resort.model.model.Facility;

import java.util.List;

public interface IFacilityService extends IService{
    List<Facility> displayListFacilityMaintain();
    void deleteFacility(String id);
}
