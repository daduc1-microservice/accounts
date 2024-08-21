package com.daduc.accounts.service;

import com.daduc.accounts.dto.CustomerDetailsDto;

public interface ICustomerDetailsService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customers Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
