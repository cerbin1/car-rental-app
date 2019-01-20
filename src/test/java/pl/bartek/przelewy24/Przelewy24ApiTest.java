package pl.bartek.przelewy24;

/* import org.junit.Assert;
import org.junit.Test;
import pl.bartek.support.http.HttpClient;
import pl.bartek.support.http.Response;

import java.util.List;
import java.util.Map;
*/

public class Przelewy24ApiTest {
  /* private SpyHttpClient httpClient = new SpyHttpClient();
    private String merchantId;
    private String posId;

    @Test
    public void shouldTestConnection() {
        // given
        Przelewy24Api api = thereIsPrzelewy24ApiConfigured();

        // when
        api.testConnection();

        // then
        Assert.assertEquals("https://secure.przelewy24.pl/testConnection", httpClient.lastUrl);
        Assert.assertTrue(httpClient.lastParams.containsKey("p24_merchant_id"));
        Assert.assertTrue(httpClient.lastParams.containsKey("p24_pos_id"));
        Assert.assertTrue(httpClient.lastParams.containsKey("p24_sign"));
        Assert.assertEquals(httpClient.lastParams.get("p24_merchant_id"), merchantId);
        Assert.assertEquals(httpClient.lastParams.get("p24_pos_id"), posId);
        Assert.assertEquals(httpClient.lastParams.get("p24_sign"), "MD5_HASH");
    }

    private String generateP24MD5(List<String> strings) {
        return strings
                .stream()
                .reduce((s, a) -> s + "|" + a)
                .map(Przelewy24Api::calculateMD5)
                .orElse("other");
    }

    private static String calculateMD5(String input) {
        return null;
    }

    private Przelewy24Api thereIsPrzelewy24ApiConfigured() {
        return new Przelewy24Api(httpClient);
    }

    private class SpyHttpClient implements HttpClient {
        public String lastUrl;
        public Map<String, String> lastParams;

        @Override
        public Response post(String url, Map<String, String> params) {
            lastUrl = url;
            lastParams = params;

            return new Response(); // TODO: return code 200
        }
    }

    @Test
    public void shouldRegisterTransaction() {
        // given


        // when


        // then

    }*/
}