package com.quane.kayakapplication;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(path = "/kayaks")
@AllArgsConstructor
public class KayakController {

    private final KayakRepository kayakRepository;

    @PostMapping()
    public @ResponseBody Mono<Kayak> addKayak(@RequestBody Kayak kayak) {
        return kayakRepository.save(kayak);
    }

    @GetMapping()
    public @ResponseBody Flux<Kayak> getAllKayaks() {
        Flux<Kayak> result = kayakRepository.findAll();
        return result;
    }
}
