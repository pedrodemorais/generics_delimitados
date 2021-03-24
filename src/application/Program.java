package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\arquivo.txt"))) {
			String line = br.readLine();

			while (line != null) {
				// System.out.println(line);
				String[] campos=line.split(",");
				lista.add(new Product(campos[0],Double.parseDouble(campos[1])));
				line = br.readLine();

			}

			for (Product produtos : lista) {
				System.out.print(produtos);

			}
			
			Product x = CalculationService.max(lista);
			System.out.println("Max: ");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());

		}

	}

}
