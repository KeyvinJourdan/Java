
package praktikum9_keyvinjourdan;


public class Praktikum9_KeyvinJourdan {
//        public String atributBukanStatic = "Atribut Bukan Static";
//        static String atributStatic = "Atribut Static";
//        
//        public void bukanStatic(){
//            System.out.println("Bukan Static");
//        }
//        
//        static void methodStatic(){
//            System.out.println("Method Static");
//        }
    static class tabung{
        private static final double pi = Math.PI;

        public static double Volume(double r, double t){
            return pi * r*r*t;
        }

        public static double LuasPermukaan(double r, double t){
            return (2*pi*r*(r+t));
        }
    }

        
    public static void main(String[] args) {
//        Praktikum9_KeyvinJourdan praktikum = new Praktikum9_KeyvinJourdan();
//        
//        System.out.println(praktikum.atributBukanStatic);
//        System.out.println(atributStatic);
//        
//        praktikum.bukanStatic();
//        methodStatic();
        double r = 13;
        double t = 30;
        double vol = tabung.Volume(r,t);
        double lp = tabung.LuasPermukaan(r, t);
        
        
        System.out.println(vol);
        System.out.println(lp);
    }
    
}
