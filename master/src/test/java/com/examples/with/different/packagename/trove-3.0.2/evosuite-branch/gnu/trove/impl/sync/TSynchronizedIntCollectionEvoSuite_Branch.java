/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TIntCollection;
import gnu.trove.impl.sync.TSynchronizedIntCollection;
import gnu.trove.impl.sync.TSynchronizedIntList;
import gnu.trove.impl.sync.TSynchronizedIntSet;
import gnu.trove.impl.sync.TSynchronizedRandomAccessIntList;
import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedIntCollectionEvoSuite_Branch {

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
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedIntCollection.<init>(Lgnu/trove/TIntCollection;)V: I7 Branch 1 IFNONNULL L59 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TIntHashSet tIntHashSet0 = new TIntHashSet(0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntSet0.forEach((TIntProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.clear()V: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedIntCollection.<init>(Lgnu/trove/TIntCollection;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0, (Object) "{}");
      tSynchronizedIntSet0.clear();
      assertEquals("{}", tSynchronizedIntSet0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.removeAll(Ljava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntSet0.removeAll((Collection<?>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntSet0.containsAll((TIntCollection) tIntHashSet0);
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.retainAll(Ljava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntCollection0.retainAll((Collection<?>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.removeAll(Lgnu/trove/TIntCollection;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedIntCollection.iterator()Lgnu/trove/iterator/TIntIterator;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0, (Object) "{}");
      boolean boolean0 = tSynchronizedIntCollection0.removeAll((TIntCollection) tSynchronizedIntSet0);
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.removeAll([I)Z: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntArrayList0);
      int[] intArray0 = new int[10];
      boolean boolean0 = tSynchronizedIntCollection0.removeAll(intArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.addAll([I)Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TIntHashSet tIntHashSet0 = new TIntHashSet(2, 2);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntCollection0.addAll(tIntHashSet0._set);
      assertEquals(false, tIntHashSet0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.addAll(Ljava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TSynchronizedRandomAccessIntList tSynchronizedRandomAccessIntList0 = new TSynchronizedRandomAccessIntList((TIntList) tIntArrayList0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = tSynchronizedRandomAccessIntList0.addAll((Collection<? extends Integer>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.retainAll(Lgnu/trove/TIntCollection;)Z: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TIntHashSet tIntHashSet0 = new TIntHashSet(2, 2);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntCollection0.retainAll((TIntCollection) tIntHashSet0);
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.getNoEntryValue()I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TSynchronizedRandomAccessIntList tSynchronizedRandomAccessIntList0 = new TSynchronizedRandomAccessIntList((TIntList) tIntArrayList0);
      int int0 = tSynchronizedRandomAccessIntList0.getNoEntryValue();
      assertEquals(0, int0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.contains(I)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0, (Object) "{}");
      boolean boolean0 = tSynchronizedIntSet0.contains((-915));
      assertEquals(false, boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.toArray()[I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0);
      int[] intArray0 = tSynchronizedIntSet0.toArray();
      assertNotNull(intArray0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.retainAll([I)Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TIntHashSet tIntHashSet0 = new TIntHashSet(0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntSet0.retainAll(tIntHashSet0._set);
      assertEquals(false, boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.toArray([I)[I: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TIntHashSet tIntHashSet0 = new TIntHashSet((-3), (-3));
      TSynchronizedRandomAccessIntList tSynchronizedRandomAccessIntList0 = new TSynchronizedRandomAccessIntList((TIntList) tIntArrayList0);
      int[] intArray0 = tSynchronizedRandomAccessIntList0.toArray(tIntHashSet0._set);
      assertNotNull(intArray0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      String string0 = tSynchronizedIntCollection0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.addAll(Lgnu/trove/TIntCollection;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedIntCollection.iterator()Lgnu/trove/iterator/TIntIterator;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntCollection0.addAll((TIntCollection) tSynchronizedIntCollection0);
      assertEquals(false, boolean0);
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.isEmpty()Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedIntCollection.<init>(Lgnu/trove/TIntCollection;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0, (Object) "{}");
      boolean boolean0 = tSynchronizedIntSet0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.containsAll([I)Z: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      boolean boolean0 = tSynchronizedIntCollection0.containsAll(tIntHashSet0._set);
      assertEquals(false, boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.size()I: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TIntHashSet tIntHashSet0 = new TIntHashSet((Collection<? extends Integer>) linkedList0);
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntHashSet0);
      int int0 = tSynchronizedIntCollection0.size();
      assertEquals(0, int0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.remove(I)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TSynchronizedIntList tSynchronizedIntList0 = new TSynchronizedIntList((TIntList) tIntArrayList0);
      boolean boolean0 = tSynchronizedIntList0.remove(80);
      assertEquals(false, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.add(I)Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TSynchronizedIntCollection tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) tIntArrayList0);
      boolean boolean0 = tSynchronizedIntCollection0.add(80);
      assertEquals(false, tIntArrayList0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.containsAll(Ljava/util/Collection;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedIntCollection.<init>(Lgnu/trove/TIntCollection;)V: I7 Branch 1 IFNONNULL L59 - true
   */

  @Test
  public void test22()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TSynchronizedRandomAccessIntList tSynchronizedRandomAccessIntList0 = new TSynchronizedRandomAccessIntList((TIntList) tIntArrayList0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = tSynchronizedRandomAccessIntList0.containsAll((Collection<?>) linkedList0);
      assertEquals(true, boolean0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedIntCollection.<init>(Lgnu/trove/TIntCollection;)V: I7 Branch 1 IFNONNULL L59 - false
   */

  @Test
  public void test23()  throws Throwable  {
      TSynchronizedIntCollection tSynchronizedIntCollection0 = null;
      try {
        tSynchronizedIntCollection0 = new TSynchronizedIntCollection((TIntCollection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
