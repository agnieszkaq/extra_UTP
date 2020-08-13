import java.util.*;

public class Main {
	public Main() {
		List<Integer> src1 = new ArrayList<>(Arrays.asList(1, 7, 9, 11, 12));
		System.out.println(test1(src1));

		List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv");
		System.out.println(test2(src2));
	}

	public List<Integer> test1(List<Integer> src) {
		Selector<Integer> sel = new Selector<Integer>() {

			@Override
			public boolean sel(Integer select) {
				if (select < 10)
					return true;
				return false;
			};
		};

		Mapper<Integer, Integer> map = new Mapper<Integer, Integer>() {

			@Override
			public Integer map(Integer item) {
				return item + 10;
			};
		};

		return ListCreator.collectFrom(src).when(sel).mapEvery(map);
	}

	public <T> List<Integer> test2(List<String> src) {
		Selector<String> sel = new Selector<String>() {

			@Override
			public boolean sel(String select) {
				if (select.length() > 3)
					return true;
				return false;
			};
		};

		Mapper<String, Integer> map = new Mapper<String, Integer>() {

			@Override
			public Integer map(String item) {
				
				return item.length()+10;
			}
		};

		return ListCreator.collectFrom(src).when(sel).mapEvery(map);
	}

	public static void main(String[] args) {
		new Main();
	}
}