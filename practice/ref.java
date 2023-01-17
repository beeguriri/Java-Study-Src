package practice;

public class ref {
	
	public static int[] solution(int[] a, int[] b){
	    int[] result = new int[a.length + b.length];

	    // 합치기
	    for (int i = 0; i < a.length; i++) {
	        result[i] = a[i];
	    }

	    for (int i = 0; i < b.length; i++) {
	        result[i + a.length] = b[i];
	    }

	    // 정렬
	    java.util.Arrays.sort(result);

	    return result;
	}

	public static void main(String[] args) {
	    int[] a = new int[]{1, 3, 5, 7, 9};
	    int[] b = new int[]{2, 4, 6, 8, 10};

	    int[] solution = solution(a, b);

	    for (int i : solution) {
	        System.out.print(i);
	    }
	}

}
