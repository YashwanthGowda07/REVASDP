package revauniversity1;
class Application {
	void App(int n) {
		int i,f=1;
		if(n>0) {
			for(i=1;i<=n;i++) {
				f=f*i;
			}
		}
		else
			f=1;
		System.out.print("Factorial=");
		System.out.println(f);
	}
}
