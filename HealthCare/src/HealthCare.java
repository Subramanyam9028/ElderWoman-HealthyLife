import java.util.Scanner;

class ElderWoman{
	private String name;
	private int age;
	private String suffer;
	
	
	
	public void print() {

		System.out.println("Name :"+ name);
		System.out.println("age :"+ age);
		System.out.println("suffering from :"+ suffer);
	
	}
		public void setName(String name) {
		this.name = name;
	}
		public void setSuffer(int s) {
			if(s==1) {
			   suffer ="diabetese";
			}
			
			else if(s==2) {
				suffer ="blood pressure";
				
			}
			
			else {
				suffer="sugar";
			}
		}
	
	public void setAge(int age) {
		if(age>110) {
			System.out.println("invalid input, please enter correct age");
			Scanner sc = new Scanner(System.in);
			int nage=sc.nextInt();
			setAge(nage);
//			HealthCare.main(null);
		}
		
		else if(age>=65&&age<=110) {
		this.age = age;
		}
		
	   
		else  {
			System.out.println("your age is not 65 or above, This aap is only for 65+ people, thank You!!");
			HealthCare.main(null);}
	}
	
	
}

class FoodAndExercise{
	
	private String f1= "food1";
	private String f2= "food2";
	private String f3= "food3";
	private String f4= "food4";
	
	public void foodExercise(int d) {
		if(d==1) {
			System.out.println("food list: "+f1+" "+f2+" "+f3);
			System.out.println("exercise: do pranayam");
		}
		
		else if(d==2) {
			System.out.println("food list: "+f3+" "+f2+" "+f4);
			System.out.println("exercise: do meditation and kapalbhati");
		}
		else if(d==3) {
			System.out.println("food list: "+f4+" "+f2+" "+f1);
			System.out.println("exercise: do suryanamaskar");
		}
		
		
	}
		
	
}

class SufferingFrom{
	
	Scanner sc= new Scanner(System.in);
	
	private String medine1="astroGap";
	private String medine2="sicom3";
	private String medine3="imunocad";
	private String medine4="blefex";
	private String medine5="statroG";
	private String medine6="kantik5";
	
	SufferingFrom(){
		
	}
//	SufferingFrom(int a){
//		if(a==1) {
//			
//			System.out.println("prescribed medicine is " +medine1);
//			System.out.println("medicines list:");
//		    System.out.println(medine1+" two times/day\n"+medine2+" one time/day\n"+medine3+"two times/day");
//		}
//		
//		else if(a==2) {
//			
//			System.out.println("prescribed medicine is " +medine2);
//			System.out.println("medicines list:");
//		    System.out.println(medine2+" two times/day\n"+medine3+" one time/day\n"+medine4+"two times/day\nAdvice: dont overthink , avoid frustression, dont take to much stress.take my exercise advice.Be happy");
//		}
//		
//		else if(a==3) {
//			
//			System.out.println("prescribed medicine is " +medine4);
//			System.out.println("medicines list:");
//		    System.out.println(medine4+" two times/day\n"+medine5+" one time/day\n"+medine6+" two times/day\nAdvice: dont eat sweet, take medicines regularly, take exercise advice from me. Be happy"  );
//		}
		
		
		
		
//	}
	
	public void medical(int a) {
		if(a==1) {
			
			System.out.println("prescribed medicine is " +medine1);
			System.out.println("medicines list:");
		    System.out.println(medine1+" two times/day\n"+medine2+" one time/day\n"+medine3+"two times/day");
		}
		
		else if(a==2) {
			
			System.out.println("prescribed medicine is " +medine2);
			System.out.println("medicines list:");
		    System.out.println(medine2+" two times/day\n"+medine3+" one time/day\n"+medine4+"two times/day\nAdvice: dont overthink , avoid frustression, dont take to much stress.take my exercise advice.Be happy");
		}
		
		else if(a==3) {
			
			System.out.println("prescribed medicine is " +medine4);
			System.out.println("medicines list:");
		    System.out.println(medine4+" two times/day\n"+medine5+" one time/day\n"+medine6+" two times/day\nAdvice: dont eat sweet, take medicines regularly, take exercise advice from me. Be happy"  );
		}
	}
	
//	System.out.println("For a healthier life, folllow the following things regularly!!");
	
	public void chooser(char c, int nam) {
//		System.out.println("enter e for medicines list with time slots or enter n for exit: ");
		
		if(c!='e'&&c!='n') {
			System.out.println("invalid input, please enter correct");
			c=sc.next().charAt(0);
			
			chooser(c,nam);
		}
		else if (c=='e') {
			SufferingFrom ss = new SufferingFrom();
			ss.medical(nam);
				
			
			
		}
		
		else if(c=='n') {
			System.out.println("thank you for using HealthCare App");
			System.exit(0);
		}
		
	}
	
	public void chooseFood(char k, int d ) {
		
	if(k!='p'&&k!='n') {
		
		System.out.println("invalid input, please enter correct");
		k=sc.next().charAt(0);
		
		chooseFood(k,d);
		
	}
	else if(k=='p') {
			FoodAndExercise fe = new FoodAndExercise();
			fe.foodExercise(d);
			
		}
		
		else if(k=='n') {
			System.out.println("take your medicines on time. thank you!");
			HealthCare.main(null);
			
		}
	}
	
	
}



class wantContinue{
	
	public void getStart(String ans){
		String an1="yes";
//		String an2="no";
		if(ans.equals(an1)) {
			
			Scanner sc = new Scanner(System.in);
			
			ElderWoman p1 = new ElderWoman();
			
			System.out.println("enter your name please: ");
			String name = new String();
			name= sc.nextLine();
			
			System.out.println("enter your age: ");
			int age = sc.nextInt();
			p1.setName(name);
			p1.setAge(age);
//			p1.print();
			
			
			System.out.println("Select number from which problem are you suffering from\n1. diabetese\n2. blood pressure\n3. Sugar\n4. dont have any problem");
			
			
			int d= sc.nextInt();
			if(d==4) {
				System.out.println("well, keep it up. just exercise daily, take nutritious food in your diet. Have a healthy life");
				HealthCare.main(null);
			}
			
			else if(d!=1&&d!=2&&d!=3) {
				
					System.out.println("Invalid input!");
					HealthCare.main(null);
				}
			
			else {
			
				p1.setSuffer(d);
				p1.print();
			
			System.out.println("enter e for medicines list with time slots or enter n for exit: ");
			char c = sc.next().charAt(0);
			SufferingFrom s = new SufferingFrom();
			s.chooser(c,d);
			
//			if(c!='e'||c!='n') {
//				System.out.println("invalid input, please enter correct");
//				s.
//			}
//			else if (c=='e') {
//				SufferingFrom ss = new SufferingFrom(d);
//				
//			}
//			
//			else if(c=='n') {
//				System.out.println("thank you for using HealthCare App");
//				System.exit(0);
//			}
			
			System.out.println("enter p for food and exercise advice: ");
			char k = sc.next().charAt(0);
			s.chooseFood(k, d);
			
			
			
			
//			p1.setName(name);
//			p1.setAge(age);
//			p1.print();
//			p1.prescribed_med("Covaxin");
//			p1.show_medicines();
		
			HealthCare.main(null);
			}
		}
		
		else {
			System.out.println("thank you for using HealthCare App");
			System.exit(0);
		}
	}
}



public class HealthCare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Do you want to continue using our App? type yes or no: ");
		String ans=sc.nextLine();
		wantContinue cnt = new wantContinue();
		cnt.getStart(ans);
		
//		

	}

}
