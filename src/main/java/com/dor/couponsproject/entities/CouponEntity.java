package com.dor.couponsproject.entities;

import com.dor.couponsproject.enums.Category;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "coupons")
public class CouponEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne(optional = false)
    private CompanyEntity company;

    @Enumerated(EnumType.STRING)
    @Column(name = "category" ,nullable = false)
    private Category category;

    @Column(name = "title" , nullable = false, unique = true)
    private String title;

    @Column(name = "description" ,nullable = false)
    private String description;

    @Column(name = "start_date" ,nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date" ,nullable = false)
    private LocalDate endDate;

    @Column(name = "amount" ,nullable = false)
    private int amount;

    @Column(name = "price" ,nullable = false)
    private double price;

    @Column(name = "image")
    private String image;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(
            name = "customer_to_coupon",
            joinColumns = @JoinColumn(name = "coupon_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id"))
    @ToString.Exclude
    private List<CustomerEntity> customers;
}
