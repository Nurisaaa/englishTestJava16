package peaksoft.englishtestjava16.dto;
;

public class SimpleResponse {
    private String message;


    public SimpleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
