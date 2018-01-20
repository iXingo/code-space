package cn.iwangxin.company.pinduoduo;


import java.util.*;

public class Main {

    static class Bear{
        int fight;
	    int food;
	    public Bear(int fight, int food) {
            this.fight = fight;
            this.food = food;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] sweet = new int[m];
            for (int i = 0; i < m; i++) {
                sweet[i] = in.nextInt();
            }
            List<Bear> bearlist = new ArrayList();
            for(int i=0;i<n;i++){
                int fight = in.nextInt();
                int food = in.nextInt();
                bearlist.add(new Bear(fight, food));
            }
            getResult(n,m,sweet,bearlist);
        }
    }

    private static void getResult(int n, int m, int[] sweet, List<Bear> bear){
        Arrays.sort(sweet);
        List<Bear> list = new ArrayList();
		list.addAll(bear);
		Collections.sort(bear, new Comparator<Bear>() {
			@Override
			public int compare(Bear o1, Bear o2) {
				return o1.fight-o2.fight;
			}
		});
		for(int i=0;i<n;i++){
			Bear b = list.get(i);
			for(int j=m-1;j>=0;j--){
				if(sweet[j]>0 && b.food>=sweet[j]){
					b.food-=sweet[j];
					sweet[j] = -1;
				}
			}
		}
		for(Bear b : list){
			System.out.println(b.food);
		}
    }

}