package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;

public interface FormationBusiness {
	
Formation creerFormation( Formation formationACreer);

List<Formation> recupererToutesLesFormations();

List<Formation> recupererLaFormationAvecLeNom(String nom);

List<Formation> recupererLaFormationAvecId(String id);

void supprimerFormation(String id);


}
