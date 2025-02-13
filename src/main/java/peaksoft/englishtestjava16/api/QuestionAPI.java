package peaksoft.englishtestjava16.api;

import org.springframework.web.bind.annotation.*;
import peaksoft.englishtestjava16.dto.QuestionRequest;
import peaksoft.englishtestjava16.dto.SimpleResponse;
import peaksoft.englishtestjava16.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
public class QuestionAPI {
    private final QuestionService questionService;

    public QuestionAPI(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public SimpleResponse addNewQuestion(@RequestBody QuestionRequest questionRequest) {
        return questionService.addNewQuestion(questionRequest);
    }
}
