package com.dor.couponsproject.dto;

import lombok.*;

@Data
@ToString(exclude = "password")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CompanyDTO {

    private Long id;
    private String name;
    private String email;
    private String password;

}