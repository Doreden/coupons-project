package com.dor.couponsproject.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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

    @Column(name = "password",nullable = false)
    private String password;

    @Transient
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<CouponEntity> coupons;
}
