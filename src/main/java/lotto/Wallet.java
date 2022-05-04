package lotto;

import java.util.ArrayList;
import java.util.List;

import static lotto.Const.LOTTERY_PRICE;

public class Wallet {
    public int money;
    public final List<Lottery> lotteries;

    public Wallet(int money) {
        if (money < LOTTERY_PRICE) {
            throw new IllegalArgumentException("Please give more than " + LOTTERY_PRICE + " won. but: " + money);
        }
        this.money = money;
        this.lotteries = new ArrayList<>();
    }

    public Wallet(List<Lottery> lotteries) {
        this.money = 0;
        this.lotteries = lotteries;
    }

    public void createLotteries() {
        while (this.money >= LOTTERY_PRICE) {
            buyLottery();
        }
    }

    public void buyLottery() {
        if (this.money < LOTTERY_PRICE) {
            throw new IllegalCallerException("Not enough money.");
        }
        this.money -= LOTTERY_PRICE;
        this.lotteries.add(new Lottery());
    }
}
