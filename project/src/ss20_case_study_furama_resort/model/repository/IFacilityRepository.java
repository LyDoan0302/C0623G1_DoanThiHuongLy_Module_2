package ss20_case_study_furama_resort.model.repository;

import ss20_case_study_furama_resort.model.model.Facility;

import java.awt.*;
import java.util.List;

public interface IFacilityRepository extends IRepository<Facility> {
    List<Facility> displayListFacilityMaintenance();
    void deleteFacility();
}
