package case_study_furama_resort.model.repository;

public interface IFacilityRepository extends IRepository{
    void displayListFacilityMaintain();
    void deleteFacility(String id);
}
