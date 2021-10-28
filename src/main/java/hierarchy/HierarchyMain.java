package hierarchy;

import hierarchy.operation.OperType;
import hierarchy.operation.Operation;
import hierarchy.valut.Currency;

import java.util.ArrayList;

import static hierarchy.operation.OperType.BUY;
import static hierarchy.operation.OperType.SALE;

public class HierarchyMain {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", 27.2, 28.1);
        Currency eur = new Currency("EUR", 33.5, 34.2);
        ArrayList<Currency> currencyList = new ArrayList<>();
        currencyList.add(usd);
        currencyList.add(eur);


        System.out.println(usd);
        System.out.println(eur);

        Stock stock1 = new Stock(1);
        Stock stock2 = new Stock(2);

        Market market1 = new Market("market1", currencyList);
        Market market2 = new Market("market2", currencyList);

        ArrayList<Market> marketList = new ArrayList<>();
        marketList.add(market1);
        marketList.add(market2);

        Emmitent emmitent1 = new Emmitent("stock1", stock1, marketList);
        Emmitent emmitent2 = new Emmitent("stock2", stock2, marketList);

        Operation sale = new Operation(SALE, "USD", emmitent1);
        Operation buy = new Operation(BUY, "EUR", emmitent2);


        Double sum = market1.obmenka(sale, currencyList, 200);

        System.out.println(sum);
    }





}
