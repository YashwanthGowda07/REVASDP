package revauniversity1;
class Fill {
	void bubble(int n,int a[]) {
		int i,t;
		for(i=0;i<n;i++) {
			if(a[i]>a[i+1]) {
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		System.out.println("Array after sorting");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
