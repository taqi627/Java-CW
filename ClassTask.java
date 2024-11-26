import java.util.Scanner;
import java.lang.String;
import java.lang.Object;

//HERE THIS IS THE MAIN CLASS
public class ClassTask
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int choice,select = 0,size = 5;
		String cont,search_name = "";
		
		StudentData []student = new StudentData[5];
		student[0] = new StudentData("023-22-7856","Karan",78,98.8,76.1,77.9,44,45.6,34.9,41);
		student[1] = new StudentData("023-22-9874","Kiran",87.9,94,98,76.9,45,43.8,43,41.7);
		
		for(int i=0; i<size; i++)
		{
			if(i>1)
				student[i] = new StudentData();
		}
		
		do		
		{
			System.out.println("\n\\**********************************************\\");
			System.out.println("\\ WELCOME IN STUDENT GRADE PORTAL(CS STUDENTS) \\");
			System.out.println("\\**********************************************\\\n\n");
			System.out.println("Press 1 for see the data of already enrolled students.");
			System.out.println("Press 2 for add new student data.");
			System.out.println("Press 3 for see the topper student details(from the enrolled students).");
			System.out.println("Press 4 for see the droped/Failed students(From the enrolled students).");
			System.out.println("Press 5 for update student's details.");
			System.out.println("Press 6 for delete the details OR record of any enrolled student.");
			System.out.println("Press 0 for exit the program.");
			
			System.out.print("\nEnter your choice : ");
			choice = input.nextInt();
			
			switch(choice)
			{
				case 0:
				break;
				
				case 1:
				{
					System.out.println("-------------------------------------------");
					for(int i=0; i<size; i++)
					{
						if(student[i].getName()!=null)
						System.out.println(student[i].getName());
					}
					System.out.println("-------------------------------------------\n");
					int count = 0;
					
					System.out.println("Enter the NAME of the student that you want to see complete details.");
					System.out.print("Otherwise press [ENTER] key for back in Main menu : ");
					input.nextLine();
					search_name = input.nextLine();
					
					if(search_name == "")
						break;
				
					for(int i=0; i<size; i++)
					{
						if(student[i].getName()!=null && search_name.compareTo(student[i].getName())==0)
						{
							student[i].DisplyDetails();
							count++;
						}
					}
					if(count == 0)
						System.out.println("Sorry! your search NOT FOUND.");
					break;
				}
			
				case 2:
				{
					for(int i=0; i<=size; i++)
					{
						if(i==size)
							System.out.println("SORRY! YOU CAN NOT ADD MORE STUDENT'S DATA(SECTION FULL)"); 
					
						else if(student[i].getName()!=null)
							continue;
					
						else
						{
						student[i].setData();
						System.out.println();
						break;
						}
					}
					break;
				}
			
				case 3:
				{
					double higest = student[0].getGPA();
					for(int i=1; i<size; i++)
					{
						if(higest<student[i].getGPA())
							higest = student[i].getGPA();
					}
					System.out.println("\n\\**********************************************\\");
					System.out.println("DETAILS OF TOPPER STUDENT...\n");
					System.out.println("\\**********************************************\\\n\n");
					for(int i=0; i<size; i++)
					{
						if(higest == student[i].getGPA())
							student[i].DisplyDetails();
							
					}
					break;
				}
			
				case 4:
				{
					System.out.println("\n\\**********************************************\\");
					System.out.println("DETAILS OF DROPED/FAILED STUDENTS...\n");
					System.out.println("\\**********************************************\\\n\n");
					int drop = 0;
					for(int i=0; i<size; i++)
					{
						if(student[i].getGPA() > 0.00 && student[i].getGPA()<2.2)
						{
							student[i].DisplyDetails();
							drop++;
						}
					}
					if(drop == 0)
						System.out.println("\nTHERE IS NO ANY FAILED/DROPED STUDENTS FOUND FROM THIS SECTION.\n");
					else{
						
						System.out.println("THERE ARE/IS "+drop+" DROPED/FAILED STUDENTS IN THIS SECTION.");
						System.out.println("----------------------------------------------------------------");
					}
					break;
				}
				
			
				case 5:
				{
					System.out.print("Enter name of the student that you want to update OR change any information : ");
					input.nextLine();
					String updated_name = input.nextLine();
					
					for(int i=0; i<size; i++)
					{
						
						if(student[i].getName() != null && updated_name.compareTo(student[i].getName()) == 0)
						{
							select++;
							System.out.println("Press 1 for update the CMS-ID of the student.");
							System.out.println("Press 2 for update the name of the student.");
							System.out.println("Press 3 for update the 	PROGRAMMING marks of the student.");
							System.out.println("Press 4 for update teh PRE-CALCULAS marks of the student.");
							System.out.println("Press 5 for update teh ENGLISH marks of the student.");
							System.out.println("Press 6 for update teh ICT marks of the student.");
							System.out.println("Press 7 for update teh PAKISTAN STUDIES marks of the student.");
							System.out.println("Press 8 for update teh ISLAMIAT marks of the student.");
							System.out.println("Press 9 for update teh PROGRAMMING-LAB marks of the student.");
							System.out.println("Press 10 for update teh ICT-LAB marks of the student.");
							
						
							System.out.print("\nEnter your choice : ");
							int choice_update = input.nextInt();
						
							switch(choice_update)
							{
								
							
								case 1:
								student[i].setCMS();
								break;
							
								case 2:
								student[i].setName();
								break;

								case 3:
								student[i].setMarks(choice_update-3);
								break;
							
								case 4:
								student[i].setMarks(choice_update-3);
								break;
							
								case 5:
								student[i].setMarks(choice_update-3);
								break;
							
								case 6:
								student[i].setMarks(choice_update-3);
								break;
							
								case 7:
								student[i].setMarks(choice_update-3);
								break;
							
								case 8:
								student[i].setMarks(choice_update-3);
								break;
							
								case 9:
								student[i].setMarks(choice_update-3);
								break;
							
								case 10:
								student[i].setMarks(choice_update-3);
								break;
							
								default:
								System.out.println("INVALID CHOICE");
							}
						}
					}
					if(select == 0)
					{
						System.out.println("SORRY! your searched student NOT FOUND.");
					}
					break;
				}
				
				case 6:
				{
					System.out.println("THESE ARE ENROLLED STUDENTS.");
					System.out.println("---------------------------------------");
					for(int i=0; i<size; i++)
					{
						if(student[i].getName()!=null)
							System.out.println(student[i].getName());
					}
					System.out.println("----------------------------------------");
					
					System.out.print("Enter the name of the student that you want to delete teh details OR record : ");
					input.nextLine();
					String del_name = input.nextLine();
					
					for(int i=0; i<size; i++)
					{
						if(student[i].getName() != null && del_name.compareTo(student[i].getName())==0)
							
							student[i].deleteRecord(student,i,size);
					}
					break;
				}
				
				
				default:
				System.out.println("INVALID CHOICE");
				
			}
				
			
			if(choice != 0)
			{	
				if(choice == 1 && search_name == "")
					cont = "";
				
				else
				{
					System.out.println("\nPress [ENTER] key for back in Main Menu.");
					System.out.print("Othewise, press any other button for exit the program immediately.");
					input.nextLine();
					cont = input.nextLine();
				}
			}
			else
				break;
			
			}while(cont.compareTo("")==0);
			System.out.println("HERE THE PROGRAM IS END!");
		
	}
}

