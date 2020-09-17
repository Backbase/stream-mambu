package com.backbase.stream.mambu.outbound.model;

import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MambuAccount {

    @Id
    Integer id;

    String accountId;

    String iban;

    public MambuAccount(DepositAccount depositAccount) {
        this.accountId = depositAccount.getId();
        this.iban = depositAccount.getIBAN().getIBAN();
    }


}
