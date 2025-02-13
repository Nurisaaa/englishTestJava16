package peaksoft.englishtestjava16.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import peaksoft.englishtestjava16.dto.OptionRequest;
import peaksoft.englishtestjava16.dto.QuestionRequest;
import peaksoft.englishtestjava16.dto.SimpleResponse;
import peaksoft.englishtestjava16.entities.Option;
import peaksoft.englishtestjava16.entities.Question;
import peaksoft.englishtestjava16.entities.Test;
import peaksoft.englishtestjava16.repositories.QuestionRepository;
import peaksoft.englishtestjava16.repositories.TestRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final TestRepository testRepository;

    public QuestionService(QuestionRepository questionRepository, TestRepository testRepository) {
        this.questionRepository = questionRepository;
        this.testRepository = testRepository;
    }

    @Transactional
    public SimpleResponse addNewQuestion(QuestionRequest questionRequest) {
        Question question = new Question();
        question.setTitle(questionRequest.getTitle());
        question.setDuration(question.getDuration());
        List<Option> options = new ArrayList<>();
        for (OptionRequest optionRequest: questionRequest.getOptionRequests()){
            options.add(new Option(optionRequest.getTitle(),optionRequest.isTrue()));
        }
        question.setOptions(options);
        Test test = testRepository.findById(questionRequest.getTestId()).orElseThrow(
                () -> new RuntimeException("Question with id " + questionRequest.getTestId() + " does not exist")
        );
        List<Question> questions = new ArrayList<>();
        questions.add(question);
        test.setQuestions(questions);
        questionRepository.save(question);
        return new SimpleResponse("Question added successfully");
    }
}