class StudentData
{
	Scanner input = new Scanner(System.in);
	private String CMS_id;
	private String name;
	private double sub[] = new double[8];
	double bgpa =0,GPA;
	private double s[] = new double[8];

	StudentData()
	{
	}
	StudentData(String CMS_id,String name,double programming,double pre_calculas,double english,double ict,double pak_study,double islamiat,double programming_lab,double ict_lab)
	{
		this.CMS_id = CMS_id;
		this.name = name;
		this.sub[0] = programming;
		this.sub[1] = pre_calculas;
		this.sub[2] = english;
		this.sub[3]= ict;
		this.sub[4] = pak_study;
		this.sub[5] = islamiat;
		this.sub[6] = programming_lab;
		this.sub[7] = ict_lab;
	}

	double WrongMarks100(double w_mark) // METHOD FOR CORRECT OUT OF RANGE MARKS (0-100)
	{
		while(w_mark<0 || w_mark>100)
		{
			System.out.println("\nERROR : You entered out of range marks.");
			System.out.println("Your entered marks should be lies between this (0-100) range.");
			System.out.print("Enter marks again : ");
			w_mark = input.nextDouble();
			System.out.println();
			
		}
		return w_mark;
	}

	double WrongMarks50(double w_mark) //METHOD FOR CORRECT OUT OF RANGE MARKS (0-50)
	{
		while(w_mark<0 || w_mark>50)
		{
			System.out.println("\nERROR : You entered out of range marks.");
			System.out.println("Your entered marks should be lies between this (0-50) range.");
			System.out.print("Enter marks again : ");
			w_mark = input.nextDouble();
			System.out.println();
			
		}
		return w_mark;
	}
	
