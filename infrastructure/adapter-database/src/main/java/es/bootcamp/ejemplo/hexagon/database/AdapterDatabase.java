package es.bootcamp.ejemplo.hexagon.database;

import es.bootcamp.ejemplo.hexagon.domain.ports.application.RestPort;
import es.bootcamp.ejemplo.hexagon.domain.ports.infrastructure.DatabasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdapterDatabase implements DatabasePort {

    @Override
    public String getCustomerName(String name) {

        System.out.println("Database: " + name);

        StringBuilder sb = new StringBuilder(name);

        return sb.reverse().toString();

    }
}



