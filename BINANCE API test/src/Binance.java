import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Binance {
    public static void main(String args[]) throws URISyntaxException, IOException, InterruptedException {


        HttpClient httpClient = HttpClient.newHttpClient();
        Gson gson = new Gson();
        Info info = new Info();
        GUI gui = new GUI();

        HttpResponse<String> getResponse;
        while (true) {
            String url = "https://api.binance.com/api/v3/ticker/price?symbol=BTCUSDT";
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .build();

            getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            info = gson.fromJson(getResponse.body(), Info.class);

            gui.setStats(info.getSymbol(),info.getPrice());

        }

    }
}
