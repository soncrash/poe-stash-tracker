package poe.tools.request;

import java.util.Map;

public abstract class AbstractHttpRequest {
    private String URL;
    private Map<String, String> headers;

    public abstract String sendRequest();

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
