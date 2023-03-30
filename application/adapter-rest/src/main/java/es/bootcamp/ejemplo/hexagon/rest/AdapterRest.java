package es.bootcamp.ejemplo.hexagon.rest;

import es.bootcamp.ejemplo.hexagon.domain.ports.application.RestPort;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AdapterRest {

    private final RestPort rest;

    @GetMapping("/greetings/{name}")
    public String getName(@PathVariable String name) {

        System.out.println("Rest: " + name);

        return rest.getName(name);
    }
}



