package part1_basicclasses;

import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Person {
	protected int id;
	protected String name;
	protected String phone;
	protected String email;
	protected ArrayList<Integer> evaluations;
	
	public Person(int id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.evaluations = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Integer> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(ArrayList<Integer> evaluations) {
		this.evaluations = evaluations;
	}

	@Override
	public String toString() {
		return "Id : " + id + "\tName : " + name + "\tPhone : " 
						+ phone + "\tEmail : " + email 
						+ "\tNb Evaluations: " + evaluations.size();
	}

	@Override
	public boolean equals(Object obj) {
		Person otherP = (Person) obj;
		return id == otherP.id;
	}

	public abstract ArrayList<Integer> returnDomain();
	public abstract void evaluate(Person person, int grade);
	
	public double avgEvaluation() {
		double averageE = 0;
		for(int one : evaluations)
			averageE += (double)one;
		averageE /= (double)evaluations.size();
		
		//Rounding the average to 2 decimals
		averageE = ((double)Math.round( averageE * 100)) / 100;
		
		return averageE;
	}
}
