package basic_20210419;

public class yangchi 
{
	public static void main(String[] args) 
	{
		// ��ġ�� ���� ���� ����
		boolean yangchi = false;
		
		// �ð��� ��ħ 8��
		int hour = 8;
		
		if(!yangchi)
		{
			if(hour<=8)
			{
				System.out.println("���� ��ġ�� ���� ���� �����̰�, 8�� �����̹Ƿ� ��ġ�� �����մϴ�.");
				yangchi = true;
			}
			else
			{
				yangchi = false;
				System.out.println("���� ���� ���� ����������, 8�� �����̹Ƿ� ������ ������ ��ġ�� �ǳʶݴϴ�.");
			}
		}
		else
		{
			System.out.println("�̹� ��ġ�� �� �����Դϴ�.");
			yangchi = false;
		}
	}
}