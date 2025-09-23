package props;

public class Testeo extends Thread{
    public Testeo() {
        this.start();
    }

    public void run(){
        System.out.println("ola soy otro ilo");
    }
}
