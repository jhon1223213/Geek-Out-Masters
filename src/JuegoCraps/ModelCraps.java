package JuegoCraps;


/**
 * Esta clase ModelCraps aplica las reglas de los dados
 * Estado 1: GANO
 * Estado 2: PERDIO
 * Estado 3: PUNTO
 * Estado 4: PUNTO GANADOR
 * Estado 5: PUNTO PERDEDOR
 * @author Juan felipe palechor - 2270963
 * @version
 *
 */



public class ModelCraps {
    private Dado dado1,dado2;

    private int tiro,punto,estado,flag;
    private String estadoToString;
    private int [] caras;

    /**
     * CLASS CONSTRUCTOR
     */

    public ModelCraps(){

        dado1 =new Dado();
        dado2 =new Dado();
        caras = new int[2];
        flag=0;

    }

    /**
     * ESTABLECE EL VALOR DEL TIRO DEACUERDO AL VALOR DE CADA DADO
     */

    public void calculartiro(){

        caras[0]=dado1.getCara();
        caras[1]=dado2.getCara();
        tiro = caras[0]+caras[1];

    }

    /**
     * Establece el estado del juego
     */

    public void determinarJuego(){
        if (flag==0){
            if(tiro==7 || tiro == 11){
                estado = 1; //gano
            }else {
                if(tiro==3 || tiro ==2 || tiro==12){
                    estado=2; //perdio
                }else{
                    estado=3; //establece punto
                    punto=tiro;
                    flag=1;
                }
            }
        }else {
            //ronda punto
            rondaPunto();
        }
    }

    /**
     * Establece el estado del juego DEACUERDO AL VALOR DE CADA DADO
     *
     */

    private void rondaPunto() {
        if(tiro==punto){
            estado=4;
            flag=0;
        }if (tiro==7){
            estado=5;
            flag=0;

        }
    }

    public int getTiro() {
        return tiro;
    }

    public int getPunto() {
        return punto;
    }

    /**
     * RETORNA EL MENSAJE DEACUERDO AL VALOR
     *
     */

    public String getEstadoToString() {
        switch(estado){
            case 1: estadoToString="GANASTE GAY";
                    break;
            case 2: estadoToString="PERDIO TONTA";
                break;
            case 3: estadoToString="PUNTO"+punto+"SIGUE!!" +
                    "\n SACAS 7 ANTES QUE"+punto+"PIERDE OJO!!";
                break;
            case 4: estadoToString="VOLVIO A SACAR"+punto+"GANO BUENA ESA";
                break;
            case 5: estadoToString="SACASTE 7"+punto+"PERDIOOOOO";
                break;

        }
        return estadoToString;
    }

    public int[] getCaras() {
        return caras;
    }




}

















