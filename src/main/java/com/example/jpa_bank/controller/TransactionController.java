package com.example.jpa_bank.controller;
import com.example.jpa_bank.controller.dto.AccountResponseDTO;
import com.example.jpa_bank.controller.dto.DepositMoneyUserDto;
import com.example.jpa_bank.controller.dto.TransactionDto;
import com.example.jpa_bank.controller.dto.TransactionResponseDTO;
import com.example.jpa_bank.entity.TransactionEntity;
import com.example.jpa_bank.service.TransactionalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class TransactionController {
    private TransactionalService transactionalService;
    @PostMapping(path = "/transaction/transfer-money")
    public TransactionResponseDTO doTransaction(@RequestBody TransactionDto transactionDto) {
        return transactionalService.doTransaction(transactionDto);
    }
    @PutMapping(path = "/transaction/deposit-money")
    public AccountResponseDTO depositMoney(@RequestBody DepositMoneyUserDto depositMoneyUserDto) {
        return transactionalService.depositMoney(depositMoneyUserDto);
    }
}
