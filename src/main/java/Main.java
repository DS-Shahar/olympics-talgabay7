class Main {
 public static void main(String[] args) {
		Athlete a1=new Athlete("artium", 4);
		Athlete a2=new Athlete("linoi", 3);
		System.out.println(a1.addGrade("paralles", 25.3));
		a1.addGrade("horse", 23.9);
		a1.addGrade("rings", 25.7);
		a2.addGrade("paralles", 25.2);
		a2.addGrade("horse", 25.1);
		a2.addGrade("freestyle", 24.7);
		for(int i=0;i<a1.getGrades().length;i++) 
			System.out.println(a1.getGrades()[i]);
		for(int i=0;i<a2.getGrades().length;i++) 
			System.out.println(a2.getGrades()[i]);
		System.out.println(a2.deleteGrade("horse"));
		for(int i=0;i<a2.getGrades().length;i++) 
			System.out.println(a2.getGrades()[i]);
		System.out.println(a1.getName()+" average is "+a1.average());
		System.out.println(a2.allGradesAbove(25));
		System.out.println(a1.isBetter(a2));
		a1.deleteGrade("rings");
		System.out.println("next question");
		Group group=new Group("maccabi",3);
		Athlete a3=new Athlete("libi",2);
		a3.addGrade("freestyle", 25.5);
		a3.addGrade("paralles", 24.3);
		group.addAthlete(a1);
		group.addAthlete(a2);
		group.addAthlete(a3);
		group.deleteAthlete("artium");
		System.out.println(group.getBestAthleteName());
		System.out.println(group.addGrade("linoi", "horse", 23.8));
		for(int i=0;i<group.getAthletes().length;i++) {
			System.out.println(group.getAthletes()[i]);
		}
	}

}
}
