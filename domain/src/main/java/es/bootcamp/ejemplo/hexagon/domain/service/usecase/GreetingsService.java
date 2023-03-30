package es.bootcamp.ejemplo.hexagon.domain.service.usecase;

import es.bootcamp.ejemplo.hexagon.domain.ports.application.RestPort;
import es.bootcamp.ejemplo.hexagon.domain.ports.infrastructure.DatabasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingsService implements RestPort {

    private final DatabasePort database;

    @Override
    public String getName(String name) {

        System.out.println("Domain: " + name);

        return database.getCustomerName(name);
    }

}
