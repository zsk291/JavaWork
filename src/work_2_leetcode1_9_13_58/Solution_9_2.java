package work_2_leetcode1_9_13_58;

class Solution_9_2 {
    /**
     * �ж��Ƿ�Ϊ�������������жϷ���
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //0��������ֱ�ӷ���true
        if (x == 0) return true;
        //ɸ������ �� β��Ϊ0�������β����Ӧ��λ����Ϊ0��
        if (x < 0 ||x%10==0)
            return false;
        //����rev�����洢������
        int rev = 0;
        int num = x;
        while (num != 0) {
            //��β�����뵹�����ĵ�һλ
            rev = rev * 10 + num % 10;
            //�޳�һλ�Ѿ�ת�뵹������β��
            num /= 10;
        }
        //�ж�ԭ���뵹���Ƿ�һ��
        return rev == x;
    }
}
