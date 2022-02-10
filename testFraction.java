public class testFraction{

    public static void main(String[] args)
    {
        Rational r1 =new Rational(3,2);      
        System.out.println(r1.toString());

        Rational r3 =new Rational(4,3);
        System.out.println(r3.toString()); 

        r1.mult(r3);                          /* Test de la multiplication */
        System.out.println(r1.toString());

        r1.addition(r3);                      /* Test de l'addition */
        System.out.println(r1.toString());

        
        Rational r2 =new Rational(2,0);    /*Test avec le dénominateur nul*/
        System.out.println(r2.toString());

       

    }
    }