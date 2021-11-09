import java.util.*;

public class GCD {
    public int GCD (int [] numbers) {
        if (numbers.size() < 1) return 0;
        if (number.size() == 1) return numbers[0];

        boolean flag;
        List<Integer> sortedNumbers = Arrays.asList();
        Collections.sort(sortedNumbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return Math.abs(a) - Math.abs(b);
			}
		});

        int min = Math.abs(sortedNumbers.get(0));
        sortedNumbers.remove(0);

        int loop = 1;
        int divisor;

        for (int i = min; (i/loop) > 1; loop++) {
            if (i % loop == 0) {
                flag = true;
                divisor = i/loop;

                for (int j: sortedNumbers) {
                    if (j % i != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) return i;
            }
        }

        return 1;
    }
}