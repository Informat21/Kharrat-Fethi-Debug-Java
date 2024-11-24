package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * la classe AnalytcisCounter est le point d'entrée principal du programme
 * Cette classe va lire la liste de symptômes dans le fichier symptoms.txt
 * Ensuite elle va compter le nombre de chaque symptôme
 * Enfin elle va écrire les résultats dans un fichier de sortie result.out
 */
public class AnalyticsCounter {
	/**
	 * Lecture des symptômes
	 * Comptage des occurences de chaque symptôme
	 * Affichage des résultats dans la console
	 * Ecriture des résultats dans un fichier
	 * @param args
	 * @throws Exception si une erreur intervient
	 */
	public static void main(String args[]) {

		//Lecture des symptômes
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile ("symptoms.txt");
		List< String > symptoms=  reader.GetSymptoms();

		//Comptage des occurences des symptômes
		SymptomCount count = new SymptomCount(); // instancie
		Map < String, Integer> symptomsCounts =count.SymptomCount(symptoms); // appel de la méthode SymptomCount

		// Affichage de chaque symptôme avec son compteur dans la console
		for (Map.Entry<String,Integer> entry : symptomsCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Ecriture des résultats dans le fichier result.out
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
		writer.writeSymptoms(symptomsCounts);
	}
}
