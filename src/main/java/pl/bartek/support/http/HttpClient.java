package pl.bartek.support.http;

import java.util.Map;

public interface HttpClient {
    Response post(String url, Map<String, String> params);
}
