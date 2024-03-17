package TPs.CI1;

import java.util.List;
import java.util.ArrayList;

import TPs.Exceptions.MonExceptionAMoiException;
//import TPs.Exceptions.MissingIntegerException;
import TPs.Exceptions.*;


public class IntegerCollection {

    private List<Integer> liste;

    /**
     * @effects crée une nouvelle IntegerCollection contenant dans l'ordre 1,2,3,4,5,6
     */
    public IntegerCollection() {
        liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
    }

    /**
     * @requires valeur de i != null
     * @return l'index de i s'il est présent dans la collection
     * @throws MissingIntegerException si i n'est pas présent dans la collection
     * 
     */
    public int searchInt(Integer i) throws MissingIntegerException{
     
    if (liste.indexOf(i)==-1)
    {
        throw new MissingIntegerException ("MissingIntegerException"); 
    }
    else return liste.indexOf(i);
}
        /* Cette implémentation actuelle retourne -1 si l'élément est manquant.
         * Todo Modifiez l'implémentation afin de retourner soit l'index de i soit MissingIntegerException.
         */

    

    // Pas besoin de spécifier expliqué en cours théorique
    @Override
    public String toString() {
        return "Collection : " + liste;
    }

    /**
     * ToDo
     */
    private void exceptionGenerator(){
        throw new NullPointerException();
        /*
         * Pourquoi l'appel à cette méthode exceptionGenerator ne pose pas de souci au compilateur?
         * Réponse : NullPoinyrtException est une exception non vérifiée par le compilateur par définition
         * Il semblerait que ce soit voulu et didactique! ToDo Effectuez les spécifications en suivant les recommendations
         * vues aux cours de CPOO.
         */

    }

    /**
     * @throws MonExceptionAMoiException
     */
    public void captureEtRelance()throws MonExceptionAMoiException{

        try {exceptionGenerator();}
        catch (NullPointerException e){
            throw new MonExceptionAMoiException();

        }
        /* Todo Capturez l'exception lancée lors de l'appel à exceptionGenerator et lancez une nouvelle exception
         * non-vérifiée MonExceptionAMoiException.
         */
    }
}