	//METHODS FOR UPDATING DATA 
	void setCMS()
	{
		System.out.print("Enter updated CMS-ID of the student : ");
		this.CMS_id = input.next();
	}
	void setName()
	{
		System.out.print("Enter updated NAME of the student : ");
		input.nextLine();
		this.name = input.nextLine();
	}
	void setMarks(int sno)
	{
		if(sno<=3 )
		{
			System.out.print("Enter updated marks : ");
			this.sub[sno] = input.nextDouble();
		
			this.sub[sno] = WrongMarks100(this.sub[sno]);
		}

		else
		{
			System.out.print("Enter updated marks : ");
			this.sub[sno] = input.nextDouble();
		
			this.sub[sno] = WrongMarks50(this.sub[sno]);
		}
	}
	
	//METHOD FOR GET CURRENT OBJECT NAME
	String getName()
	{
		return name;
	}
	
	//METHOD FOR TAKE INPUT DATA FROM THE USER
	void setData()
	{
		System.out.print("Enter CMS-Id : ");
		CMS_id = input.next();
		
		System.out.print("Enter NAME : ");
		input.nextLine();
		name = input.nextLine();
		
		System.out.print("Enter PROGRAMMING marks : ");
		sub[0] = input.nextDouble();
		this.sub[0]= WrongMarks100(this.sub[0]);
		
		System.out.print("Enter PRE-CALCULAS marks : ");
		sub[1] = input.nextDouble();
		this.sub[1] = WrongMarks100(this.sub[1]);
		
		System.out.print("Enter ENGLISH marks : ");
		sub[2] = input.nextDouble();
		this.sub[2] = WrongMarks100(this.sub[2]);
		
		System.out.print("Enter ICT marks : ");
		sub[3] = input.nextDouble();
		this.sub[3] = WrongMarks100(this.sub[3]);
		
		System.out.print("Enter PAKISTAN STUDIES marks : ");
		sub[4] = input.nextDouble();
		this.sub[4] = WrongMarks50(this.sub[4]);
		
		System.out.print("Enter ISLAMIAT marks : ");
		sub[5] = input.nextDouble();
		this.sub[5] = WrongMarks50(this.sub[5]);
		
		System.out.print("Enter PROGRAMMING-LAB marks : ");
		sub[6] = input.nextDouble();
		this.sub[6] = WrongMarks50(this.sub[6]);
		
		System.out.print("Enter ICT-LAB marks : ");
		sub[7] = input.nextDouble();
		this.sub[7] = WrongMarks50(this.sub[7]);
	}
	
	void default_value()
	{
		this.CMS_id = null;
		this.name = null;
		int m=0;
		while(m<8)
			{
				this.sub[m] = 0.00;
				m++;
			}
		
		
		
	}
	
	//METHOD FOR DELETE THE RECORD OF ANY OBJECT
	void deleteRecord(StudentData student[],int index,int size)
	{
		for(int i = index; i<size; i++)
		{
			if(i == size-1)
				student[i].default_value();
			
			else{
				student[i].CMS_id = student[i+1].CMS_id;
				student[i].name = student[i+1].name;
				int j=0;
				while(j<8)
					{
			        		student[i].sub[j] = student[i+1].sub[j];
						j++;
					}
				
			   }
			
		}
		
	}
	
