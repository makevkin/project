package com.bank.account.service;

import com.bank.account.entity.AccountDetails;
import com.bank.account.repository.AccountDetailsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class AccountDetailsService {
    private final AccountDetailsRepository accountDetailsRepository;
    public AccountDetailsService(AccountDetailsRepository accountDetailsRepository) {
        this.accountDetailsRepository = accountDetailsRepository;
    }
    @Transactional(readOnly = true)
    public List<AccountDetails> findAllAccounts() {
        return accountDetailsRepository.findAll();
    }
    @Transactional
    public void save(AccountDetails accountDetails) {
        accountDetailsRepository.save(accountDetails);
    }

    @Transactional(readOnly = true)
    public Optional<AccountDetails> findById(Long id) {
        return accountDetailsRepository.findById(id);
    }
    @Transactional
    public void delete(Long id) {
        accountDetailsRepository.deleteById(id);
    }
}
