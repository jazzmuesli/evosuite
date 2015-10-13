/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TLongFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap;
import gnu.trove.iterator.TObjectLongIterator;
import gnu.trove.map.TObjectLongMap;
import gnu.trove.map.custom_hash.TObjectLongCustomHashMap;
import gnu.trove.map.hash.TObjectLongHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.strategy.HashingStrategy;
import gnu.trove.strategy.IdentityHashingStrategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableObjectLongMapEvoSuite_Branch {

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
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableObjectLongMap;)V: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.iterator()Lgnu/trove/iterator/TObjectLongIterator;: root-Branch
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.<init>(Lgnu/trove/map/TObjectLongMap;)V: I17 Branch 1 IFNONNULL L53 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TObjectLongCustomHashMap<Object> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Object>();
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongCustomHashMap0);
      TObjectLongIterator<Object> tObjectLongIterator0 = tUnmodifiableObjectLongMap0.iterator();
      assertEquals(false, tObjectLongIterator0.hasNext());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.remove(Ljava/lang/Object;)J: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>((-1289));
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.remove((Object) (-1289));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>();
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      String string0 = tUnmodifiableObjectLongMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.put(Ljava/lang/Object;J)J: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>();
      TObjectLongCustomHashMap<Long> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Long>((HashingStrategy<? super Long>) identityHashingStrategy0, (TObjectLongMap<? extends Long>) tObjectLongHashMap0);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongCustomHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.put((Long) 1L, 1L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.forEachEntry(Lgnu/trove/procedure/TObjectLongProcedure;)Z: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<String> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0, 1794, (float) 1794, 1794L);
      TUnmodifiableObjectLongMap<String> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<String>((TObjectLongMap<String>) tObjectLongCustomHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.forEachEntry((TObjectLongProcedure<? super String>) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.forEachValue(Lgnu/trove/procedure/TLongProcedure;)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>(0, 0);
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.forEachValue((TLongProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.values([J)[J: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Integer> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Integer>((HashingStrategy<? super Integer>) identityHashingStrategy0, (-1));
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongCustomHashMap0);
      long[] longArray0 = new long[2];
      long[] longArray1 = tUnmodifiableObjectLongMap0.values(longArray0);
      assertSame(longArray0, longArray1);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.containsValue(J)Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>((-1), (-1));
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.containsValue((long) (-1));
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>((-7));
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      HashMap<Long, Long> hashMap0 = new HashMap<Long, Long>();
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.putAll((Map<?, ? extends Long>) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.values()[J: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Long> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Long>((HashingStrategy<? super Long>) identityHashingStrategy0, 1550);
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>((TObjectLongMap<? extends Long>) tObjectLongCustomHashMap0);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      long[] longArray0 = tUnmodifiableObjectLongMap0.values();
      assertNotNull(longArray0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>();
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.putIfAbsent(Ljava/lang/Object;J)J: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TObjectLongHashMap<Integer> tObjectLongHashMap0 = new TObjectLongHashMap<Integer>();
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.putIfAbsent((Integer) 0, (long) 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.increment(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Long> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Long>((HashingStrategy<? super Long>) identityHashingStrategy0, 934, (float) 19L);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongCustomHashMap0);
      Long long0 = new Long(19L);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.increment(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.adjustOrPutValue(Ljava/lang/Object;JJ)J: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TObjectLongHashMap<Integer> tObjectLongHashMap0 = new TObjectLongHashMap<Integer>(0, 0);
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.adjustOrPutValue((Integer) 0, (long) 0, (long) 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.retainEntries(Lgnu/trove/procedure/TObjectLongProcedure;)Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>(1348, 1348);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.retainEntries((TObjectLongProcedure<? super Long>) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.clear()V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Long> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Long>((HashingStrategy<? super Long>) identityHashingStrategy0, 1550);
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>((TObjectLongMap<? extends Long>) tObjectLongCustomHashMap0);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.keys([Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>((-1), (-1));
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      Object[] objectArray0 = tUnmodifiableObjectLongMap0.keys(tObjectLongHashMap0._set);
      assertNotNull(objectArray0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.size()I: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TObjectLongHashMap<Integer> tObjectLongHashMap0 = new TObjectLongHashMap<Integer>();
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongHashMap0);
      int int0 = tUnmodifiableObjectLongMap0.size();
      assertEquals(0, int0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.getNoEntryValue()J: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>((-7));
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      long long0 = tUnmodifiableObjectLongMap0.getNoEntryValue();
      assertEquals(0L, long0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.transformValues(Lgnu/trove/function/TLongFunction;)V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>(0, 0, 0);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.transformValues((TLongFunction) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.containsKey(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>();
      TObjectLongCustomHashMap<Long> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Long>((HashingStrategy<? super Long>) identityHashingStrategy0, (TObjectLongMap<? extends Long>) tObjectLongHashMap0);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongCustomHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.containsKey((Object) "{}");
      assertEquals(false, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.adjustValue(Ljava/lang/Object;J)Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TObjectLongHashMap<Integer> tObjectLongHashMap0 = new TObjectLongHashMap<Integer>((-1055));
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.adjustValue((Integer) (-1055), (long) (-1055));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.hashCode()I: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Integer> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Integer>((HashingStrategy<? super Integer>) identityHashingStrategy0, (-1), (float) (-1));
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongCustomHashMap0);
      int int0 = tUnmodifiableObjectLongMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Integer> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Integer>((HashingStrategy<? super Integer>) identityHashingStrategy0, (-1), (float) (-1));
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongCustomHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.forEachKey((TObjectProcedure<? super Integer>) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.get(Ljava/lang/Object;)J: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>(1794, 1794, 1794);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      long long0 = tUnmodifiableObjectLongMap0.get((Object) "\u6CD5\u6587");
      assertEquals(1794L, long0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.keys()[Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>();
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      Object[] objectArray0 = tUnmodifiableObjectLongMap0.keys();
      assertNotNull(objectArray0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.putAll(Lgnu/trove/map/TObjectLongMap;)V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>((-1), (-1));
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Integer> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Integer>((HashingStrategy<? super Integer>) identityHashingStrategy0, (-1), (float) (-1));
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap1 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongCustomHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectLongMap0.putAll((TObjectLongMap<?>) tUnmodifiableObjectLongMap1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.<init>(Lgnu/trove/map/TObjectLongMap;)V: I17 Branch 1 IFNONNULL L53 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = null;
      try {
        tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.keySet()Ljava/util/Set;: I4 Branch 2 IFNONNULL L74 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.keySet()Ljava/util/Set;: I4 Branch 2 IFNONNULL L74 - false
   */

  @Test
  public void test28()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<Long> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Long>((HashingStrategy<? super Long>) identityHashingStrategy0, 1550);
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>((TObjectLongMap<? extends Long>) tObjectLongCustomHashMap0);
      TUnmodifiableObjectLongMap<Long> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      Set<Long> set0 = tUnmodifiableObjectLongMap0.keySet();
      assertNotNull(set0);
      
      Set<Long> set1 = tUnmodifiableObjectLongMap0.keySet();
      assertSame(set1, set0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.valueCollection()Lgnu/trove/TLongCollection;: I4 Branch 3 IFNONNULL L82 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.valueCollection()Lgnu/trove/TLongCollection;: I4 Branch 3 IFNONNULL L82 - false
   */

  @Test
  public void test29()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>();
      TUnmodifiableObjectLongMap<Object> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      TUnmodifiableLongCollection tUnmodifiableLongCollection0 = (TUnmodifiableLongCollection)tUnmodifiableObjectLongMap0.valueCollection();
      assertNotNull(tUnmodifiableLongCollection0);
      
      TUnmodifiableLongCollection tUnmodifiableLongCollection1 = (TUnmodifiableLongCollection)tUnmodifiableObjectLongMap0.valueCollection();
      assertSame(tUnmodifiableLongCollection1, tUnmodifiableLongCollection0);
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L89 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L89 - false
   */

  @Test
  public void test30()  throws Throwable  {
      TObjectLongHashMap<Integer> tObjectLongHashMap0 = new TObjectLongHashMap<Integer>((-1289));
      TUnmodifiableObjectLongMap<Integer> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<Integer>((TObjectLongMap<Integer>) tObjectLongHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.equals((Object) tObjectLongHashMap0);
      assertEquals(true, boolean0);
  }

  //Test case number: 31
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L89 - false
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L89 - true
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableObjectLongMap.<init>(Lgnu/trove/map/TObjectLongMap;)V: I17 Branch 1 IFNONNULL L53 - true
   */

  @Test
  public void test31()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectLongCustomHashMap<String> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0, 1794, (float) 1794, 1794L);
      TUnmodifiableObjectLongMap<String> tUnmodifiableObjectLongMap0 = new TUnmodifiableObjectLongMap<String>((TObjectLongMap<String>) tObjectLongCustomHashMap0);
      boolean boolean0 = tUnmodifiableObjectLongMap0.equals((Object) "\u6CD5\u6587");
      assertEquals(false, boolean0);
  }
}
