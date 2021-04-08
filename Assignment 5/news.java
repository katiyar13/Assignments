
public class news {
int newsid;
String postedbyuser;
String commentbyuser;
String comment;
public news(int newsid, String postedbyuser, String commentbyuser, String comment) {
	super();
	this.newsid = newsid;
	this.postedbyuser = postedbyuser;
	this.commentbyuser = commentbyuser;
	this.comment = comment;
}
public int getNewsid() {
	return newsid;
}
public void setNewsid(int newsid) {
	this.newsid = newsid;
}
public String getPostedbyuser() {
	return postedbyuser;
}
public void setPostedbyuser(String postedbyuser) {
	this.postedbyuser = postedbyuser;
}
public String getCommentbyuser() {
	return commentbyuser;
}
public void setCommentbyuser(String commentbyuser) {
	this.commentbyuser = commentbyuser;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String toString() {
	return "News:"+"\nnewsid:"+newsid+"\npostedByUser:"
              +postedbyuser+"\ncommentByUser:"+commentbyuser+"\ncomment:"+comment;
}
}
