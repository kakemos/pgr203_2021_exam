package no.kristiania.answer;

public class Answer {

    private long answer_id;
    private long question_id;
    private long person_id;
    private int response;

    public long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(long answer_id) {
        this.answer_id = answer_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}