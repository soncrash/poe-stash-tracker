package poe.tools.main;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import poe.tools.model.Item;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String personalStashURL = "https://www.pathofexile.com/character-window/get-stash-items?accountName=FIREDFOR&tabIndex=5&league=STANDARD&tabs=1&fbclid=IwAR3CAzywZJvgCgfh49emkWO8Zqvy-SeP0U2V5pR6qNIMn1CegbihX-zNJp8";
        final String cookieValue = "POESESSID=d648dcad1bd6f0c045637a6defaa39a8";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(personalStashURL);
        request.addHeader("Referer", "https://www.pathofexile.com");
        request.addHeader("Cookie", cookieValue);
        HttpResponse response = client.execute(request);

        HttpEntity httpEntity = response.getEntity();
        String apiOutput = EntityUtils.toString(httpEntity);

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readValue(apiOutput.getBytes(), JsonNode.class);
        JsonNode items = rootNode.get("items");

        List<Item> itmList = new ArrayList<>();
        for (JsonNode jsonNode : items) {
            String item = jsonNode.toString();
            Item itemToAdd = mapper.readValue(item, Item.class);
            itmList.add(itemToAdd);
        }
        //items.forEach(i -> i.toString());
        int i = 0;

        while(items.get(i) != null) {
            Item itemToAdd = mapper.readValue(items.get(i).toString(), Item.class);
            itmList.add(itemToAdd);
            i++;
        }

    }

    //Frame type 0 = normal
    //Frame type 1 = blue
    //Frame type 2 = rare
    //Frame type 3 = unique
    //Frame type 4 = gem
    //Frame type 5 = currency
    //Frame type 6 = divination card
    //Frame type 7 = quest item
    //Frame type 8 = prophecy
    //Frame type 9 = relic


}
