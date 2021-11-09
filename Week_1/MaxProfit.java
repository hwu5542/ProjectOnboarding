import java.io.Scanner;
import java.util.List;

public class MaxProfit {
	public List<Integer> maxProfit (int [] stockPrice) {

		//can not profit from less than 2 days
		if (stockPrice.size() < 2) return null;

		int buy = 0;
		int sell = 1;
		int profit = stockPrice[buy]-stockPrice[sell];
		int tempProfit = 0;

		for (int i=0; i<stockPrice.size(); i++) {
			for (int j=i+1; j<stockPrice.size(); j++) {
				tempProfit = stockPrice[j]-stockPrice[i];
				if (tempProfit > profit) {
					profit = tempProfit;
					buy = i;
					sell = j;
				}
			}
		}

		List<Integer> result = new ArrayList<Integer>();
		result.push(buy);
		result.push(sell);

		return result;
	}
}
