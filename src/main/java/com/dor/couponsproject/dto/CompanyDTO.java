package com.dor.couponsproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private long id;
    private String name;
    private String email;
    private String password;

}
