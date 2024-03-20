public class Athlete {
	private String name;
	private Grade[] grades;
	private int count;
	
	public Athlete(String name, int count) {
		this.name = name;
		this.count = count;
		this.grades=new Grade[count];
	}
	
	public Athlete(Athlete a) {
		this.name=a.name;
		this.count=a.count;
		this.grades=new Grade[a.count];
		for(int i=0;i<a.count;i++) {
			if(a.grades[i]!=null)
				this.grades[i]=a.grades[i];
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade[] getGrades() {
		return grades;
	}
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public boolean addGrade(String name,double grade) {
		Grade newGrade=new Grade(name,grade);
		boolean flag=false;
		for(int i=0;i<grades.length&&!flag;i++) {
			if(grades[i]==null) {
				grades[i]=newGrade;
				flag=true;
			}
		}
		return flag;
	}
	public boolean deleteGrade(String name) {
		boolean flag=false;
		for(int i=0;i<grades.length&&!flag;i++) {
			if(grades[i].getApparatus().equals(name)) {
				grades[i]=null;
				flag=true;
			}
		}
		return flag;
	}
	public double average() {
		double sum=0;
		int countG=0;
		for(int i=0;i<grades.length;i++) {
			if(grades[i]!=null) {
				sum+=grades[i].getScore();
				countG++;
			}
		}
		if(sum==0)
			return -1;
		return sum/countG;
	}
	public boolean allGradesAbove(double grade) {
		for(int i=0;i<grades.length;i++) {
			if(grades[i]!=null&&grades[i].getScore()<=grade)
				return false;
		}
		return true;
	}
	public boolean isBetter(Athlete a) {
		for(int i=0;i<grades.length;i++) {
			for(int j=0;j<a.grades.length;j++) {
				if(grades[i]!=null&&a.grades[j]!=null) {
					if(grades[i].getApparatus().equals(a.grades[j].getApparatus())&&grades[i].getScore()<=a.grades[j].getScore())
						return false;
				}
			}
		}
		return true;
	}

	public String toString() {
		return "Athlete [name=" + name + ", grades=" + Arrays.toString(grades) + ", count=" + count + "]";
	}
	
}
