class Main {
    public static int binarySearch(int[] a,int x){
        int l=0,r=a.length-1;
        while(l<=r){
        int mid=(l+r)/2;
        if(a[mid]==x)
            return mid;
            else if(a[mid]>x)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 10, 40 };
        int key=10;
        int res = binarySearch(a, key);
        if(res==-1)
            System.out.println("Element not present ");
        else
            System.out.println("Element present at index "+res);
    }
}
