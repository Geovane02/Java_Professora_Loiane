package SemafaroThreads;

public class ThreadSemafaro implements Runnable{


	private CorSemafaro cor;
	private boolean parar;
	private boolean corMudou;


	public ThreadSemafaro() {
		this.cor=CorSemafaro.VERMELHO;
		this.parar=false;
		this.corMudou=false;
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!parar) {
			try {
				switch (this.cor) {
				case VERMELHO:
					Thread.sleep(400);
					break;
				case AMARELO:
					Thread.sleep(200);
					break;
				case VERDE:
					Thread.sleep(300);
					break;

				default:
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			//System.out.println(this.cor);
			break;
			case AMARELO:
				this.cor = CorSemafaro.VERMELHO;
				break;
			case VERDE:
				this.cor = CorSemafaro.AMARELO;
				break;
		default:
			break;
		}
		this.corMudou=true;
		notify();
	}
	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.corMudou=false;
	}
	
	
	
	public CorSemafaro getCor() {
		return cor;
	}
	
}
