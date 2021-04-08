import java.util.ArrayList;

public class transaction {
trader tr;
int year;
int value;
public trader getTr() {
	return tr;
}
public void setTr(trader tr) {
	this.tr = tr;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public transaction(trader tr, int year, int value) {
	super();
	this.tr = tr;
	this.year = year;
	this.value = value;
}
public String toString() {
	return "\nTransaction:"+""+tr+"\nyear:"+year+"\nvalue:"+value;
}}
