package com.bank.account.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;
@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "account_details")
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

    @Column(name = "negative_balanse")
    private  Boolean negativ_balance;

    @Column(name = "profile_id")
    private int profile_id;

    public AccountDetails() {
    }

    public AccountDetails(int passport_id, Long account_number, int bank_details_id,
                          BigDecimal money, Boolean negativ_balance, int profile_id) {
        this.passport_id = passport_id;
        this.account_number = account_number;
        this.bank_details_id = bank_details_id;
        this.money = money;
        this.negativ_balance = negativ_balance;
        this.profile_id = profile_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPassport_id() {
        return passport_id;
    }

    public void setPassport_id(int passport_id) {
        this.passport_id = passport_id;
    }

    public Long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Long account_number) {
        this.account_number = account_number;
    }

    public int getBank_details_id() {
        return bank_details_id;
    }

    public void setBank_details_id(int bank_details_id) {
        this.bank_details_id = bank_details_id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Boolean getNegativ_balance() {
        return negativ_balance;
    }

    public void setNegativ_balance(Boolean negativ_balance) {
        this.negativ_balance = negativ_balance;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }
}
