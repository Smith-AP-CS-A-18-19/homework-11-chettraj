  import java.util.ArrayList;
public class Homework11A extends Homework11{

  private ArrayList<Integer> nums2;

  public Homework11A(){
    super();
    nums2 = new ArrayList<Integer>();
  }
  public int problem4(){
    int sum = 0;
    nums2 = getList();
    for (int i : nums2){
      sum += i;
    }
    return sum;
  }

  @Override
  public void problem2(int n) {
    int woo = 0;
    while (woo < nums2.size()){
      int num = nums2.get(woo);
      if ((n % num) != 0){
        nums2.remove(woo);
      }
      else {
        woo += 1;
      }
    }
  }
}
