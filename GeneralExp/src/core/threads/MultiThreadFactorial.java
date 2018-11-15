package core.threads;

public class MultiThreadFactorial implements Runnable {
		int number;
		long result=1;
		
		public MultiThreadFactorial(int number){
			this.number=number;
		}
		
		public void runFactorial(){
			for(int i=1;i<=number;i++) {
				result=result*i;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(result);
		}
		
		public void run() {
			runFactorial();
		}
	
		public long getResult() {
			return result;
		}
}
