package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * La classe ReadSymptomDataToFile va lire les symptômes à partir du fichier symptoms.txt
 * Elle implémente l'interface ISymptomReader
 */

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */

	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/** Lecture des symptômes dans le fichier
	 * Chaque ligne de symptôme est ajouté à la liste
	 * Une exception est affichée si le fichier n'est pas trouvé ou s'il est vide
	 * @return
	 */

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();

				}

				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
