public class Studentdetails{
 
	private int id;
	private String fname,lname,gender,branch,dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "id="+id+"\nname="+fname +"\nlast name="+lname+"\nGender="+gender+"\nbranch="+branch+"\ndept="+dept;
}
}	

		
	



