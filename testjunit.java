import junit.framework.*;

public class testjunit extends TestCase {

  public void test() throws Exception {
    assertEquals("Racaillou",Racaillou.getNom());
    assertEquals("ratata",Ratata.getNom());
  }
}