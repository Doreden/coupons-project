package com.dor.couponsproject.entities;
import com.dor.couponsproject.enums.Category;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Locale;

@Data
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
    @Column(name = "category" ,nullable = false)
    public Category category;
    @Column(name = "title" ,nullable = false)
    private String title;
    @Column(name = "description" ,nullable = false)
    private String description;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "amount")
    private int amount;
    @Column(name = "price")
    private double price;
    @Column(name = "image")
    private String image;
}
