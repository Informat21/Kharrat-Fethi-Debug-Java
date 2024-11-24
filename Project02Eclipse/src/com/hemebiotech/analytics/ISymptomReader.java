package com.hemebiotech.analytics;

import java.util.List;

/**
 * Tout ce qui lira les données de symptômes à partir d'une source
 * La partie importante est la valeur de retour de l'opération, qui est une liste de chaînes,
 * qui peut contenir de nombreuses duplications
 * L'implémentation n'a pas besoin de classer la liste
 */
public interface ISymptomReader {
	/**
	 * Si aucune donnée n'est disponible, renvoyer une liste vide
	 * @return une liste brute de tous les symptômes obtenus à partir d'une source de données,
	 * les doublons sont possibles
	 */
	List<String> GetSymptoms ();
}
