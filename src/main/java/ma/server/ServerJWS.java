package ma.server;

import jakarta.xml.ws.Endpoint;
import ma.service.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/BanqueWS";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployé à l'adresse : " + url);
    }
}
