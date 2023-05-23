package com.example.jpa_bank.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Data
@AllArgsConstructor
@Generated
public class TransactionResponseDTO {
    private Integer id;
    private int origen;
    private int destination;
    private int amount;
}
