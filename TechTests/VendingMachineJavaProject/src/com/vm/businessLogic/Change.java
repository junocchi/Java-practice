package com.vm.businessLogic;

import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Change {
	// calculate change from BigDecimal to int pennies
		private int calculateChangeInPennies(BigDecimal amount, BigDecimal itemPrice) {
			BigDecimal change = amount.subtract(itemPrice);
			change = change.setScale(2, RoundingMode.HALF_UP);
			System.out.println("Enjoy it! Your change of $ " +change+ " will come shortly.");
			System.out.println("Please, colect your change:");
			int changeInPennies = (int) Math.round(100 * change.intValue());
			return changeInPennies;
		}
		
		private Map<Coins, Integer> getCoinsInCoins(int changeInPennies) {
			Map<Coins, Integer> coinCount = new HashMap<>();

			// Calculate the number of quarters
			int quarters = changeInPennies / Coins.QUARTER.getValue();
			coinCount.put(Coins.QUARTER, quarters);
			changeInPennies %= Coins.QUARTER.getValue();

			// Calculate the number of dimes
			int dimes = changeInPennies / Coins.DIMES.getValue();
			coinCount.put(Coins.DIMES, dimes);
			changeInPennies %= Coins.DIMES.getValue();

			// Calculate the number of nickels
			int nickels = changeInPennies / Coins.NICKLES.getValue();
			coinCount.put(Coins.NICKLES, nickels);
			changeInPennies %= Coins.NICKLES.getValue();

			// The remaining changeInPennies is the number of pennies
			coinCount.put(Coins.PENNIES, changeInPennies);

			return coinCount;
		}

		private String formatCoinCount(Map<Coins, Integer> coinCount) {
			StringBuilder builder = new StringBuilder();
			for (Map.Entry<Coins, Integer> entry : coinCount.entrySet()) {
				Coins coin = entry.getKey();
				int count = entry.getValue();
				builder.append(coin.getValue()).append(" cents: ").append(count).append("\n");
			}
			String changeInCoins = builder.toString();
			return changeInCoins;
		}
		
		private BigDecimal amount; 
		private BigDecimal itemPrice;
		
		public Change(BigDecimal amount, BigDecimal itemPrice) {
			super();
			this.amount = amount;
			this.itemPrice = itemPrice;
		}

		@Override
		public String toString() {
			int pennies = calculateChangeInPennies(amount, itemPrice);
			Map<Coins, Integer> coinsInCoins = getCoinsInCoins(pennies);
			return formatCoinCount(coinsInCoins);
		}
}
