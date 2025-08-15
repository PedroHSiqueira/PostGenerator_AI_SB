package dev.siqueira.articlesummary_ai.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import dev.siqueira.articlesummary_ai.model.RequestDTO;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    public String generatePost(RequestDTO requestDTO){
        Client client = new Client();

        String prompt = String.format("""
        Você é um especialista em marketing de conteúdo e comunicação profissional. Sua tarefa é criar um post altamente envolvente e persuasivo para o LinkedIn, focado em gerar autoridade, conexão e engajamento com profissionais da área %s.
        Tema: %s
        
        O post deve seguir estas diretrizes:
        1. **Tom e Estilo**: Profissional, inspirador e autêntico, transmitindo credibilidade e proximidade.
        2. **Estrutura**:
           - **Abertura forte**: Comece com uma frase impactante, pergunta provocativa ou dado relevante.
           - **Desenvolvimento**: Conte uma breve história, insight ou aprendizado pessoal/profissional, conectando com um desafio comum na área.
           - **Valor**: Inclua dicas, reflexões ou lições aplicáveis.
           - **Encerramento**: Termine com uma chamada para ação (pergunta ou incentivo ao comentário/compartilhamento).
        3. **Boas práticas para LinkedIn**:
           - Evite parágrafos longos; use quebras de linha.
           - Inclua de 3 a 5 hashtags estratégicas e relevantes.
           - Mantenha o texto entre 600 e 1200 caracteres.
        4. **Objetivo**:
           - Mostrar autoridade no assunto.
           - Estimular comentários e conversas.
           - Transmitir autenticidade e confiança.
        """, requestDTO.type(), requestDTO.topic());

        GenerateContentResponse response = client.models.generateContent(
                "gemini-2.5-flash",
                prompt,
                null
        );

        return response.text();
    }
}
