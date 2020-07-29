import java.util.*;


public class Main {
	public Main() {
		List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);
		System.out.println(test1(src1));

		List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv");
		System.out.println(test2(src2));
	}

	public List<Integer> test1(List<Integer> src) {
          Selector /*<-- definicja selektora; bez lambda-wyra¿eñ; nazwa zmiennej sel */
          Mapper   /*<-- definicja mappera; bez lambda-wyra¿eñ; nazwa zmiennej map */
          return   /*<-- zwrot wyniku
            uzyskanego przez wywo³anie statycznej metody klasy ListCreator:
           */  collectFrom(src).when(sel).mapEvery(map);
        }

	public List<Integer> test2(List<String> src) {
          Selector /*<-- definicja selektora; bez lambda-wyra¿eñ; nazwa zmiennej sel */
          Mapper   /*<-- definicja mappera; bez lambda-wyra¿eñ; nazwa zmiennej map */
          return   /*<-- zwrot wyniku
            uzyskanego przez wywo³anie statycznej metody klasy ListCreator:
           */  collectFrom(src).when(sel).mapEvery(map);
        }

	public static void main(String[] args) {
		new Main();
	}
}