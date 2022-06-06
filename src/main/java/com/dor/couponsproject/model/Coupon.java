package com.dor.couponsproject.model;
import com.dor.couponsproject.enums.Category;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category" ,nullable = false)
    public Category category;

    @Column(name = "title" ,nullable = false)
    private String title;

    @Column(name = "description" ,nullable = false)
    private String description;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;

    @Column(name = "image")
    private String image;
}
