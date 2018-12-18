package Sid;
public class Handler implements Runnable {
	int i,k;
	Handler1 handler1;
	public Handler(int i,int k, Handler1 handler1) {
		super();
		this.i = i;
		this.k = k;
		this.handler1 = handler1;
	}
		public void run() {
			while (true) {
				System.out.println("start");
				handler1.handler(i, k);
				//handler1.handlerDel();// после добавить к новому массиву, где будут только (не)четные числа
				System.out.println("min");
				System.out.println(handler1.getMin1());
				System.out.println("max");
				System.out.println(handler1.getMax1());
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}
}