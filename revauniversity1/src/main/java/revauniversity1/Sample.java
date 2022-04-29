package revauniversity1;
class Sample {
	void search(int n,int a[],int s) {
		int i;
		int f=0;
		for(i=0;i<n;i++) {
			if(a[i]==s) {
				f=1;
				return;
			}
		}
		if(f==1)
			System.out.println("search successful");
		else
			System.out.println("search unsuccessful");
	}
}
