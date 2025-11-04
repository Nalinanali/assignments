package language.basics;

public class Arrayconcepts {

	public static void main(String[] args) {


		 String emp1Name ="Nalina";
		   int empd1ID= 1;
		   
		   String emp2Name ="bharath reddy";
		   int empd2ID= 2;
		   
		   String emp3Name ="manvitha";
		   int empd3ID= 1;
		   
		   //3D Array
		   
		   //Two oraganization.In each organization, three projects,In each project,four employees are working.
		   
		   //company 1 (0)
		   
	//	 (0)  //Project 1: John(0),Smith(1),David(2),Peter(3)
	//	 (1)  //Project 2:Linda,Alice,Bob,charlie
	//	  (2) //Project3 :Tom,Jerry,harry,Ron
		   
		   //company 2 (1)
		   
			//	 (0)  //Project 1: Sam(0),Max(1),Leo(2),Jack(3)
			//	 (1)  //Project 2:Mia,Zoe,Ava,Eva
			//	  (2) //Project3 :Kim,Lee,Jay,kay
		   
		   
		   String [][][] empData = new String [2][3][4];
		    
		   empData [0][1][3] ="Charlie"; 
		   empData [0][0][1] ="Smith";
		   empData [1][0][1] ="Max";
		   empData [1][2][0] ="Kim";

	}

}
