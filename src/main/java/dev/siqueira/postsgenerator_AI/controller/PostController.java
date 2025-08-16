package dev.siqueira.postsgenerator_AI.controller;

import dev.siqueira.postsgenerator_AI.model.RequestDTO;
import dev.siqueira.postsgenerator_AI.service.GeminiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final GeminiService geminiService;

    public PostController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping
    public ResponseEntity<String> generatePost(@RequestBody RequestDTO requestDTO){
        String response = geminiService.generatePost(requestDTO);
        if (!response.isEmpty() || response != null){
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocorreu um Problema com a solicitação!");
    }
}
