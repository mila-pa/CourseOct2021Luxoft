package hierarchy;

import hierarchy.operation.OperType;
import hierarchy.operation.Operation;
import hierarchy.valut.Currency;

import java.util.ArrayList;
import java.util.List;

import static hierarchy.operation.OperType.SALE;

public class Market {
    private String name;
    private List<Currency> currencyList;

    public Market(String name, List<Currency> currencyList) {
        this.name = name;
        this.currencyList = currencyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", currencyList=" + currencyList +
                '}';
    }

    public double obmenka(Operation operation, ArrayList<Currency> currencyList, int amount) {
        double sum=0;
        for (Currency currency : currencyList) {
            if (operation.getOperType() == SALE) {
                sum = amount * currency.getSale();
            } else {
                sum = amount * currency.getBuy();
            }

        }
        return sum;
    }
}
