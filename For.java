package control.loop;

public class For {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		int sum = 0;
		for(i = 1, sum = 0; i <= 10; sum += i, i++);
		//for(i = 1, sum = 0; i <= 10; i++);
		//sum += i
		System.out.printf("�� : %d%n", sum);
		
		
		for(int j = 1, total = 0; j <=5; j++){
			total += j;
			System.out.printf("1���� %d������ ���� %d�Դϴ�.%n", j, total);
		}
		//���� ���� ���� �߻�, ���� j �� total�� ���Ұ�
		//System.out.printf("1���� %d������ ���� %d�Դϴ�.%n", j-1, total);
	}

}
