package com.hemebiotech.analytics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * La classe SymptomCount sert à compter le nombre d'occurences pour chaque symptôme
 * Les résultats sont stockés dans une TreeMap afin qu'ils soient triés par ordre alphabétique
 */
public class SymptomCount {

    /**
     * Compte la quantité de chaque symptôme dans une liste
     * Crée un Map où il y a une clé : le symptôme et une valeur : la quantité
     * @param symptoms
     * @return
     */
    public Map<String, Integer> SymptomCount (List<String> symptoms) {

        // Déclarer un map pour stocker les symptômes et leurs occurrences
        Map< String, Integer> symptomsCounts = new TreeMap<>();

        // boucler sur symptoms avec un index afin de parcourir la liste des symptomes
        for (int i = 0; i < symptoms.size(); i++) {
            String symptom = symptoms.get(i);

            // Incrémenter le compteur pour chaque symptôme dans la Map
            symptomsCounts.put(symptom, symptomsCounts.getOrDefault( symptom, 0) + 1);
        }
        return symptomsCounts;
    }
}
