package guru.springframework.springairag.services;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceTest {

    @Autowired
    private OpenAIService openAIService;

    @Test
    void getAnswer() {
        // Given
        Question question = new Question("What is the capital of France?");

        // When
        Answer answer = openAIService.getAnswer(question);

        // Then
        assertNotNull(answer);
        assertThat(answer.answer()).contains("Paris");
    }
}