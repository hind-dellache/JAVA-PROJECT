package Cabinet;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppliCabinet {
    private static final AtomicInteger compteur = new AtomicInteger(0);

    // Méthode pour générer un identifiant unique de manière atomique
    private static int genererIdUnique() {
        return compteur.incrementAndGet();
    }

    public static void main(String[] args) {
        
        
        // Créer un cabinet médical
        Cabinet_Medical cabinet = new Cabinet_Medical("Cabinet du Centre", "123 Avenue de la Santé", "0123456789", "contact@cabinetcentre.com");

        // Ajouter des médecins
       Medecin medecin1 = new Medecin( "Dupont", "Jean", "Médecin généraliste", "123 Rue des Médecins", "0123456789", "dr.dupont@example.com");
        Medecin medecin2 = new Medecin( "Martin", "Sophie", "Cardiologue", "456 Rue des Spécialistes", "0987654321", "dr.martin@example.com");
        
        cabinet.ajouterMedecin(medecin1);
        cabinet.ajouterMedecin(medecin2);

        // Ajouter des patients
        
        Patient patient1 = new Patient( "Durand", "Alice","30",  "0123456789", "789 Rue des Patients");

   
        Patient patient2 = new Patient( "Lemoine", "Pierre","45",  "0987654321", "321 Rue des Patients");

        cabinet.ajouterPatient(patient1);
        cabinet.ajouterPatient(patient2);

          // Ajouter des rendez-vous
       RendezVous rendezVous1 = new RendezVous(patient1, "18", "05", "2024", "Consultation générale", medecin1);
        RendezVous rendezVous2 = new RendezVous(patient2, "15", "06", "2024", "Consultation cardiologique", medecin2);


        cabinet.ajouterRendezVous(rendezVous1);
        cabinet.ajouterRendezVous(rendezVous2);
        
        // Création des médicaments
        Medicament medicament1 = new Medicament("Paracétamol", "500 mg");
        Medicament medicament2 = new Medicament("Ibuprofène", "200 mg");

        // Création de la liste des médicaments prescrits
        List<Medicament> medicaments = new ArrayList<>();
        medicaments.add(medicament1);
        medicaments.add(medicament2);
        
       // Création de l'ordonnance
        Ordonnance ordonnance = new Ordonnance(medicaments, "posologie", "dureeTraitement", patient1, "motif", medecin1);
        
        
// Création d'une instance de CertificatMedical en utilisant le constructeur
Date date = new Date();
CertificatMedical certificatMedical = new CertificatMedical(patient1, "motif", date, medecin1);



// Création d'une instance de Consultation en utilisant le constructeur
Consultation consultation = new Consultation("heure", "motif", "anamnese", "examenPhysique", "diagnostic", ordonnance, certificatMedical);
        
        TensionArterielle tension = new TensionArterielle(120, 80);
        

        // Afficher les informations du cabinet
        System.out.println(cabinet.toString());
        // Ajouter des dossiers médicaux
        List<Consultation> consultations1 = new ArrayList<>();
        List<Consultation> consultations2 = new ArrayList<>();
        
        Constantes constantes1 = new Constantes("120/80 mmHg", 70, 36.6f);
        Terrain terrain1 = new Terrain(65.0f, 170.0f, "O+");
        List<String> allergies1 = new ArrayList<>();
        allergies1.add("Pollen");
        InformationsMedicales informationsMedicales1 = new InformationsMedicales("Aucun antécédent", "Aucune chirurgie", terrain1, allergies1, constantes1, "Rien de particulier");
        
        SuiviMedical suiviMedical1 = new SuiviMedical(patient1, informationsMedicales1, consultations1);
        DossierMedical dossierMedical1 = new DossierMedical(patient1, consultations1, suiviMedical1, new ArrayList<>(), new ArrayList<>());
        
        Constantes constantes2 = new Constantes("110/70 mmHg", 75, 37.0f);
        Terrain terrain2 = new Terrain(80.0f, 180.0f, "A+");
        List<String> allergies2 = new ArrayList<>();
        allergies2.add("Arachides");
        InformationsMedicales informationsMedicales2 = new InformationsMedicales("Antécédents familiaux de diabète", "Appendicectomie", terrain2, allergies2, constantes2, "Rien de particulier");

        SuiviMedical suiviMedical2 = new SuiviMedical(patient2, informationsMedicales2, consultations2);
        DossierMedical dossierMedical2 = new DossierMedical(patient2, consultations2, suiviMedical2, new ArrayList<>(), new ArrayList<>());

        cabinet.ajouterDossierMedical(dossierMedical1);
        cabinet.ajouterDossierMedical(dossierMedical2);

       
        // Afficher les informations du cabinet
        cabinet.toString() ;

        // Afficher les médecins
        cabinet.afficherMedecins();
        System.out.println();

        // Afficher les patients
        cabinet.afficherPatients();
        System.out.println();

        // Afficher les rendez-vous
        cabinet.afficherRendezVous();
        System.out.println();
       
        
         // Rechercher un dossier médical par nom de patient
        String nomRecherche = "Durand";
        DossierMedical dossierTrouve = cabinet.rechercherDossierParNom(nomRecherche);

        // Afficher le résultat de la recherche
        if (dossierTrouve != null) {
            System.out.println("Dossier médical trouvé pour " + nomRecherche + ":");
            System.out.println(dossierTrouve);
        } else {
            System.out.println("Aucun dossier médical trouvé pour " + nomRecherche);
        }
        
         // Créer un nouveau dossier médical pour un patient spécifique
        DossierMedical nouveauDossier = new DossierMedical(patient1);

        // Ajouter le nouveau dossier médical au patient spécifié
        boolean ajoutReussi = cabinet.ajouterDossierMedicalAPatient("Durand", nouveauDossier);

        // Vérifier si l'ajout a été réussi
        if (ajoutReussi) {
            System.out.println("Nouveau dossier médical ajouté avec succès pour le patient Dupont.");
        } else {
            System.out.println("Échec de l'ajout du dossier médical pour le patient Dupont.");
        }
         

        
        

        // Rechercher et afficher le dossier médical du patient "Durand"
        DossierMedical dossierMedical = cabinet.rechercherDossierParNom("Durand");
        if (dossierMedical != null) {
            dossierMedical.afficherDossierMedical();
        } else {
            System.out.println("Dossier médical non trouvé pour le patient Dupont.");
        }
        
        
        
    }
    }
