package nodamoney;

import java.math.BigDecimal;

/**
 * Created by Yang on 2016/7/16.
 */
public class Money {

    private BigDecimal amount;

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
