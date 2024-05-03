
package Cabinet; // Importation du package Cabinet

import java.util.Date; // Importation de la classe Date
import java.time.LocalDate; // Importation de la classe LocalDate
import java.time.LocalTime; // Importation de la classe LocalTime
import java.time.LocalDateTime; // Importation de la classe LocalDateTime
import java.util.ArrayList; // Importation de la classe ArrayList
import java.util.List; // Importation de la classe List
import java.util.concurrent.atomic.AtomicInteger; // Importation de la classe AtomicInteger

public class AppliCabinetMedical {
    private static final AtomicInteger compteur = new AtomicInteger(0);

    // Méthode pour générer un identifiant unique de manière atomique
    private static int genererIdUnique() {
        return compteur.incrementAndGet();
    }

    public static void main(String[] args) {

        // ! Création d'objets nécessaires

        // ! Instanciation d'un objet Medecin
        Medecin medecin = new Medecin(1, "Dr. Dupont", "Jean", "Médecin généraliste", "123 Rue des Médecins", "0123456789", "dr.dupont@example.com");

        // Création d'un objet Date pour la date de naissance
        Date dateNaissance = new Date(); // initialiser la date de naissance selon vos besoins

        // ! Instanciation d'un objet Patient
        Patient patient = new Patient(1, "Dupont", "Alice", dateNaissance, "0123456789", "123 Rue des Patients");

        //? Création d'un objet LocalDate pour la date de la consultation
        LocalDate dateConsultation = LocalDate.now(); // initialiser la date de consultation selon vos besoins

        //? Création d'un objet LocalTime pour l'heure de la consultation
        LocalTime heureConsultation = LocalTime.now(); // initialiser l'heure de consultation selon vos besoins

        // ! Instanciation d'un objet Consultation
        new Consultation(dateConsultation, heureConsultation, "Fièvre", "Pas d'allergies connues", "Examen normal", "Grippe", null, null);

        //! Création d'une liste de médicaments pour l'ordonnance
        List<Medicament> medicaments = new ArrayList<>();

        // Données pour un médicament spécifique
        String nom = "Paracetamol";
        String dosage = "500 mg";

        // !Instanciation de l'objet Medicament avec les valeurs spécifiées
         new Medicament(nom, dosage);

        //! Instanciation d'un objet Ordonnance
        new Ordonnance(medicaments, "Prendre un comprimé par jour après le repas", 7, patient, dosage, medecin);
        // Création d'un objet Date pour la date du certificat médical
        Date dateCertificat = new Date(); // Vous devez initialiser la date du certificat selon vos besoins

        // !Instanciation d'un objet CertificatMedical
        new CertificatMedical(patient, "Arrêt de travail", dateCertificat, medecin);
        // Initialisation des constantes pour un patient spécifique
        int frequenceCardiaque = 75; // battements par minute
        float temperature = 37.0f; // degrés Celsius

        //! Instanciation d'un objet Constantes avec les valeurs correctes
        Constantes constantes = new Constantes("120/80 mmHg", frequenceCardiaque, temperature);

        // Données pour un patient spécifique
        float poids = 70.5f; // en kilogrammes
        float taille = 175.0f; // en centimètres
        String groupeSanguin = "AB+";

        // !Instanciation de l'objet Terrain avec les valeurs spécifiées
        Terrain terrain = new Terrain(poids, taille, groupeSanguin);

        // ! Créer un objet InformationsMedicales
        // Création d'une liste d'allergies
        List<String> allergies = new ArrayList<>();
        allergies.add("Allergie1");
        allergies.add("Allergie2");

        // Ajoutez d'autres allergies si nécessaire
         InformationsMedicales informationsMedicales = new InformationsMedicales("Antécédents médicaux du patient", "Antécédents chirurgicaux du patient", terrain, allergies, constantes, "Résumé des traitements médicaux du patient");

        //! Créer une liste de consultations
        List<Consultation> historiqueConsultations = new ArrayList<>();

        //! Instancier l'objet SuiviMedical
        SuiviMedical suiviMedical = new SuiviMedical(patient, informationsMedicales, historiqueConsultations);

        // Utiliser l'objet suiviMedical
        System.out.println("Nom du patient : " + suiviMedical.getPatient().getNom());
        System.out.println("Informations médicales : " + suiviMedical.getInformationsMedicales());
        System.out.println("Historique des consultations : " + suiviMedical.getHistoriqueConsultations());

        // Date et heure du rendez-vous
        LocalDateTime dateHeure = LocalDateTime.of(2024, 4, 6, 10, 30);

        // Motif du rendez-vous
        String motif = "Examen de routine";

        // Statut du rendez-vous
        String statut = "En attente";

        // Générer un identifiant unique pour le rendez-vous
        int id = genererIdUnique();

        //! Créer l'objet RendezVous en utilisant le constructeur
        new RendezVous(id, patient, dateHeure, motif, statut, medecin);
        //! Instancier l'objet dossier medical 
        new DossierMedical(patient, new ArrayList<>(), suiviMedical, new ArrayList<>(), new ArrayList<>());
    }
}