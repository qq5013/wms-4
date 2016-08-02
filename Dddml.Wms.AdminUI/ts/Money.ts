namespace Dddml.Wms.Domain {
    export class Money {
        private amount:string;
        private currency:string;

        getAmount():string {
            return this.amount;
        }

        setAmount(amount:string) {
            this.amount = amount;
        }

        getCurrency():string {
            return this.currency;
        }

        setCurrency(currency:string) {
            this.currency = currency;
        }
    }
}