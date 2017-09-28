public class Solution9 {

	   
    public boolean isPalindrome(int x) {
        //负数一定不能回文，个位数一定是回文，注意别漏掉0
        if(x<10&&x>=0){
            return true;
        }else if(x<0){
            return false;
        }
        //采用String，将数字分为前后两段
        String s= ""+x;
        String pre = s.substring(0,s.length()/2);
        String after = s.substring((s.length()+1)/2);
        
        //将前面一段进行逆序，注意这里不用int是因为10会变成1而不是01。
        String reserve = "";
        while(pre.length()>1){
            reserve=reserve+pre.substring(pre.length()-1);
            pre = pre.substring(0,pre.length()-1);
        }
        reserve=reserve+pre;
        
        //最后比较逆序后的前半段和后半段作比较，相同的话，参数为回文数。
        if((reserve).equals(after)){
            return true;
        }else{
            return false;
        }
    }
}
