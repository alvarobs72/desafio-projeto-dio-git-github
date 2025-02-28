public class Usuario {

    public static void main (String[] args) throws Exception {
        Television tv = new Television();
        tv.definirCanal(54);
        tv.definirVolume(30);
        tv.ligar();
        tv.diminuirCanal();
        tv.diminuirVolume();
        tv.status();
    }
}
