package basic_20210419;

public class yangchi 
{
	public static void main(String[] args) 
	{
		// 양치를 하지 않은 상태
		boolean yangchi = false;
		
		// 시간이 아침 8시
		int hour = 8;
		
		if(!yangchi)
		{
			if(hour<=8)
			{
				System.out.println("아직 양치를 하지 않은 상태이고, 8시 이전이므로 양치를 시작합니다.");
				yangchi = true;
			}
			else
			{
				yangchi = false;
				System.out.println("아직 하지 않은 상태이지만, 8시 이후이므로 지각을 염려해 양치를 건너뜁니다.");
			}
		}
		else
		{
			System.out.println("이미 양치를 한 상태입니다.");
			yangchi = false;
		}
	}
}
