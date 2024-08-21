package com.daduc.accounts.mapper;

import com.daduc.accounts.dto.CustomerDetailsDto;
import com.daduc.accounts.entity.Customer;

public class CustomerDetailsMapper {

    public static CustomerDetailsDto mapToCustomerDetailsDto(Customer customer, CustomerDetailsDto customerDetailsDto) {
        customerDetailsDto.setName(customer.getName());
        customerDetailsDto.setEmail(customer.getEmail());
        customerDetailsDto.setMobileNumber(customer.getMobileNumber());
        return customerDetailsDto;
    }
}
