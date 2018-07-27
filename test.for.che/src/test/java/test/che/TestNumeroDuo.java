package test.che;

import org.testng.annotations.Test;

public class TestNumeroDuo {
  
  @Test(groups= {"group1", "group2"})
  public void group1group2() {
    System.out.println("group1, group2"); 
  }
  
  @Test(groups="group1")
  public void group1() {
    System.out.println("group1"); 
  }
  
  @Test(groups="group2")
  public void group2() {
    System.out.println("group2"); 
  }
  
}
