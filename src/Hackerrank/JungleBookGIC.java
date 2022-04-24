package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class JungleBookGIC {

  public static Map<Integer, List<Integer>> getPredatorMap(List<Integer> arrayOfAnimals) {
    Map<Integer, List<Integer>> mapOfPredatorPrey = new HashMap<>();
    for (int i = 0; i < arrayOfAnimals.size(); i++) {
      if (arrayOfAnimals.get(i) == -1)
        continue;
      List<Integer> preyList = mapOfPredatorPrey.getOrDefault(arrayOfAnimals.get(i), new ArrayList<>());
      preyList.add(i);
      mapOfPredatorPrey.put(arrayOfAnimals.get(i), preyList);
    }
    return mapOfPredatorPrey;
  }

  public static Queue<Integer> getPredatorHead(List<Integer> arrayOfAnimals) {
    Queue<Integer> predatorHead = new LinkedList<>();
    for (int i = 0; i < arrayOfAnimals.size(); i++) {
      if (arrayOfAnimals.get(i) == -1) {
        predatorHead.add(i);
      }
    }
    return predatorHead;
  }

  public static void main(String[] args) {
//    int[] animals = {-1, 8, 6, 0, 7, 3, 8, 9, -1, 6};
//    List<Integer> animals = Arrays.asList(-1, 8, 6, 0, 7, 3, 8, 9, -1, 6);
//    List<Integer> animals = Arrays.asList(3, -1, 0, 1);
    List<Integer> animals = Arrays.asList(4, 1, -1, 3, -1);

    Map<Integer, List<Integer>> m = getPredatorMap(animals);
    Queue<Integer> predatorHeadList = getPredatorHead(animals);

    int minimumGroup = 0;
    while (!predatorHeadList.isEmpty()) {
      minimumGroup++;
      int size = predatorHeadList.size();
      for (int i = 0; i < size; i++) {
        int cur = predatorHeadList.poll();
        if (m.containsKey(cur)) {
          for (int l : m.get(cur)) {
            predatorHeadList.offer(l);
          }
        }
      }
    }

    System.out.println(minimumGroup);
  }
}
