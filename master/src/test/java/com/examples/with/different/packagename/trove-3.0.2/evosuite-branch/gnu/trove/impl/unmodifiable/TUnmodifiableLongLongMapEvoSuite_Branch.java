/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TLongFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongSet;
import gnu.trove.map.TLongLongMap;
import gnu.trove.map.hash.TLongLongHashMap;
import gnu.trove.procedure.TLongLongProcedure;
import gnu.trove.procedure.TLongProcedure;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableLongLongMapEvoSuite_Branch {

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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.adjustOrPutValue(JJJ)J: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.<init>(Lgnu/trove/map/TLongLongMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(317);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.adjustOrPutValue((long) 317, (long) 317, (long) 317);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.forEachValue(Lgnu/trove/procedure/TLongProcedure;)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.forEachValue((TLongProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.retainEntries(Lgnu/trove/procedure/TLongLongProcedure;)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.retainEntries((TLongLongProcedure) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.remove(J)J: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[11];
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(longArray0, longArray0);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.remove(1668L);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.putIfAbsent(JJ)J: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(16, 16);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.putIfAbsent((long) 16, (long) 16);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.forEachKey(Lgnu/trove/procedure/TLongProcedure;)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(1686, 1686);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.forEachKey((TLongProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 7 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.iterator()Lgnu/trove/iterator/TLongLongIterator;: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.size()I: root-Branch
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap$1.value()J: root-Branch
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap$1.key()J: root-Branch
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap$1.advance()V: root-Branch
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap$1.hasNext()Z: root-Branch
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableLongLongMap;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      long[] longArray0 = new long[8];
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(longArray0, longArray0);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap((TLongLongMap) tUnmodifiableLongLongMap0);
      assertEquals(1, tUnmodifiableLongLongMap0.size());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.containsKey(J)Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.containsKey((long) 0);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.adjustValue(JJ)Z: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(630);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.adjustValue((long) 630, (long) 630);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.values([J)[J: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(368, 368);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long[] longArray0 = tUnmodifiableLongLongMap0.values(tLongLongHashMap0._set);
      assertNotNull(longArray0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.getNoEntryKey()J: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(0);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long long0 = tUnmodifiableLongLongMap0.getNoEntryKey();
      assertEquals(0L, long0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.putAll(Lgnu/trove/map/TLongLongMap;)V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.putAll((TLongLongMap) tLongLongHashMap0);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(368, 368);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      HashMap<Long, Long> hashMap0 = new HashMap<Long, Long>();
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.putAll((Map<? extends Long, ? extends Long>) hashMap0);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.containsValue(J)Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.containsValue((-9L));
      assertEquals(false, boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.get(J)J: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(16, 16);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long long0 = tUnmodifiableLongLongMap0.get((long) 16);
      assertEquals(0L, long0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.forEachEntry(Lgnu/trove/procedure/TLongLongProcedure;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.forEachEntry((TLongLongProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.hashCode()I: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      int int0 = tUnmodifiableLongLongMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.keys([J)[J: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long[] longArray0 = tUnmodifiableLongLongMap0.keys(tLongLongHashMap0._set);
      assertNotNull(longArray0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.put(JJ)J: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(1686, 1686);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.put((long) 1686, (long) 1686);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.increment(J)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.increment(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      String string0 = tUnmodifiableLongLongMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.getNoEntryValue()J: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long long0 = tUnmodifiableLongLongMap0.getNoEntryValue();
      assertEquals(0L, long0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.transformValues(Lgnu/trove/function/TLongFunction;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(0);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.transformValues((TLongFunction) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.keys()[J: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(16, 16);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long[] longArray0 = tUnmodifiableLongLongMap0.keys();
      assertNotNull(longArray0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.values()[J: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      long[] longArray0 = tUnmodifiableLongLongMap0.values();
      assertNotNull(longArray0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.clear()V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongLongMap0.clear();
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.<init>(Lgnu/trove/map/TLongLongMap;)V: I17 Branch 1 IFNONNULL L58 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = null;
      try {
        tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) null);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.keySet()Lgnu/trove/set/TLongSet;: I4 Branch 2 IFNONNULL L79 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.keySet()Lgnu/trove/set/TLongSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test28()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      TUnmodifiableLongSet tUnmodifiableLongSet0 = (TUnmodifiableLongSet)tUnmodifiableLongLongMap0.keySet();
      assertNotNull(tUnmodifiableLongSet0);
      
      TUnmodifiableLongSet tUnmodifiableLongSet1 = (TUnmodifiableLongSet)tUnmodifiableLongLongMap0.keySet();
      assertSame(tUnmodifiableLongSet1, tUnmodifiableLongSet0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.valueCollection()Lgnu/trove/TLongCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.valueCollection()Lgnu/trove/TLongCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test29()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(0);
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      TUnmodifiableLongCollection tUnmodifiableLongCollection0 = (TUnmodifiableLongCollection)tUnmodifiableLongLongMap0.valueCollection();
      assertNotNull(tUnmodifiableLongCollection0);
      
      TUnmodifiableLongCollection tUnmodifiableLongCollection1 = (TUnmodifiableLongCollection)tUnmodifiableLongLongMap0.valueCollection();
      assertSame(tUnmodifiableLongCollection1, tUnmodifiableLongCollection0);
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - false
   */

  @Test
  public void test30()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.equals((Object) tLongLongHashMap0);
      assertEquals(true, boolean0);
  }

  //Test case number: 31
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableLongLongMap.<init>(Lgnu/trove/map/TLongLongMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test31()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      TUnmodifiableLongLongMap tUnmodifiableLongLongMap0 = new TUnmodifiableLongLongMap((TLongLongMap) tLongLongHashMap0);
      boolean boolean0 = tUnmodifiableLongLongMap0.equals((Object) (-9L));
      assertEquals(false, boolean0);
  }
}
