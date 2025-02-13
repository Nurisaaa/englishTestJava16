package peaksoft.englishtestjava16.service;

import org.springframework.stereotype.Service;
import peaksoft.englishtestjava16.dto.NewTestRequest;
import peaksoft.englishtestjava16.dto.SimpleResponse;
import peaksoft.englishtestjava16.entities.Test;
import peaksoft.englishtestjava16.repositories.TestRepository;


@Service
public class TestService {
    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public SimpleResponse addTest(NewTestRequest newTestRequest) {
        Test test = new Test();
        test.setActive(true);
        test.setTitle(newTestRequest.getTitle());
        test.setShortDescription(newTestRequest.getDescription());
        testRepository.save(test);
        return new SimpleResponse("Test added successfully");
    }

}
