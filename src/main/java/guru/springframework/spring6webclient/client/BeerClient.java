package guru.springframework.spring6webclient.client;

import reactor.core.publisher.Flux;

import java.util.Map;

public interface BeerClient {

    Flux<String> getBeers();

    Flux<Map> getBeerMaps();
}
