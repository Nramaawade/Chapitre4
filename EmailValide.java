public class EmailValide {


    
    
    public static boolean estEmailValide(String email) {
        
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email != null && email.matches(regex);
    }

    public static boolean estReferenceValide(String ref) {
        
        String regex = "^PRD-\\d{3}$";
        return ref != null && ref.matches(regex);
    }


}

 
