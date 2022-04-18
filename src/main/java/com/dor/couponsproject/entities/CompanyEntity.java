package com.dor.couponsproject.entities;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "companies")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_name",nullable = false, unique = true)
    private String name;
    @Column(name = "email", nullable = false,unique = true)
    private String email;
    @Column(name = "password",nullable = false,unique = false)
    private String password;


}
