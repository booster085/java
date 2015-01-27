package Homeworks.loops_methods.Products;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OrdedOfProducts {

	private static final String PRODUCTS = "text_files/Products.txt";
	private static final String ORDER = "text_files/Order.txt";
	private static final String OUTPUTTOTAL = "text_files/OutputTotal.txt";

	public static List<Product> getProductsAndPricesFromFile(String filePath) {
		List<Product> productList = new ArrayList<Product>();
		try (Scanner fileReader = new Scanner(new File(filePath), "UTF-8")) {
			// Assume that always will be 2 values -> product name and price
			while (fileReader.hasNext()) {
				String productName = fileReader.next();
				String productPrice = fileReader.next();
				productList.add(createProduct(productName, productPrice));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		return productList;
	}
	
	public static Product createProduct(String name, String price) {
		Product product = new Product();
		product.setName(name);
		product.setPrice(new BigDecimal(price));
		return product;
	}

	public static BigDecimal getOrdersTotal(String filePath, List<Product> productList) {
		BigDecimal total = new BigDecimal("0");
		try (Scanner fileReader = new Scanner(new File(filePath), "UTF-8")) {	
			while (fileReader.hasNext()) {
				String quantityStr = fileReader.next();
				BigDecimal quantity = new BigDecimal(quantityStr);
				String productName = fileReader.next();
				for (Product product : productList) {
					if (product.getName().equals(productName)) {
						total = total.add(product.getPrice().multiply(quantity));
						break;
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		return total;
	}
	
	public static void printInFile(String filePath, String data) {
		try (PrintStream fileWriter = new PrintStream(new File(filePath), "UTF-8")){
			fileWriter.println(data);
		} catch (FileNotFoundException | UnsupportedEncodingException fnfe) {
			System.out.println("File not found or invalid encoding");
		}
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		List<Product> productList = new ArrayList<Product>();
		productList = getProductsAndPricesFromFile(PRODUCTS);
		BigDecimal total = getOrdersTotal(ORDER, productList);
		/*
		 * In the homework at the first example there is a mistake. Result
		 * is 71.6 calculated a few times manually and by calculator
		 */
		printInFile(OUTPUTTOTAL, String.format("%.1f", total));

	}
}
