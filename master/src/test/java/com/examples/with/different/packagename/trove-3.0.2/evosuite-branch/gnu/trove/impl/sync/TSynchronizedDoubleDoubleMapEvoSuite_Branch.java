/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TDoubleFunction;
import gnu.trove.impl.sync.TSynchronizedDoubleCollection;
import gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap;
import gnu.trove.impl.sync.TSynchronizedDoubleSet;
import gnu.trove.map.TDoubleDoubleMap;
import gnu.trove.map.hash.TDoubleDoubleHashMap;
import gnu.trove.procedure.TDoubleDoubleProcedure;
import gnu.trove.procedure.TDoubleProcedure;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedDoubleDoubleMapEvoSuite_Branch {

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
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.clear()V: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.<init>(Lgnu/trove/map/TDoubleDoubleMap;)V: I17 Branch 1 IFNONNULL L59 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      tSynchronizedDoubleDoubleMap0.clear();
      assertEquals(0, tSynchronizedDoubleDoubleMap0.size());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.putAll(Ljava/util/Map;)V: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.<init>(Lgnu/trove/map/TDoubleDoubleMap;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(doubleArray0, doubleArray0);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "");
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      tSynchronizedDoubleDoubleMap0.putAll((Map<? extends Double, ? extends Double>) hashMap0);
      assertEquals(1, tSynchronizedDoubleDoubleMap0.size());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.get(D)D: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      double double0 = tSynchronizedDoubleDoubleMap0.get((double) 1880);
      assertEquals(1880.0, double0, 0.01D);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.putIfAbsent(DD)D: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      tSynchronizedDoubleDoubleMap0.putIfAbsent(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      assertEquals(1, tDoubleDoubleHashMap0.size());
      assertEquals(1, tSynchronizedDoubleDoubleMap0.size());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.forEachKey((TDoubleProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.getNoEntryValue()D: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.size()I: root-Branch
   * 3 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.equals(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.equals((Object) tSynchronizedDoubleDoubleMap0);
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.retainEntries(Lgnu/trove/procedure/TDoubleDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(doubleArray0, doubleArray0);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      // Undeclared exception!
      try {
        tSynchronizedDoubleDoubleMap0.retainEntries((TDoubleDoubleProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.values([D)[D: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      double[] doubleArray0 = tSynchronizedDoubleDoubleMap0.values(tDoubleDoubleHashMap0._set);
      assertNotNull(doubleArray0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.containsValue(D)Z: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(doubleArray0, doubleArray0);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.containsValue(16.11546097899675);
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.put(DD)D: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      tSynchronizedDoubleDoubleMap0.put(Double.NEGATIVE_INFINITY, 0.0);
      assertEquals(1, tDoubleDoubleHashMap0.size());
      assertEquals("{-Infinity=0.0}", tDoubleDoubleHashMap0.toString());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.forEachEntry(Lgnu/trove/procedure/TDoubleDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(64);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) null);
      // Undeclared exception!
      try {
        tSynchronizedDoubleDoubleMap0.forEachEntry((TDoubleDoubleProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.increment(D)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.increment((double) 1880);
      assertEquals(false, boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(doubleArray0, doubleArray0);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "");
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.isEmpty();
      assertEquals(false, boolean0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.values()[D: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap((-27));
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "/");
      double[] doubleArray0 = tSynchronizedDoubleDoubleMap0.values();
      assertNotNull(doubleArray0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.hashCode()I: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      int int0 = tSynchronizedDoubleDoubleMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.putAll(Lgnu/trove/map/TDoubleDoubleMap;)V: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.iterator()Lgnu/trove/iterator/TDoubleDoubleIterator;: root-Branch
   * 3 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.size()I: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      tSynchronizedDoubleDoubleMap0.putAll((TDoubleDoubleMap) tSynchronizedDoubleDoubleMap0);
      assertEquals(1880.0, tSynchronizedDoubleDoubleMap0.getNoEntryValue(), 0.01D);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap((-27));
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "/");
      tSynchronizedDoubleDoubleMap0.transformValues((TDoubleFunction) null);
      assertEquals(0.0, tSynchronizedDoubleDoubleMap0.getNoEntryValue(), 0.01D);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(doubleArray0, doubleArray0);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      String string0 = tSynchronizedDoubleDoubleMap0.toString();
      assertEquals("{0.0=0.0}", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.keys()[D: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap((-27));
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "/");
      double[] doubleArray0 = tSynchronizedDoubleDoubleMap0.keys();
      assertNotNull(doubleArray0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.remove(D)D: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      double double0 = tSynchronizedDoubleDoubleMap0.remove((double) 0);
      assertEquals(1880.0, double0, 0.01D);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap((-27));
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "/");
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.forEachValue((TDoubleProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.adjustValue(DD)Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.adjustValue(Double.NEGATIVE_INFINITY, 0.0);
      assertEquals(false, boolean0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.containsKey(D)Z: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(1880, 1880, 1880, 1880);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      boolean boolean0 = tSynchronizedDoubleDoubleMap0.containsKey((double) 1880);
      assertEquals(false, boolean0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.adjustOrPutValue(DDD)D: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      double double0 = tSynchronizedDoubleDoubleMap0.adjustOrPutValue(0.0, 0.0, Double.NEGATIVE_INFINITY);
      assertEquals(1, tDoubleDoubleHashMap0.size());
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01D);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.keys([D)[D: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap(doubleArray0, doubleArray0);
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      double[] doubleArray1 = tSynchronizedDoubleDoubleMap0.keys(doubleArray0);
      assertSame(doubleArray0, doubleArray1);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.getNoEntryKey()D: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      double double0 = tSynchronizedDoubleDoubleMap0.getNoEntryKey();
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.<init>(Lgnu/trove/map/TDoubleDoubleMap;)V: I17 Branch 1 IFNONNULL L59 - false
   */

  @Test
  public void test26()  throws Throwable  {
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = null;
      try {
        tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 27
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.keySet()Lgnu/trove/set/TDoubleSet;: I11 Branch 2 IFNONNULL L107 - true
   * 2 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.keySet()Lgnu/trove/set/TDoubleSet;: I11 Branch 2 IFNONNULL L107 - false
   * 3 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.<init>(Lgnu/trove/map/TDoubleDoubleMap;)V: I17 Branch 1 IFNONNULL L59 - true
   */

  @Test
  public void test27()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap();
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0);
      TSynchronizedDoubleSet tSynchronizedDoubleSet0 = (TSynchronizedDoubleSet)tSynchronizedDoubleDoubleMap0.keySet();
      assertNotNull(tSynchronizedDoubleSet0);
      
      TSynchronizedDoubleSet tSynchronizedDoubleSet1 = (TSynchronizedDoubleSet)tSynchronizedDoubleDoubleMap0.keySet();
      assertSame(tSynchronizedDoubleSet1, tSynchronizedDoubleSet0);
  }

  //Test case number: 28
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;: I11 Branch 3 IFNONNULL L121 - true
   * 2 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;: I11 Branch 3 IFNONNULL L121 - false
   * 3 gnu.trove.impl.sync.TSynchronizedDoubleDoubleMap.<init>(Lgnu/trove/map/TDoubleDoubleMap;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      TDoubleDoubleHashMap tDoubleDoubleHashMap0 = new TDoubleDoubleHashMap((-27));
      TSynchronizedDoubleDoubleMap tSynchronizedDoubleDoubleMap0 = new TSynchronizedDoubleDoubleMap((TDoubleDoubleMap) tDoubleDoubleHashMap0, (Object) "/");
      TSynchronizedDoubleCollection tSynchronizedDoubleCollection0 = (TSynchronizedDoubleCollection)tSynchronizedDoubleDoubleMap0.valueCollection();
      assertNotNull(tSynchronizedDoubleCollection0);
      
      TSynchronizedDoubleCollection tSynchronizedDoubleCollection1 = (TSynchronizedDoubleCollection)tSynchronizedDoubleDoubleMap0.valueCollection();
      assertSame(tSynchronizedDoubleCollection1, tSynchronizedDoubleCollection0);
  }
}
