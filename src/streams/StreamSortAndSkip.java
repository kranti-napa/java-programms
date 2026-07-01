package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
	Filter by category "Electronics".
	
	Sort by price in descending order.
	
	Skip the most expensive one, and grab the next two.
	
	Collect to a List.
 */

public class StreamSortAndSkip {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(100,"Sony TV","Electronics",100000.00);
		Product p2 = new Product(200,"Apple I Phone","Mobiles",200000.00);
		Product p3 = new Product(101,"Gadget120","Electronics",50000.00);
		Product p4 = new Product(102,"Gadget121","Electronics",40000.00);
		Product p5 = new Product(102,"Gadget122","Electronics",52000.00);
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		List<Product> output = 
				 products.stream()
				 		.filter(product -> "Electronics".equalsIgnoreCase(product.getCategory()))
						.sorted(Comparator.comparingDouble(Product::getPrice).reversed())
						.skip(1)
						.limit(2)
						.collect(Collectors.toList());

		for(Product p: output) {
			System.out.println (p.getProductId() + " " + p.getProductName() + " " + p.getCategory() + " " + p.getPrice());
		}

	}

}
