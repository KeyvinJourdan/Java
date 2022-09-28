package keyvinjourdan_praktikum5;


public class KeyvinJourdan_Praktikum5 {

//STRING
    public static void main(String[] args) {
        String firstname = "Keyvin";
        String lastname  = "Jourdan";
        
        System.out.println(firstname);
        System.out.println(lastname);
        
        String fullname = "Keyvin" + " " + "Jourdan";
        System.out.println(fullname);
        
        String fullname2 = firstname + " " + lastname;
        System.out.println(fullname2);
        
        String upper = fullname.toUpperCase();
        String lower = fullname.toLowerCase();
        
        System.out.println(upper);
        System.out.println(lower);
        
        //SUBSTRING
        System.out.println(fullname.length());
        System.out.println(fullname.substring(3,10));
        System.out.println(firstname.substring(0,4)); 
    }
    
}
