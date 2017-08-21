package  main.java.com.inrhythm.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import main.java.com.inrhythm.model.Cart;

@Service("cartService")
public class CartService {
	
	public Cart getUserCart(String email, String filePath) {
		System.out.println("FILEPATH: " + filePath);
		String content = getFileConent(filePath);
		
		Map<Long, Integer> itemMap = new HashMap<Long, Integer>();
		String cartItems = content.split("#")[1];
		String[] itemArray = cartItems.split(",");
		
		for(String item : itemArray) {
			String[] pair = item.split(":");
			String sku = pair[0];
			String quantity = pair[1];
			
			itemMap.put(Long.parseLong(sku), Integer.parseInt(quantity));
		}
		
		return new Cart(email, itemMap);
	}
	
	public void setUserCart(String email, String filePath, Long sku, Integer quantity) {
		System.out.println("FILEPATH: " + filePath);
		String content = getFileConent(filePath);
		String cartItems = content.split("#")[1];
		String newCartItems = "";
		
		// do the necessary adjustment to the cart
		if(cartItems.contains(sku.toString())) {
			String[] itemArray = cartItems.split(",");
			
			for(String item : itemArray) {
				String[] pair = item.split(":");
				String pairSku = pair[0];
				String pairQuantity = pair[1];
				if(pairSku.equals(sku)) {
					pairQuantity = quantity.toString();
				}
			}
			
			cartItems = String.join(",", itemArray);
			
		} else {
			cartItems += sku.toString() + ":" + quantity.toString();
		}
		
		content = email + "#" + cartItems;
		
		//write to file
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(filePath);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
		
	private String getFileConent(String filePath) {
		BufferedReader br = null;
		FileReader fr = null;
		String content = "";
		try {

			
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);

			
			content = br.readLine();
				System.out.println(content);
			

		} catch (IOException e) {

			System.out.println(e.getMessage());
			

		} finally {
			try {
				if (br != null)
					br.close();
	
				if (fr != null)
					fr.close();
			} catch (IOException ex) {

				System.out.println(ex.getMessage());

			}
		}
		
		return content;
	}
}
