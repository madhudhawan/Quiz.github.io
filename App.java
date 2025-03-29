package com.project;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		rules();
		Questions q = new Questions();
		boolean res = q.question1();
		if(res==true) {
			System.out.println("Correct answer you have won :"+q.money);
			res = q.question2();
			if(res==true) {
				System.out.println("Correct answer you have won :"+q.money);
				res = q.question3();
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res=q.question4();
					if(res==true) {
						System.out.println("Correct answer you have won :"+q.money);
						res=q.question5();
						if(res==true) {
							System.out.println("Correct answer you have won :"+q.money);
						} else {
							System.out.println("Game over! you answered wrong");
						}
					} else {
						System.out.println("Game over! you answered wrong");
					}
				} else {
					System.out.println("Game over! you answered wrong");
				}
			}
			else {
				System.out.println("Game over! you answered wrong");
			} 
		}
		else {
			System.out.println("Game over! you answered wrong");
		}
		System.out.println("Total money:"+q.money);
	}
	public static void rules() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Quiz Game!");
	    System.out.println("Rules:");
	    System.out.println("1. There are 5 questions, each with 4 options.");
	    System.out.println("2. You have 3 lifelines: Audiance Poll, 50-50, Phone call.");
	    System.out.println("3. Each lifeline can be used only once.");
	    System.out.println("4. You can quit anytime and take home your winnings.");
	    System.out.println("5. A wrong answer will end the game.");
	    System.out.println("Do you accept the rules? (yes/no)");
	    String option=sc.next();
	    if(option.equals("no")) {
	    	System.out.println("Exiting the game...Thank you!");
	    	System.exit(0);
	    }
	}
}


class Questions {
	static int life_line_count=3;
	static int aud_poll=1;
	static int ff=1;
	static int phn_call =1;
	public static int money=0;
	public static Scanner sc = new Scanner(System.in);
	public boolean question1() {
		System.out.println("A. Which keyword is used to create an object in Java?\n"
				+ "1. object\n"
				+ "2. new\n"
				+ "3. create\n"
				+ "4. undefined\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call  : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. object	---> 30%\n"
						+ "2. new	---> 60%\n"
						+ "3. create	---> 45%\n"
						+ "4. undefined	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2. new\n"
						+ "4. undefined\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 2.new");
					choice=sc.nextInt();
					if(choice==2) {
						money+=1000;
						return true;
					} else {
						return false;
					}
					
				}
				
			}
		}
		return false;
	}
	public boolean question2() {
		System.out.println("A. What is the size of int in Java?\n"
				+ "1. 16\n"
				+ "2. 32\n"
				+ "3. 54\n"
				+ "4. 128\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. 16	---> 30%\n"
						+ "2. 32	---> 50%\n"
						+ "3. 54	---> 45%\n"
						+ "4. 128	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1. 16\n"
						+ "2. 32\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 2.32");
					choice=sc.nextInt();
					if(choice==2) {
						money+=1000;
						return true;
					} else {
						return false;
					}
					
				}
				
			}
		}
		return false;
	}
	public boolean question3() {
		System.out.println("A. Which of the following is not a primitive data type in Java?\n"
				+ "1. int\n"
				+ "2. char\n"
				+ "3. String\n"
				+ "4. double\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 3) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if(choice == 3) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call  : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. int	---> 30%\n"
						+ "2. char	---> 10%\n"
						+ "3. String   ---> 45%\n"
						+ "4. double   ---> 15%\n");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "3. string\n"
						+ "4. double\n");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 3.string");
					choice=sc.nextInt();
					if(choice==3) {
						money+=1000;
						return true;
					} else {
						return false;
					}
				}
				
			}
		}
		return false;
	}
	public boolean question4() {
		System.out.println("A. What is the size of a char in Java?\n"
				+ "1. 16 bit\n"
				+ "2. 32 bit\n"
				+ "3. 64 bit\n"
				+ "4. 128 bit\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 1) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. 16 bit	---> 60%\n"
						+ "2. 32 bit	---> 10%\n"
						+ "3. 64 bit	---> 45%\n"
						+ "4. 128 bit	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1. 16 bit\n"
						+ "2. 32 bit\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 1.16 bit");
					choice=sc.nextInt();
					if(choice==1) {
						money+=1000;
						return true;
					} else {
						return false;
					}
				}
				
			}
		}
		return false;
	}
	public boolean question5() {
		System.out.println("A. Which of the following is not a Java feature?\n"
				+ "1. Object-oriented\n"
				+ "2. Platform-independent\n"
				+ "3. Portable\n"
				+ "4. Low-level programming\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 4) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 4) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 4) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. Object-oriented	---> 30%\n"
						+ "2. Platform-independent	---> 10%\n"
						+ "3. Portable	---> 45%\n"
						+ "4. Low-level programming	---> 55%\n");
					choice = sc.nextInt();
					if(choice == 4) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "3. Portable\n"
						+ "4. Low-level programming\n");
					choice = sc.nextInt();
					if(choice == 4) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 4.Low-level programming");
					choice=sc.nextInt();
					if(choice==4) {
						money+=1000;
						return true;
					} else {
						return false;
					}
				}
				
			}
		}
		return false;
	}
}