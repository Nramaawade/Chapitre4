 public  static void analyserLigneCSV(String ligne) {
        if (ligne == null) {
            System.out.println("Ligne invalide");
            return;
        }

        String[] champs = ligne.split(";");

      
        if (champs.length != 6) {
            System.out.println("Ligne invalide");
            return;
        }

        String date = champs[0];
        String reference = champs[1];
        String prenom = champs[2];
        String quartier = champs[3].toUpperCase(); 
        String typePaiement = champs[4];
        String montantStr = champs[5];

      
        System.out.println("--- Résumé de la Vente ---");
        System.out.println("Date         : " + date);
        System.out.println("Référence    : " + reference);
        System.out.println("Client(e)    : " + prenom);
        System.out.println("Quartier     : " + quartier);
        System.out.println("Paiement     : " + typePaiement);
        System.out.println("Montant      : " + montantStr + " FCFA");
    }
