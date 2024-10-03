public class Main 
{
    
    public static void main(String[] args) {
        String mySchool = "WHS";
        int myGrade = 11;
        double myGPA = 4.67;
        boolean isGoingHoco = false;    

        System.out.println(lastFirstN("Danny", "Justin", 3));
        stringManip("justin", "dANNY");
    }

    public static String lastFirstN(String s1, String s2, int n)
    {
        String newS1 = new String(s1);
        String newS2 = new String(s2);
    
        s1 = newS1.substring(newS1.length()-n);
        s2 = newS2.substring(0,n);
        return s1 + s2;
    }

    public static void stringManip(String a, String b)
    {
        a = a.toUpperCase();
        String b1 = b.substring(0,1);
        String b2 = b.substring(1);
        b1 = b1.toUpperCase();   
        b2 = b2.toLowerCase();

        System.out.println(a);
        System.out.println(b1+b2);
    
    }
}


