package com.bank.account.controllers;

import com.bank.account.entity.AccountDetails;
import com.bank.account.service.AccountDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AccountDetailsController {

    private final AccountDetailsService accountDetailsService;

    public AccountDetailsController(AccountDetailsService accountDetailsService) {
        this.accountDetailsService = accountDetailsService;
    }
    @GetMapping("/")
    public List<AccountDetails> findAllAccounts() {
        return accountDetailsService.findAllAccounts();
    }
    @GetMapping("/{id}")
    public ResponseEntity<AccountDetails> findAccountById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accountDetailsService.findById(id).get());
    }
    @PostMapping("/add")
    public ResponseEntity<HttpStatus> addAccount(@RequestBody AccountDetails accountDetails) {
        accountDetailsService.save(accountDetails);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteAccount(@PathVariable("id") Long id) {
        accountDetailsService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<HttpStatus> updateAccount(@PathVariable("id") Long id, @RequestBody AccountDetails accountDetails) {
        accountDetails.setId(id);
        accountDetailsService.save(accountDetails);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
