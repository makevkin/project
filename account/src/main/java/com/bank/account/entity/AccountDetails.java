package com.bank.account.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_details", schema = "account")
public class AccountDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "passport_id")
    private  int passport_id;

    @Column(name = "account_number", unique = true)
    private  Long account_number;

    @Column(name = "bank_details_id", unique = true)
    private  int bank_details_id;

    @Column(name = "money")
    private BigDecimal money;

    @Column(name = "negative_balance")
    private  Boolean negative_balance;

    @Column(name = "profile_id")
    private int profile_id;


}
