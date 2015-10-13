/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TLongListDecorator;
import gnu.trove.list.TLongList;
import gnu.trove.list.array.TLongArrayList;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TLongListDecoratorEvoSuite_Branch {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.loadLogbackForEvoSuite(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
  } 

  @Before 
  public void initTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TLongListDecorator.readExternal(Ljava/io/ObjectInput;)V: root-Branch
   * 2 gnu.trove.decorator.TLongListDecorator.<init>()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator();
      // Undeclared exception!
      try {
        tLongListDecorator0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TLongListDecorator.getList()Lgnu/trove/list/TLongList;: root-Branch
   * 2 gnu.trove.decorator.TLongListDecorator.<init>(Lgnu/trove/list/TLongList;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TLongArrayList tLongArrayList0 = new TLongArrayList();
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator((TLongList) tLongArrayList0);
      TLongArrayList tLongArrayList1 = (TLongArrayList)tLongListDecorator0.getList();
      assertSame(tLongArrayList0, tLongArrayList1);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TLongListDecorator.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TLongArrayList tLongArrayList0 = new TLongArrayList();
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator((TLongList) tLongArrayList0);
      // Undeclared exception!
      try {
        tLongListDecorator0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 gnu.trove.decorator.TLongListDecorator.get(I)Ljava/lang/Long;: I14 Branch 1 IFNE L93 - true
   * 2 gnu.trove.decorator.TLongListDecorator.remove(I)Ljava/lang/Long;: I14 Branch 3 IFNE L115 - true
   * 3 gnu.trove.decorator.TLongListDecorator.size()I: root-Branch
   * 4 gnu.trove.decorator.TLongListDecorator.add(ILjava/lang/Long;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TLongArrayList tLongArrayList0 = new TLongArrayList();
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator((TLongList) tLongArrayList0);
      Long long0 = new Long(626L);
      tLongListDecorator0.add(long0);
      assertEquals("{626}", tLongArrayList0.toString());
      
      tLongListDecorator0.clear();
      assertEquals(true, tLongArrayList0.isEmpty());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TLongListDecorator.get(I)Ljava/lang/Long;: I14 Branch 1 IFNE L93 - false
   * 2 gnu.trove.decorator.TLongListDecorator.remove(I)Ljava/lang/Long;: I14 Branch 3 IFNE L115 - false
   */

  @Test
  public void test4()  throws Throwable  {
      long[] longArray0 = new long[9];
      TLongArrayList tLongArrayList0 = new TLongArrayList(longArray0);
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator((TLongList) tLongArrayList0);
      tLongListDecorator0.clear();
      assertEquals("{}", tLongArrayList0.toString());
      assertEquals(0, tLongListDecorator0.size());
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TLongListDecorator.set(ILjava/lang/Long;)Ljava/lang/Long;: I16 Branch 2 IFNE L101 - true
   * 2 gnu.trove.decorator.TLongListDecorator.size()I: root-Branch
   * 3 gnu.trove.decorator.TLongListDecorator.add(ILjava/lang/Long;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TLongArrayList tLongArrayList0 = new TLongArrayList();
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator((TLongList) tLongArrayList0);
      Long long0 = new Long(1084L);
      tLongListDecorator0.add(long0);
      Long long1 = tLongListDecorator0.set(0, (Long) 1084L);
      assertEquals(1, tLongArrayList0.size());
      assertEquals(1084L, (long)long1);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TLongListDecorator.set(ILjava/lang/Long;)Ljava/lang/Long;: I16 Branch 2 IFNE L101 - false
   * 2 gnu.trove.decorator.TLongListDecorator.<init>(Lgnu/trove/list/TLongList;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      long[] longArray0 = new long[9];
      TLongArrayList tLongArrayList0 = new TLongArrayList(longArray0);
      TLongListDecorator tLongListDecorator0 = new TLongListDecorator((TLongList) tLongArrayList0);
      tLongListDecorator0.set(0, (Long) 793L);
      assertEquals(793L, tLongArrayList0.sum());
      assertEquals("[793, null, null, null, null, null, null, null, null]", tLongListDecorator0.toString());
  }
}
