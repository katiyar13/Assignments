
public class date implements Comparable<date>{

	int day;
	int month;
	int year;
	
	public date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(date o) {
		if (this.getDay() > o.getDay())
            return 1;
        else if (this.getDay() < o.getDay())
            return -1;
        else {
            if (this.getMonth() > o.getMonth())
                return 1;
            else if (this.getMonth() < o.getMonth())
                return -1;
            else {
                if (this.getYear() > o.getYear())
                    return 1;
                else if (this.getYear() < o.getYear())
                    return -1;
                else {
                    return 0;
                }
            }
        }
	}

	public String toString() {
        return "\nDate:" +
                "day:" + day +
                "\nmonth:" + month +
                "\nyear:" + year;
    }
	 public int GetDOB(date o) throws InvalidDOBException {
         if (this.getDay() > o.getDay())
             return 1;
         else if (this.getDay() < o.getDay())
             return -1;
         else {
             if (this.getMonth() > o.getMonth())
                 return 1;
             else if (this.getMonth() < o.getMonth())
                 return -1;
             else {
                 if (this.getYear() != o.getYear())
                     throw new InvalidDOBException("Invalid Date of Birth");
                 else {
                     return 0;
                 }
             }
         }
     }
}
class InvalidDOBException extends Exception {
    InvalidDOBException(String s) {
        super(s);
    }
}
