

public class CambioPalabra {

    public char pal1[];
    public char pal2 [];
    char tabla_aux[];
    int contador;

    public CambioPalabra ( String u, String v){
        pal1 = u.toCharArray();
        pal2 = v.toCharArray();
        tabla_aux = new char[pal2.length];
        contador =0;
    }

    public int verificarPalabras ( char[] u, char[]v){

        if ( u.length == v.length){
            tabla_aux = cambiarLetras(u, v);
            return 1;
        }
        else{
            if (u.length<v.length){
                tabla_aux = agregarLetra (u,v);
                return 1;
            }
            else{
                if ( u.length> v.length){
                    tabla_aux= eliminarLetra (u, v);
                    return 1;
                }
            }
        }
        return 0;
    }

    public char[] cambiarLetras ( char [] u, char [] v){
        char aux[];
        aux = new char [v.length];
        for ( int i=0; i<u.length; i++){
            if ( u[i]==v[i]){
                aux[i]=u[i];
            }
            else{
                contador++;
                aux[i]= v[i];
            }
        }
        return aux;
    }
    /**
     * Este metodo calcula cuantas letra hay que eliminar y luego
     * cambiar para convertir A en B
     * @param A, es la palabra a modificar
     * @param B, es la palabra a la que hay que llegar
     * @return, retorna una cadena igual a v
     */
    public char[] eliminarLetra ( char[]u, char v[])
    {
        char aux[];
        int pos=0;
        aux= new char[v.length];
        for ( int i=0; i<u.length;i++)
        {
            if ( i >= pos)  {
                if ( pos<v.length) {
                    if ( u[i]== v[pos]) { 
                        aux[pos]= v[pos];
                        pos++;
                        u[i]='0';
                    }
                }
            }
        }
        contador = (u.length-v.length);
        aux = cambiarLetras(aux, v);
        return aux;
    }
    public char[] agregarLetra(char[]u, char[] v){
        char aux[], aux2[];
        aux = new char[v.length];
        int pos =0, cant=0;
        for (int i =0; i<u.length; i++){
            aux[i]= u[i];
        }
        aux2 = aux;
        for ( int j=0; j<v.length;j++){

            if ( aux[pos]==v[j]){
                aux[j]='0';
                aux2[pos]=v[pos];
                pos++;
            }
            else{
                cant++;
            }


        }
        if ( cant<(v.length-u.length)) {
            contador++;
        }
        else {

        }
        aux2 = cambiarLetras(aux2, v);
        return aux;
    }

    public char[] getPal1(){
        return pal1;
    }

    public char[] getPal2() {
        return pal2;
    }

    public int getContador() {
        return contador;
    }
}
