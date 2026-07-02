package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Write a stream pipeline to calculate the total net balance of all transactions.

		If the type is "CREDIT", the amount adds to the balance.
		
		If the type is "DEBIT", the amount subtracts from the balance.
 */

public class StreamGroupByThenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Transaction> transactions = new ArrayList<>();
		
		Transaction t1 = new Transaction ("CREDIT", 500);
		Transaction t2 = new Transaction ("DEBIT", 200);
		Transaction t3 = new Transaction ("CREDIT", 100);
		Transaction t4 = new Transaction ("CREDIT", 250);
		Transaction t5 = new Transaction ("DEBIT", 300);

		transactions.add(t1);
		transactions.add(t2);
		transactions.add(t3);
		transactions.add(t4);
		transactions.add(t5);

		double netBalance = transactions.stream()
											.mapToDouble(txn -> txn.getType().equalsIgnoreCase("CREDIT")
													? txn.getAmount() : - txn.getAmount()).sum();
		
		System.out.println(netBalance);
		
		Map<String, Double> map = transactions.stream()
												.collect(Collectors.groupingBy(Transaction::getType,
														Collectors.summingDouble(Transaction::getAmount)));
		
		System.out.println(map);
	}

}
