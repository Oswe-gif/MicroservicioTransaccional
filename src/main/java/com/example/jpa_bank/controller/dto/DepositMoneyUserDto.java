package com.example.jpa_bank.controller.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Data
@AllArgsConstructor
@Generated
public class DepositMoneyUserDto {
    private int moneyAmount;
    private int accountNumber;
}
