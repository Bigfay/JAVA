package TPs.AbsProcedurale;

/**
 * @Overview classe mettant à disposition différents outils pour valeurs entières
 */
public class Num
{
    /*
     * @requires (PRE) condition
     * @modifies les éléments modifiés (POST)
     * @effects quelles sont les modifications sur ces éléments (POST)
     * @return indique ce qui sera retourné (POST)
     * @throws exception jetée et cas de figure (POST)
     * /!\  SI PRE ALORS POST  /!\
     */

    /**
     * @requires n > 0 et d > 0
     * @return le PGCD de n et d
     */
    public static int pgcd(int n, int d){
        if (d <= 0 || n <= 0) return n;
        else return  pgcd(d,n % d);
    }

    /**
     * @requires a not null et a.size > 0
     * @return la valeur entière la plus grande du tableau
     */
    public static int greatest (int[] a){
        int max= a[0];
        for(int i=0; i<a.length; i++){
            if (max < a[i]){
                max=a[i];
            }
        }
        return max;
    }

    /**
     * @requires a not null
     * @return la somme des éléments de a
     */
    public static int sum (int[] a){
        int total=0;
        for(int i=0; i<a.length; i++){
            total=total+a[i];
        }
        return total;
    }

    /**
     * @return true si p est pair; false sinon
     */
    public static boolean isEven (int p){
        if(p%2==0)return true;
        return false;
    }

    /**
     * @return true si p est un nombre premier; false sinon
     */
    public static boolean isPrime (int p){
        if(p<=1)return false;
        for(int i = 2; i*i<=p;i++){
            if (p%i == 0) return false;
            i++;
        }
        return true;
    }

    /**
     * @requires a et b non null
     * @modifies a
     * @effects chaque élément de a est multiplié par la somme
     * des éléments de b
     */
    public static void combine(int[] a, int[] b){
        int sum=sum(b);
        for(int i=0; i<a.length; i++){
            a[i]=sum * a[i];
        }
    }

    /**
     *
     * @requires a est trié par ordre croissant
     * @return l'indice d'une occurence de x dans a,
     * si x est présent dans a; sinon -1
     */
    public static int search(int[] a, int x){
        if(a == null) return -1;
        for(int i=0; i<a.length; i++){
            if(a[i]==x) return i;
        }
        return -1;
    }

}
