package com.dor.couponsproject;

import com.dor.couponsproject.services.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class CouponsProjectApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CouponsProjectApplication.class, args);

        CompanyService companyService = context.getBean(CompanyService.class);

//        companyService.createCompany(Company.builder()
//                .name("random")
//                .email("random@gmail.com")
//                .password("random123")
//                .build());//
//
//        companyService.createCompany(Company.builder()
//                .name("randomali")
//                .email("randomali@gmail.com")
//                .password("random123567")
//                .build());

//        companyService.updateCompany(Company.builder()
//                        .name("random1234")
//                        .email("random1@gmail.com")
//                        .password("random123")
//                .build()

//        );

        System.out.println(companyService.getOneCompany(1));
        System.out.println(companyService.getAllCompanies());

    }


}
