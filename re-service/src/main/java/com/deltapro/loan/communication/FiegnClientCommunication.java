package com.deltapro.loan.communication;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://localhost:yourPortNo/", name = "YOUR-SERVICE-NAME")
public interface FiegnClientCommunication {

}
