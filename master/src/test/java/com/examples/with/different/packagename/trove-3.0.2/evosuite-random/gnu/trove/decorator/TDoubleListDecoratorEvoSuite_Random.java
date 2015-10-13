/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TDoubleListDecorator;
import gnu.trove.impl.sync.TSynchronizedDoubleList;
import gnu.trove.impl.sync.TSynchronizedRandomAccessDoubleList;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleList;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.array.TDoubleArrayList;
import gnu.trove.list.linked.TDoubleLinkedList;
import gnu.trove.procedure.TDoubleProcedure;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TDoubleListDecoratorEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
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


  @Test
  public void test0()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 676;
      // Undeclared exception!
      try {
        tDoubleListDecorator0.get(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-102.89464107373877);
      doubleArray0[0] = double0;
      double double1 = 0.0;
      doubleArray0[1] = double1;
      double double2 = (-1.0);
      doubleArray0[2] = double2;
      double double3 = (-1597.379262408569);
      doubleArray0[3] = double3;
      double double4 = 0.0;
      doubleArray0[4] = double4;
      double double5 = (-1784.6071747765377);
      doubleArray0[5] = double5;
      double double6 = (-1.0);
      doubleArray0[6] = double6;
      double double7 = (-1.0);
      doubleArray0[7] = double7;
      double double8 = (-1.0);
      TDoubleArrayList tDoubleArrayList0 = TDoubleArrayList.wrap(doubleArray0, double8);
      TSynchronizedRandomAccessDoubleList tSynchronizedRandomAccessDoubleList0 = new TSynchronizedRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      int int0 = Integer.MAX_VALUE;
      // Undeclared exception!
      try {
        tSynchronizedRandomAccessDoubleList0.subList(int0, int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // end index < 8
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      // Undeclared exception!
      try {
        tDoubleListDecorator0.toArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 1;
      Double double0 = new Double((double) int0);
      // Undeclared exception!
      try {
        tDoubleListDecorator0.set(int0, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 2030;
      double double0 = 1210.2533566168315;
      Double double1 = new Double(double0);
      // Undeclared exception!
      try {
        tDoubleListDecorator0.add(double1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TDoubleList tDoubleList0 = null;
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try {
        tDoubleListDecorator0.retainAll((Collection<?>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 1320;
      // Undeclared exception!
      try {
        tDoubleListDecorator0.listIterator(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 1808;
      // Undeclared exception!
      try {
        tDoubleListDecorator0.listIterator(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = 0.0;
      doubleArray0[0] = double0;
      double double1 = (-1.0);
      doubleArray0[1] = double1;
      double double2 = 1803.815496097196;
      doubleArray0[2] = double2;
      double double3 = (-1328.3000147394225);
      doubleArray0[3] = double3;
      double double4 = 0.0;
      doubleArray0[4] = double4;
      double double5 = 0.0;
      doubleArray0[5] = double5;
      double double6 = 0.0;
      doubleArray0[6] = double6;
      double double7 = 1161.0625912866449;
      doubleArray0[7] = double7;
      TDoubleArrayList tDoubleArrayList0 = TDoubleArrayList.wrap(doubleArray0);
      TSynchronizedDoubleList tSynchronizedDoubleList0 = new TSynchronizedDoubleList((TDoubleList) tDoubleArrayList0);
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator((TDoubleList) tSynchronizedDoubleList0);
      int int0 = 0;
      // Undeclared exception!
      try {
        tDoubleListDecorator0.add(int0, (Double) double0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can not grow ArrayList wrapped external array
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList();
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator((TDoubleList) tDoubleArrayList0);
      int int0 = (-1431);
      int int1 = 0;
      // Undeclared exception!
      try {
        tDoubleListDecorator0.subList(int0, int1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex = -1431
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = (-1117.2607685784183);
      doubleArray0[0] = double0;
      double double1 = 0.0;
      doubleArray0[1] = double1;
      double double2 = 0.0;
      doubleArray0[2] = double2;
      double double3 = 0.0;
      doubleArray0[3] = double3;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      TDoubleProcedure tDoubleProcedure0 = null;
      // Undeclared exception!
      try {
        tDoubleArrayList0.inverseGrep(tDoubleProcedure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 365;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(int0);
      TUnmodifiableDoubleList tUnmodifiableDoubleList0 = new TUnmodifiableDoubleList((TDoubleList) tDoubleArrayList0);
      int int1 = Integer.MAX_VALUE;
      // Undeclared exception!
      try {
        tUnmodifiableDoubleList0.subList(int0, int1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // end index < 365
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      // Undeclared exception!
      try {
        tDoubleListDecorator0.toArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      double[] doubleArray0 = new double[2];
      double double0 = 0.0;
      doubleArray0[0] = double0;
      double double1 = 885.189523307562;
      doubleArray0[1] = double1;
      TDoubleArrayList tDoubleArrayList0 = TDoubleArrayList.wrap(doubleArray0);
      // Undeclared exception!
      try {
        tDoubleListDecorator0.lastIndexOf((Object) tDoubleArrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 0;
      double double0 = (-299.6881767252087);
      Double double1 = new Double(double0);
      // Undeclared exception!
      try {
        tDoubleListDecorator0.add(double1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      TDoubleArrayList[] tDoubleArrayListArray0 = new TDoubleArrayList[3];
      double double0 = 1.0;
      TDoubleLinkedList tDoubleLinkedList0 = new TDoubleLinkedList(double0);
      int int0 = 1;
      int int1 = 31;
      // Undeclared exception!
      try {
        tDoubleLinkedList0.subList(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin index 1 greater than last index 0
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      // Undeclared exception!
      try {
        tDoubleListDecorator0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      int int0 = 1;
      tDoubleListDecorator0.iterator();
      // Undeclared exception!
      try {
        tDoubleListDecorator0.listIterator(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      TDoubleListDecorator tDoubleListDecorator0 = new TDoubleListDecorator();
      Double[] doubleArray0 = new Double[4];
      double double0 = 0.0;
      Double double1 = new Double(double0);
      doubleArray0[0] = double1;
      double double2 = 355.4747398704461;
      Double double3 = new Double(double2);
      doubleArray0[1] = double3;
      int int0 = 0;
      // Undeclared exception!
      try {
        tDoubleListDecorator0.set(int0, double3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
