package Homeworks.loops_methods.Products;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import Homeworks.loops_methods.Products.Product;
import Homeworks.loops_methods.Products.OrdedOfProducts;

public class ListOfProducts {
	
	private static final String PRODUCTS = "text_files/Products.txt";
	private static final String PRODUCTSOUTPUT = "text_files/ProductsOutput.txt";
	
	public static void printProductsInFile(String filePath, List<Product> productList) {
		try (PrintStream fileWriter = new PrintStream(new File(filePath), "UTF-8")){
			for (Product product : productList) {
				fileWriter.println(product);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found or invalid encoding");
		} catch (UnsupportedEncodingException ue) {
			System.out.println("Unsupported encoding");
		}
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		List<Product> productList = new ArrayList<Product>();
		//Reuse method from class OrderOfProducts
		productList = OrdedOfProducts.getProductsAndPricesFromFile(PRODUCTS);
		
			//Implement comparator to sort Object List by property price 
			Collections.sort(productList, new Comparator<Product>() {
				public int compare(Product p1, Product p2) {
					return p1.getPrice().compareTo(p2.getPrice());
				}
			});
			printProductsInFile(PRODUCTSOUTPUT, productList);
			
			
		
	}
	}
