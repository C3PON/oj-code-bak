class Solution {
    public int reverse(int x) {
        //����int����Χ����ֵ���ؿ�
        if(x-2147483646>1||x+2147483646<-2){
            return 0;
        }
        //�������Ŵ���
        boolean flag = false;
        if(x<0){
            flag = true;
            x=-1*x;
        }
        //������������ŵĽ��
        int result = 0;
        while(x/10>0){
            result = x%10+result*10;
            x=x/10;
        }
        result = x%10+result*10;
        //������Ŵ���
        if(flag){
            result = -1*result;
        }
        return result;
    }
}
