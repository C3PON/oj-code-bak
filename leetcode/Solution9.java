public class Solution9 {

	   
    public boolean isPalindrome(int x) {
        //����һ�����ܻ��ģ���λ��һ���ǻ��ģ�ע���©��0
        if(x<10&&x>=0){
            return true;
        }else if(x<0){
            return false;
        }
        //����String�������ַ�Ϊǰ������
        String s= ""+x;
        String pre = s.substring(0,s.length()/2);
        String after = s.substring((s.length()+1)/2);
        
        //��ǰ��һ�ν�������ע�����ﲻ��int����Ϊ10����1������01��
        String reserve = "";
        while(pre.length()>1){
            reserve=reserve+pre.substring(pre.length()-1);
            pre = pre.substring(0,pre.length()-1);
        }
        reserve=reserve+pre;
        
        //���Ƚ�������ǰ��κͺ������Ƚϣ���ͬ�Ļ�������Ϊ��������
        if((reserve).equals(after)){
            return true;
        }else{
            return false;
        }
    }
}
