package solution2;

public class Question {
private int id;
private String question;
private String answers;
protected Question(int id, String question, String answers) {
	super();
	this.id = id;
	this.question = question;
	this.answers = answers;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswers() {
	return answers;
}
public void setAnswers(String answers) {
	this.answers = answers;
}
public String toString() {
    return "Question:" +
            "ID= " + id +
            " question= " + question +
            " answers=" + answers;
}
}