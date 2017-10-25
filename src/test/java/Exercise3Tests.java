import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise3Tests {

  // Tests for Triangle sequence
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

  // Tests for Lazy Canter sequence
  @Test
  public void testLazy() {
    assertEquals(Exercise3.Lazy(0), 1);
  }

  @Test
  public void testLazy2() {
    assertEquals(Exercise3.Lazy(2), 4);
  }

  @Test
  public void testLazy7() {
    assertEquals(Exercise3.Lazy(7), 29);
  }

}
