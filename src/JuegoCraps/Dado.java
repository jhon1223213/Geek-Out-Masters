package JuegoCraps;

/**
 * Class Dado genera un valor Ramdon entre 1 y 6
 * @author Juan felipe palechor - 2270963
 * @version
 *
 */


import java.util.Random;

public class Dado {

    private int cara;

    /**
     * Metodo que genera un valor ramdom aleatorio
     * @return # entre (1,6)
     */
    public int getCara() {
        Random aleatorio =new Random();
        cara = aleatorio.nextInt()+1;
        return cara;
    }
}
