package com.bankingapp.DTO;

import com.bankingapp.entities.OperationType;
import lombok.Data;

import java.util.Date;

@Data
public class AccountOperationDTO {
        private Long id;
        private Date operationDate;
        private double amount;
        private OperationType type;
        private String description;
}
