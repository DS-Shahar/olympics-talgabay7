public class Group {
	private String name;
	private Athlete[] athletes;
	
	public Group(String name,int len) {
		this.name = name;
		athletes=new Athlete[len];
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Athlete[] getAthletes() {
		return athletes;
	}
	public void setAthletes(Athlete[] athletes) {
		this.athletes = athletes;
	}
	
	public boolean addAthlete(Athlete a) {
		for(int i=0;i<athletes.length;i++) {
			if(athletes[i]==null) {
				athletes[i]=a;
				return true;
			}
		}
		return false;
	}
	public boolean deleteAthlete(String name) {
		for(int i=0;i<athletes.length;i++) {
			if(athletes[i].getName().equals(name)) {
				athletes[i]=null;
				return true;
			}
		}
		return false;
	}
	public String getBestAthleteName() {
		double max=0;
		String maxName="";
		for(int i=1;i<athletes.length;i++) {
			if(athletes[i].average()>max) {
				max=athletes[i].average();
				maxName=athletes[i].getName();
			}
		}
		return maxName;
	}
	public boolean addGrade(String name,String apparatus,double grade) {
		for(int i=0;i<athletes.length;i++) {
			if(athletes[i]!=null&&athletes[i].equals(name)) {
				return athletes[i].addGrade(apparatus, grade);
			}
		}
		return false;
	}
	
}
