package part1_basicclasses;

import java.util.StringTokenizer;

public class Course {
	private static int seqNum = 100;
	public static final String[] DOMAINS = { "Fashion", "Computer Science", 
												"Language", "Mathematics", "Management"};
	
	private int courseId;
	private String title;
	private int domain;
	private int teacherId;
	
	public Course(String title, int domain, int teacherId) {
		super();
		this.title = title;
		this.domain = domain;
		this.teacherId = teacherId;
		this.courseId = seqNum;
		seqNum += 100;
	}

	public Course(String title, int teacherId) {
		super();
		this.title = title;
		this.domain = 1;
		this.teacherId = teacherId;
		this.courseId = seqNum;
		seqNum += 100;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDomain() {
		return domain;
	}

	public void setDomain(int domain) {
		this.domain = domain;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		StringTokenizer st = new StringTokenizer(title);
        StringBuilder sb = new StringBuilder("");
        while(st.hasMoreTokens()) {
            //getting one word
            String stWord = st.nextToken();
            //capitalizing the first letter of the word
            stWord = stWord.substring(0, 1).toUpperCase() + stWord.substring(1);
            //appending the word to string builder
            sb.append(stWord);
            sb.append(" ");
        }
		return "CourseId : " + courseId + "\tTitle : " + sb.toString()
				+ "\tDomain : " + DOMAINS[domain] + "\tTeacherId : " + teacherId;
	}
	
	
	
}
