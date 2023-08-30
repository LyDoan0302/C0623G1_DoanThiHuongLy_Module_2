package ss20_case_study_furama_resort.model.repository.impl;

import ss20_case_study_furama_resort.model.model.Booking;
import ss20_case_study_furama_resort.model.model.Customer;
import ss20_case_study_furama_resort.model.model.Employee;
import ss20_case_study_furama_resort.model.model.Person;
import ss20_case_study_furama_resort.model.repository.IBookingRepository;
import ss20_case_study_furama_resort.model.repository.ICustomerRepository;
import ss20_case_study_furama_resort.utilsFile.ReadAndWriteByCharacterStream;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {


    public static final String COMMA = ",";
    private static final String PATH_NAME = "/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss20_case_study_furama_resort/data/Customer.csv";
    @Override
    public List<Customer> display() {
        List<Customer> customerList = this.convertToCustomer();
        return customerList;
    }
    @Override
    public void add(Customer customer) {
        List<Customer> customerList = this.convertToCustomer();
        customerList.add(customer);
        ReadAndWriteByCharacterStream.writeByCharacterStream(PATH_NAME,convertToString(customerList));
    }
    @Override
    public void edit(Customer customer) {
        List<Customer> customerList = this.convertToCustomer();
        for(Customer cus: customerList) {
            if(cus.getId().equals(customer.getId())) {
                cus.setName(customer.getName());
                cus.setBirth(customer.getBirth());
                cus.setGender(customer.getGender());
                cus.setPrivateId(customer.getPrivateId());
                cus.setPhoneNumber(customer.getPhoneNumber());
                cus.setEmail(customer.getEmail());
                cus.setAddress(customer.getAddress());
                cus.setCustomerClass(customer.getCustomerClass());
            }
        }
        ReadAndWriteByCharacterStream.writeByCharacterStream(PATH_NAME, convertToString(customerList));
    }

    @Override
    public void delete(String id) {
        List<Customer> customerList = this.convertToCustomer();
        for(Customer cus : customerList) {
            if(id.equals(cus.getId())) {
                customerList.remove(cus);
            }
        }
        ReadAndWriteByCharacterStream.writeByCharacterStream(PATH_NAME, convertToString(customerList));
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customerList = this.convertToCustomer();
        List<Customer> customersSearchList = new ArrayList<>();
        for(Customer cus : customerList) {
            if(cus.getName().contains(name)) {
                customersSearchList.add(cus);
            }
        }
        return customersSearchList;
    }

    public List<Customer> convertToCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> customerStringList = ReadAndWriteByCharacterStream.readByCharacterStream(PATH_NAME);
        String[] str;
        for(String cus: customerStringList) {
            str = cus.split(COMMA);
            customerList.add( new Customer(
                    str[0],
                    str[1],
                    str[2],
                    str[3],
                    str[4],
                    str[5],
                    str[6],
                    str[7],
                    str[8]));
        }
        return customerList;
    }
    public List<String> convertToString(List<Customer> customerList) {
        List<String> customerStringList = new ArrayList<>();
        for(Customer cus : customerList) {
            customerStringList.add(
                    cus.getId() + COMMA +
                    cus.getName() + COMMA +
                    cus.getBirth() + COMMA +
                    cus.getGender() + COMMA +
                    cus.getPrivateId() + COMMA +
                    cus.getPhoneNumber() + COMMA +
                    cus.getEmail() + COMMA +
                    cus.getAddress() + COMMA +
                    cus.getCustomerClass());
        }
        return customerStringList;
    }
//    public List<Customer> getCustomer() {
//        List<String> customerStringList = new ArrayList<>();
//        customerStringList = ReadAndWriteByCharacterStream.readByCharacterStream(PATH_NAME);
//        return convertToCustomer(customerStringList);
//    }
}
