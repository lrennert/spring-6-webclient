package guru.springframework.spring6webclient.client;

import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Flux;

import java.util.Map;

public interface BeerClient {

    Flux<String> getBeers();

    Flux<Map> getBeerMaps();

    Flux<JsonNode> getBeerJsonNodes();
}
