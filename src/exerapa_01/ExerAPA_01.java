package exerapa_01;

public class ExerAPA_01 {
    
    public static Integer[] selectionsort(Integer[] sequence) {
		int n = sequence.length;
		int index = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			min = sequence[i];
			for (int j = i; j < n; j++)
				if (sequence[j] < min) {
					min = sequence[j];
					index = j;
				}
			if (sequence[i] > min) {
				sequence[index] = sequence[i];
				sequence[i] = min;
			}
		}
		return sequence;
	}

    public static Integer[] insertionsort(Integer[] sequence) {
        int n = sequence.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int k = i;
            while (j >= 0 && sequence[j] > sequence[k]) {
                sequence[j] = sequence[j] + sequence[k];
                sequence[k] = sequence[j] - sequence[k];
                sequence[j] = sequence[j] - sequence[k];
                j--;
                k--;
            }
        }
        return sequence;
    }
    

    public static void main(String[] argv) {

	Integer[] sec = {3, 6, 1, 7, 8, 5, 44, -3};
        Integer[] sec2 = sec;
        
        ExerAPA_01.selectionsort(sec);
        ExerAPA_01.insertionsort(sec2);
        
        for (int i = 0; i < sec.length; i++) {        
        System.out.print(sec[i] + " ");
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < sec2.length; i++) {        
        System.out.print(sec2[i] + " ");
        }
    }
}
