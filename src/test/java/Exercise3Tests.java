import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise3Tests {

  @Test
  public void testTri() {
    assertEquals(Exercise3.Tri(0), 0);
  }

  @Test
  public void testTri2() {
    assertEquals(Exercise3.Tri(2), 3);
  }

  @Test
  public void testTri7() {
    assertEquals(Exercise3.Tri(7), 28);
  }

}
