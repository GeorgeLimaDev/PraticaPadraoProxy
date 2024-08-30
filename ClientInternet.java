public class ClientInternet {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        try {
            // Tentativas de conexão a sites permitidos
            internet.connectTo("www.ifpb.edu.br");
            internet.connectTo("www.google.com");
            internet.connectTo("www.wikipedia.org");

            // Tentativas de conexão a sites bloqueados
            internet.connectTo("www.youtube.com");
            internet.connectTo("www.facebook.com");
            internet.connectTo("www.twitter.com");

            // Tentativa de conexão a um site que não está na lista (não bloqueado)
            internet.connectTo("www.github.com");

            // Tentativa de conexão a um site bloqueado com letras maiúsculas
            internet.connectTo("WWW.YOUTUBE.COM");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
