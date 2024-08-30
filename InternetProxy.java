import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("www.youtube.com");
        bannedSites.add("www.facebook.com");
        bannedSites.add("www.twitter.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())) {
            System.out.println("Acesso negado ao site " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}
