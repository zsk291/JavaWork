package work_2_leetcode1_9_13_58;

class Solution_9_1 {
    /**
     * �ж��Ƿ�Ϊ�������������жϷ���
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //0��������ֱ�ӷ���true
        if (x == 0) return true;
        //ɸ������
        if (x < 0 ||x%10==0) return false;
        //����rev�����洢������
        int rev = 0;
        while (x > rev) {
            //��β�����뵹�����ĵ�һλ
            rev = rev * 10 + x % 10;
            //�޳�һλ�Ѿ�ת�뵹������β��
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}

