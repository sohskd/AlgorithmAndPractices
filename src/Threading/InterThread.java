package Threading;

class Q {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.num = num;
        System.out.println("Put : " + num);
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {

            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        valueSet = false;
        System.out.println("Get : " + num);
        notify();
    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}


public class InterThread {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Q q = new Q();
		
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        Consumer c = new Consumer(q);

        Producer p = new Producer(q);

        //c.run();
        //p.run();

    }

}
