package ss20_case_study_furama_resort.model.service;

import ss20_case_study_furama_resort.model.model.Contract;

public interface IContractService extends IService<Contract> {
    void editContract(String contractId);
}
