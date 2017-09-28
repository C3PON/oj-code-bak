class Solution {
    public int reverse(int x) {
        //超出int处理范围的数值返回空
        if(x-2147483646>1||x+2147483646<-2){
            return 0;
        }
        //参数符号处理
        boolean flag = false;
        if(x<0){
            flag = true;
            x=-1*x;
        }
        //计算出不带符号的结果
        int result = 0;
        while(x/10>0){
            result = x%10+result*10;
            x=x/10;
        }
        result = x%10+result*10;
        //结果符号处理
        if(flag){
            result = -1*result;
        }
        return result;
    }
}
