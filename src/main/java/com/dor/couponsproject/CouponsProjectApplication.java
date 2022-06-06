package com.dor.couponsproject;

import com.dor.couponsproject.services.AdminService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class CouponsProjectApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CouponsProjectApplication.class, args);

        AdminService adminService = context.getBean(AdminService.class);

//        companyService.createCompany(CompanyEntity.builder()
//                .name("random")
//                .email("random@gmail.com")
//                .password("random123")
//                .build());//
//
//        companyService.createCompany(CompanyEntity.builder()
//                .name("randomali")
//                .email("randomali@gmail.com")
//                .password("random123567")
//                .build());

//        companyService.updateCompany(CompanyEntity.builder()
//                        .name("random1234")
//                        .email("random1@gmail.com")
//                        .password("random123")
//                .build()

//        );

        System.out.println(adminService.getOneCompany(1));
        System.out.println(adminService.getAllCompanies());

    }


}
