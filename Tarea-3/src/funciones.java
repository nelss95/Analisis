/**
 * Created by Nelson on 11/10/2014.
 */
public class funciones {
    public void moverMisioneroBoteDerecha (int [] derecha, int [] izquierda) {
                derecha[0] --;
                derecha[2] ++;

    }

    public void moverMisioneroalBoteDerecha (int [] derecha, int [] izquierda) {
        derecha[0] --;
        derecha[2] ++;

    }

    public void moverCanivalalBoteDerecha (int [] derecha, int [] izquierda) {
        derecha[1] --;
        derecha[2] ++;

    }

    public void moverCanivalaTierraIzquirda (int [] derecha, int [] izquierda) {
        izquierda[1] ++;
        if (izquierda[2] >0 ) {
            izquierda[2] --;

        }

        derecha[2] --;
    }


    public void moverMisioneroaTierraIzquirda (int [] derecha, int [] izquierda) {
        izquierda[0] ++;
        if (izquierda[2] >0 ) {
            izquierda[2] --;
        }
        derecha[2] --;
    }

}
