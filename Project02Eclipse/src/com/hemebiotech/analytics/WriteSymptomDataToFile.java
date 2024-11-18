package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * La classe WriteSymptomDataToFile va écrire les symptômes et leur quantité dans un fichier texte result.out
 * Elle implémente l'interface ISymptomWriter
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * Ecriture des symptômes avec leur quantité sous la forme Symptôme : quantité
     * création du fichier de sortie result.out
     * @param symptoms
     */

    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        try (FileWriter writer = new FileWriter("result.out")) {

            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {

                //Afficher le symtôme et son occurrence dans la console
                System.out.println("symptom: " + entry.getKey() + " : " + entry.getValue());

                // Ecrire dans le fichier
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}