	//METHODS FOR GPA CALCULATION
	double calcSubGPA_100(double subject)
	{
		//CALCULATE EACH SUBJECT GPA (TOTAL = 100)
		if(subject>= 93 && subject<=100)
			return 4.00;
		else if(subject>=87 && subject<=92)
			return 3.67;
		else if(subject>=82 && subject<=86)
			return 3.33;
		else if(subject>=77 && subject<=81)
			return 3.00;
		else if(subject>=72 && subject<=76)
			return 2.67;
		else if(subject>=68 && subject<=71)
			return 2.3;
		else if(subject>=64 && subject<=67)
			return 2.0;
		else if(subject>=60 && subject<=63)
			return 1.67;
		else 
			return 0.00;
		
	}
	double calcSubGPA_50(double subject)
	{
		//CALCULATE EACH SUBJECT GPA (TOTAL = 50)
		if(subject>= 46 && subject<=50)
			return 4.00;
		else if(subject>=44 && subject<=45)
			return 3.67;
		else if(subject>=42 && subject<=43)
			return 3.33;
		else if(subject>=39 && subject<=41)
			return 3.00;
		else if(subject>=37 && subject<=38)
			return 2.67;
		else if(subject>=35 && subject<=36)
			return 2.3;
		else if(subject>=32 && subject<=34)
			return 2.0;
		else if(subject>=30 && subject<=31)
			return 1.67;
		else 
			return 0.00;
	}
	
	//CALCULATE GPA
	double calcGPA()
	{
		for(int k=0;k<=7;k++)
		  if(k<=3)
			{
				s[k] = calcSubGPA_100(Math.round(sub[k]));
			}
			else 
			{
				s[k] = calcSubGPA_50(Math.round(sub[k]));
			}

		for(int k=0;k<=7;k++)
	        	{
				if(k==1)
				{
					bgpa += s[k]*0;
				}
				else 
				{
					bgpa += s[k];
				}	
			}
		
		
		
		this.GPA = ((bgpa*4)/28);
		return GPA;
	}
	
	//METHOD FOR GET CURRENT OBJECT'S GPA
	double getGPA()
	{
		calcGPA();
		return calcGPA();
	}
	
	//CRITERIA FOR FAILED STUDENTS
	void FailedSubject()
	{
		System.out.println("---------------------------------------------------");
		if(s[0] == 0.00)
			System.out.println("THis students is failed in PROGRAMMING.");
		if(s[1] == 0.00)
			System.out.println("This student is failed in PRE-CALCULAS.");
		if(s[2] == 0.00)
			System.out.println("This student is failed in ENGLISH.");
		if(s[3] == 0.00)
			System.out.println("This student is failed in ICT.");
		if(s[4] == 0.00)
			System.out.println("This student is failed in PAKISTAN STUDIES.");
		if(s[5] == 0.00)
			System.out.println("This student is failed in ISLAMIAT.");
		if(s[6] == 0.00)
			System.out.println("This student is failed in PROGRAMMING LAB.");
		if(s[7] == 0.00)
			System.out.println("This student is failed in ICT LAB.");
		if(s[0] != 0.00 && s[1] != 0.00 && s[2] != 0.00 && s[3] != 0.00 && s[4] != 0.00 && s[5] != 0.00 && s[6] != 0.00 && s[7] != 0.00)
			System.out.println("This student PASSED in all subjects.");
		System.out.println("-----------------------------------------------------");
	}
	
	//METHOD FOR DISPLY INFORMATION
	void DisplyDetails()
	{
		calcGPA();
		System.out.println("\n----------------------------------------------------");
		System.out.println("CMS-ID \t\t\t:\t\t"+this.CMS_id);
		System.out.println("NAME \t\t\t:\t\t"+this.name);
		System.out.println("PROGAMMING MARKS \t:\t\t"+this.sub[0]);
		System.out.println("PRE-CALCULAS MARKS \t:\t\t"+this.sub[1]);
		System.out.println("ENGLISH MARKS \t\t:\t\t"+this.sub[2]);
		System.out.println("ICT marks \t\t:\t\t"+this.sub[3]);
		System.out.println("PAKISTAN STUDIES MARKS \t:\t\t"+this.sub[4]);
		System.out.println("ISLAMIAT MARKS \t\t:\t\t"+this.sub[5]);
		System.out.println("PROGRAMMING LAB MARKS \t:\t\t"+this.sub[6]);
		System.out.println("ICT LAB MARKS \t\t:\t\t"+this.sub[7]);
		System.out.println("\nGPA IS \t\t\t:\t\t"+this.GPA);
		FailedSubject();
		System.out.println();
	}
}

