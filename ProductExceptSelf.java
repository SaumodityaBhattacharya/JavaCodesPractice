class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        answer[0]=1;
        for(int i=1;i<n;i++){
          answer[i]=answer[i-1]*nums[i-1];
        }  
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*suffix;
            suffix *= nums[i];
        }
        return answer;
    }
public static void main(String[] args){
    int[] x={1,2,3,4};
    int[] res=productExceptSelf(x);
    for(int y: res){
        System.out.print(y+" ");
    }
}   
}  
