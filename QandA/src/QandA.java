
public class QandA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Where are you from?");
		sleep(500);
		System.out.println("I'm from Beijing, China");
		
		System.out.println("What do you like to do?");
		sleep(1000);
		System.out.println("I love playing tennis, I have been playing tennis since I was 7. "
				+ "I also love to play golf and squash.");
		
		System.out.println("Do you have any siblings?");
		sleep(500);
		System.out.println("Yes, I have an older sister who is a freshman in college and a younger brother in 3rd grade");
		
		System.out.println("What is your favorite food?");
		sleep(500);
		System.out.println("I really just love food from Beijing, there are so many delicious foods here.");
		
		System.out.println("What do you not like?");
		sleep(1000);
		System.out.println("I really don't like spicy food, I just can't tolerate it."
				+ "Even if it's just a little spicy, I can't eat it anymore.");
		
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
