package pl.bartek.przelewy24;

import java.util.HashMap;
import java.util.Map;

import pl.bartek.support.http.HttpClient;
import pl.bartek.support.http.Response;

public class Przelewy24Api {
    private static final String TEST_CONNECTION_URL = "https://secure.przelewy24.pl/testConnection";
    private HttpClient httpClient;

    public Przelewy24Api(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void testConnection() {
        Map<String, String> params = new HashMap<>(3);
//        params.put("p24_merchant_id", );
//        params.put("p24_pos_id", );
//        params.put("p24_sign", ); // TODO end test connection, response should be message: 200

        Response response = httpClient.post(TEST_CONNECTION_URL, params);
    }

    public static String calculateMD5(String s) {
        return null;
    }
}
