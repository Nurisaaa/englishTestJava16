package peaksoft.englishtestjava16.dto;

import java.util.List;

public class QuestionRequest {
    private Long testId;
    private String title;
    private int duration;
    private List<OptionRequest> optionRequests;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<OptionRequest> getOptionRequests() {
        return optionRequests;
    }

    public void setOptionRequests(List<OptionRequest> optionRequests) {
        this.optionRequests = optionRequests;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }
}
