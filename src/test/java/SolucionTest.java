import static org.junit.Assert.*;

public class SolucionTest {

    @org.junit.Test
    public void solucion() {
        for(int i=2;i<100;i++){
            assertEquals(Solucion.solucion(generadoraDeRepetitivos(i,"testing")),true);
            assertEquals(Solucion.solucion(semiRepetitivos(i,"testing")),false);
            assertEquals(Solucion.solucion(noRepetitivos(i)),false);

        }
    }

    public String generadoraDeRepetitivos(int repeticiones, String pattern){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<repeticiones; i++){
            sb.append(pattern);
        }
        return sb.toString();
    }
    //tiene un char que hace imposible que se pueda generar
    public String semiRepetitivos(int longitud, String pattern) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            sb.append(pattern);
            if (i == longitud / 2) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
    public String noRepetitivos(int longitud){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<longitud; i++){
            sb.append(i);
        }
        return sb.toString();
    }

}