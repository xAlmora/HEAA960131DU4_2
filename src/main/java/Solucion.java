public class Solucion {
    public static boolean solucion(String initialString){
        String aux = "";
        for(int i=0;i<initialString.length()/2;i++){
            String subString = initialString.substring(0,i);
            aux = initialString.replaceAll(subString,"");
            if(aux.equals("")){
                System.out.println(subString);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solucion("gustavogustavogustavo"));
        System.out.println(solucion("1231231231231234"));
    }
}
