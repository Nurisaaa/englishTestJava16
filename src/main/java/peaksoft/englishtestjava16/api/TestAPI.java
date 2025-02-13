package peaksoft.englishtestjava16.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.englishtestjava16.dto.NewTestRequest;
import peaksoft.englishtestjava16.dto.SimpleResponse;
import peaksoft.englishtestjava16.service.TestService;

@RestController
@RequestMapping("/api/tests")
public class TestAPI {

    private final TestService testService;

    public TestAPI(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public SimpleResponse addTest(@RequestBody NewTestRequest newTestRequest){
        return testService.addTest(newTestRequest);
    }
}
