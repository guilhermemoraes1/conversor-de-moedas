import Records.Cotacao;
import com.google.gson.Gson;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Cotacao mostrarJson() {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/0b0ec803f24d7d37b1069bd2/latest/USD";

        try {
            // Making Request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();

            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // System.out.println(response.body());
            return new Gson().fromJson(response.body(), Cotacao.class);
        } catch (Exception e ) {
            throw new RuntimeException("Algum erro ocorreu na API.");
        }

    }
}
