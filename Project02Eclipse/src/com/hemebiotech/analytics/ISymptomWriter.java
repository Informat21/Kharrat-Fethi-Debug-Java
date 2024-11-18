package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;

/**
 * L'interface ISymmptomWriter définit un contrat pour l'écriture des symptômes et leur quantité
 */
public interface ISymptomWriter {
     /**
      * Ecriture des symptômes et du nombre d'occurence
      * @param symptoms
      */
     void writeSymptoms(Map<String, Integer> symptoms);
}


