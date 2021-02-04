import java.util.Scanner;

public class Operations {
	static Scanner sc = new Scanner(System.in);

	public static Actor[] addCapacity(Actor[]a) {

		int length = a.length +1;
		Actor[] temp = new Actor[length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
		return a;
	}
	Actor[] addActors(Actor[] a,int index) {
		int size=a.length;
		if(index+1==size) {
			a=addCapacity(a);
		}
				System.out.println("Enter Actor_id");
				int a1 = sc.nextInt();
				System.out.println("Enter Actor Name");
				String b = sc.next();
				System.out.println("Enter Salary");
				long c = sc.nextLong();
				System.out.println("Enter Industry(Hollywood/Bollywood)");
				String d = sc.next();
				a[index] = new Actor(a1, b, c, d);
				return a;
			
		}

	void displayBasedonIndustry(Actor[] a) {
		System.out.println("Enter Industry(Hollywood/Bollywood)");
		String b = sc.next();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				if (b.equals(a[i].getIndustry())) {
					System.out.println(a[i]);
				}
			}
		}
	}

	void updateDetails(Actor[] a) {
		System.out.println("Enter Actor_Id");
		int a1 = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				if (a1 == a[i].getActor_Id()) {
					System.out.println("press 1 to update Salary");
					System.out.println("press 2 to update Industry");
					int a2 = sc.nextInt();
					if (a2 == 1) {
						System.out.println("Enter the new Salary");
						long b = sc.nextLong();
						a[i].setSalary(b);
					} else if (a2 == 2) {
						System.out.println("enter the new Industry");
						String c = sc.next();
						a[i].setIndustry(c);
					} else {
						System.out.println("invalid input");
					}
				}
			}
		}
	}

	void sorting(Actor[] a) {
		short count = 0;
		short r = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				count++;
			}
		}
		long temp = 0;
		long[] num = new long[count];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				num[r] = a[i].getSalary();
				r++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > 1000000 && num[j + 1] > 1000000) {
					if (num[j] > num[j + 1]) {
						temp = num[j];
						num[j] = num[j + 1];
						num[j + 1] = temp;
					}
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] != null) {
					if (num[i] == a[j].getSalary()) {
						System.out.println(a[j]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=2;
		Actor[] a = new Actor[size];
		boolean flag = true;
		int index=0;
		Operations o = new Operations();
		do {
			System.out.println("Press 1 to add Actor details");
			System.out.println("press 2 to display details based on industry");
			System.out.println("press 3 to update details of Actors");
			System.out.println("press 4 to sort salary");
			System.out.println("press 5 to exit");
			int a1 = sc.nextInt();
			sc.nextLine();
			switch (a1) {
			case 1:
				a=o.addActors(a,index);
				index++;
				break;
			case 2:
				o.displayBasedonIndustry(a);
				break;
			case 3:
				o.updateDetails(a);
				break;
			case 4:
				o.sorting(a);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("invalid input");

			}
		} while (flag != false);
	}
}
