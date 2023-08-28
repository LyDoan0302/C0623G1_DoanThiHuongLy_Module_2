package ss20_case_study_furama_resort.model.repository;

import ss20_case_study_furama_resort.model.model.Contract;

public interface IContractRepository extends IRepository<Contract> {
    void editContract(String contractId);
}
