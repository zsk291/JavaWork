package work_2_leetcode1_9_13_58;

class Solution_58 {
    /**
     * �����ַ����� ���һ�� ���ʵĳ���
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int len = 0;
        //�������
        for (int i = s.length() - 1; i >= 0; i--) {
            //�����ո�ǰlen����
            if (s.charAt(i) != ' ') {
                len++;
                //�����ո������һ�����ʳ�����Ϣ�ռ���ɣ�ͬʱ��ֹ����ĩβΪ�ո�����⣩
            } else if (len != 0) {
                return len;
            }
        }
        //�վ���
        return len;
    }
}
