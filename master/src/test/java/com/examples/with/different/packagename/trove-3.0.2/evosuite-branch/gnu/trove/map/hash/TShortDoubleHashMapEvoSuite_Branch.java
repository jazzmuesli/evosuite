/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TDoubleCollection;
import gnu.trove.function.TDoubleFunction;
import gnu.trove.map.TShortDoubleMap;
import gnu.trove.map.hash.TShortDoubleHashMap;
import gnu.trove.procedure.TDoubleProcedure;
import gnu.trove.procedure.TShortDoubleProcedure;
import gnu.trove.procedure.TShortProcedure;
import gnu.trove.set.TShortSet;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TShortDoubleHashMapEvoSuite_Branch {

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
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap$TKeyView.<init>(Lgnu/trove/map/hash/TShortDoubleHashMap;)V: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>(IF)V: root-Branch
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.keySet()Lgnu/trove/set/TShortSet;: root-Branch
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.setUp(I)I: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1586), (-1586));
      TShortSet tShortSet0 = tShortDoubleHashMap0.keySet();
      assertEquals(true, tShortSet0.isEmpty());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap$TValueView.<init>(Lgnu/trove/map/hash/TShortDoubleHashMap;)V: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.valueCollection()Lgnu/trove/TDoubleCollection;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1586), (-1586));
      TDoubleCollection tDoubleCollection0 = tShortDoubleHashMap0.valueCollection();
      assertEquals(0.0, tDoubleCollection0.getNoEntryValue(), 0.01D);
  }

  //Test case number: 2
  /*
   * 15 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap$TShortDoubleHashIterator.key()S: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap$TShortDoubleHashIterator.advance()V: root-Branch
   * 3 gnu.trove.map.hash.TShortDoubleHashMap$TShortDoubleHashIterator.value()D: root-Branch
   * 4 gnu.trove.map.hash.TShortDoubleHashMap$TShortDoubleHashIterator.<init>(Lgnu/trove/map/hash/TShortDoubleHashMap;Lgnu/trove/map/hash/TShortDoubleHashMap;)V: root-Branch
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.iterator()Lgnu/trove/iterator/TShortDoubleIterator;: root-Branch
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.put(SD)D: root-Branch
   * 7 gnu.trove.map.hash.TShortDoubleHashMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I10 Branch 34 IFEQ L133 - false
   * 8 gnu.trove.map.hash.TShortDoubleHashMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I38 Branch 35 IFEQ L139 - true
   * 9 gnu.trove.map.hash.TShortDoubleHashMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I52 Branch 36 IFEQ L143 - true
   * 10 gnu.trove.map.hash.TShortDoubleHashMap.putIfAbsent(SD)D: I9 Branch 39 IFGE L205 - true
   * 11 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I12 Branch 40 IFGE L214 - true
   * 12 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I41 Branch 41 IFEQ L221 - false
   * 13 gnu.trove.map.hash.TShortDoubleHashMap.putAll(Lgnu/trove/map/TShortDoubleMap;)V: I15 Branch 43 IFEQ L243 - true
   * 14 gnu.trove.map.hash.TShortDoubleHashMap.putAll(Lgnu/trove/map/TShortDoubleMap;)V: I15 Branch 43 IFEQ L243 - false
   * 15 gnu.trove.map.hash.TShortDoubleHashMap.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      tShortDoubleHashMap0.putIfAbsent((short) (-255), (short) (-255));
      TShortDoubleHashMap tShortDoubleHashMap1 = new TShortDoubleHashMap((TShortDoubleMap) tShortDoubleHashMap0);
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals(23, tShortDoubleHashMap1.capacity());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.containsKey(S)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(24, 24);
      boolean boolean0 = tShortDoubleHashMap0.containsKey((short)634);
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.removeAt(I)V: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>([S[D)V: I24 Branch 33 IF_ICMPGE L119 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.<init>([S[D)V: I24 Branch 33 IF_ICMPGE L119 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I12 Branch 40 IFGE L214 - false
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I41 Branch 41 IFEQ L221 - true
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.remove(S)D: I14 Branch 46 IFLT L276 - false
   */

  @Test
  public void test4()  throws Throwable  {
      short[] shortArray0 = new short[5];
      double[] doubleArray0 = new double[10];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      
      double double0 = tShortDoubleHashMap0.remove((short)0);
      assertEquals(true, tShortDoubleHashMap0.isEmpty());
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.clear()V: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>(IFSD)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(315, (float) 315, (short)0, 0.0);
      tShortDoubleHashMap0.clear();
      assertEquals("{}", tShortDoubleHashMap0.toString());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.increment(S)Z: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.adjustValue(SD)Z: I9 Branch 71 IFGE L477 - false
   */

  @Test
  public void test6()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(315, (float) 315, (short)0, 0.0);
      boolean boolean0 = tShortDoubleHashMap0.increment((short)0);
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z: root-Branch
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>(I)V: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(3802);
      boolean boolean0 = tShortDoubleHashMap0.forEachKey((TShortProcedure) null);
      assertEquals(true, boolean0);
      assertEquals(7643, tShortDoubleHashMap0.capacity());
  }

  //Test case number: 8
  /*
   * 9 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I38 Branch 35 IFEQ L139 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I52 Branch 36 IFEQ L143 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - false
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - true
   * 6 gnu.trove.map.hash.TShortDoubleHashMap$TShortDoubleHashIterator.<init>(Lgnu/trove/map/hash/TShortDoubleHashMap;Lgnu/trove/map/hash/TShortDoubleHashMap;)V: root-Branch
   * 7 gnu.trove.map.hash.TShortDoubleHashMap.iterator()Lgnu/trove/iterator/TShortDoubleIterator;: root-Branch
   * 8 gnu.trove.map.hash.TShortDoubleHashMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I10 Branch 34 IFEQ L133 - false
   * 9 gnu.trove.map.hash.TShortDoubleHashMap.putAll(Lgnu/trove/map/TShortDoubleMap;)V: I15 Branch 43 IFEQ L243 - true
   */

//   @Test
//   public void test8()  throws Throwable  {
//       TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(159, (float) (short) (-211), (short) (-211), (double) 159);
//       TShortDoubleHashMap tShortDoubleHashMap1 = new TShortDoubleHashMap((TShortDoubleMap) tShortDoubleHashMap0);
//       assertEquals(159.0, tShortDoubleHashMap1.getNoEntryValue(), 0.01D);
//       assertEquals(-211, tShortDoubleHashMap1.getNoEntryKey());
//       assertEquals(3, tShortDoubleHashMap1.capacity());
//   }

  //Test case number: 9
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - true
   */

  @Test
  public void test9()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1749), (-1749));
      double double0 = tShortDoubleHashMap0.putIfAbsent((short)1422, (double) 1487);
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.putIfAbsent(SD)D: I9 Branch 39 IFGE L205 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.adjustOrPutValue(SDD)D: I9 Branch 72 IFGE L491 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.adjustOrPutValue(SDD)D: I58 Branch 73 IFEQ L502 - false
   */

  @Test
  public void test10()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      tShortDoubleHashMap0.adjustOrPutValue((short)0, (double) 0, (double) 0);
      double double0 = tShortDoubleHashMap0.putIfAbsent((short)0, (short)0);
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.putAll(Ljava/util/Map;)V: I15 Branch 42 IFEQ L233 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.putAll(Ljava/util/Map;)V: I15 Branch 42 IFEQ L233 - true
   */

  @Test
  public void test11()  throws Throwable  {
      short[] shortArray0 = new short[7];
      double[] doubleArray0 = new double[9];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      HashMap<Short, Double> hashMap0 = new HashMap<Short, Double>();
      hashMap0.put((Short) (short)1422, (Double) 0.0);
      tShortDoubleHashMap0.putAll((Map<? extends Short, ? extends Double>) hashMap0);
      assertEquals("{1422=0.0, 0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(2, tShortDoubleHashMap0.size());
  }

  //Test case number: 12
  /*
   * 8 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.get(S)D: I9 Branch 44 IFGE L253 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 74 IFNE L1184 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 75 IF_ICMPEQ L1188 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - true
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - false
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - true
   * 7 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - false
   * 8 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I85 Branch 78 IFEQ L1200 - true
   */

  @Test
  public void test12()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      tShortDoubleHashMap0.adjustOrPutValue((short)0, (double) 0, (double) 0);
      boolean boolean0 = tShortDoubleHashMap0.equals((Object) tShortDoubleHashMap0);
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.get(S)D: I9 Branch 44 IFGE L253 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I85 Branch 78 IFEQ L1200 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I89 Branch 79 IFEQ L1200 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I93 Branch 80 IFEQ L1200 - true
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - true
   */

  @Test
  public void test13()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      tShortDoubleHashMap0.put((short)1, (short)1);
      TShortDoubleHashMap tShortDoubleHashMap1 = new TShortDoubleHashMap((int) (short)1, (float) (short)1);
      tShortDoubleHashMap1.adjustOrPutValue((short) (-255), (double) (short)1, 0.0);
      boolean boolean0 = tShortDoubleHashMap0.equals((Object) tShortDoubleHashMap1);
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.isEmpty()Z: I5 Branch 45 IF_ICMPNE L268 - true
   */

  @Test
  public void test14()  throws Throwable  {
      short[] shortArray0 = new short[5];
      double[] doubleArray0 = new double[1];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      boolean boolean0 = tShortDoubleHashMap0.isEmpty();
      assertEquals(11, tShortDoubleHashMap0.capacity());
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.isEmpty()Z: I5 Branch 45 IF_ICMPNE L268 - false
   */

  @Test
  public void test15()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      boolean boolean0 = tShortDoubleHashMap0.isEmpty();
      assertEquals(true, boolean0);
      assertEquals(23, tShortDoubleHashMap0.capacity());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.remove(S)D: I14 Branch 46 IFLT L276 - true
   */

  @Test
  public void test16()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(31);
      double double0 = tShortDoubleHashMap0.remove((short)1629);
      assertEquals(67, tShortDoubleHashMap0.capacity());
      assertEquals(true, tShortDoubleHashMap0.isEmpty());
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 17
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.keys()[S: I34 Branch 48 IF_ICMPNE L304 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.keys()[S: I27 Branch 47 IFLE L303 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.keys()[S: I27 Branch 47 IFLE L303 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.keys()[S: I34 Branch 48 IF_ICMPNE L304 - true
   */

  @Test
  public void test17()  throws Throwable  {
      short[] shortArray0 = new short[7];
      double[] doubleArray0 = new double[9];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      short[] shortArray1 = tShortDoubleHashMap0.keys();
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(1, tShortDoubleHashMap0.size());
      assertNotNull(shortArray1);
      assertEquals(23, tShortDoubleHashMap0.capacity());
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
  }

  //Test case number: 18
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.keys([S)[S: I10 Branch 49 IF_ICMPGE L315 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.keys([S)[S: I44 Branch 51 IF_ICMPNE L323 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.keys([S)[S: I10 Branch 49 IF_ICMPGE L315 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.keys([S)[S: I37 Branch 50 IFLE L322 - true
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.keys([S)[S: I37 Branch 50 IFLE L322 - false
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.keys([S)[S: I44 Branch 51 IF_ICMPNE L323 - true
   */

  @Test
  public void test18()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1972));
      short[] shortArray0 = new short[1];
      tShortDoubleHashMap0.put((short)12411, (double) (-1972));
      short[] shortArray1 = tShortDoubleHashMap0.keys(shortArray0);
      double[] doubleArray0 = new double[10];
      TShortDoubleHashMap tShortDoubleHashMap1 = new TShortDoubleHashMap(tShortDoubleHashMap0._set, doubleArray0);
      tShortDoubleHashMap1.keys(shortArray1);
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
      assertEquals("{12411=-1972.0}", tShortDoubleHashMap0.toString());
  }

  //Test case number: 19
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.values()[D: I27 Branch 52 IFLE L343 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.values()[D: I27 Branch 52 IFLE L343 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.values()[D: I34 Branch 53 IF_ICMPNE L344 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.values()[D: I34 Branch 53 IF_ICMPNE L344 - false
   */

  @Test
  public void test19()  throws Throwable  {
      short[] shortArray0 = new short[7];
      double[] doubleArray0 = new double[5];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      double[] doubleArray1 = tShortDoubleHashMap0.values();
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertNotNull(doubleArray1);
      assertEquals(17, tShortDoubleHashMap0.capacity());
  }

  //Test case number: 20
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I10 Branch 54 IF_ICMPGE L355 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I37 Branch 55 IFLE L362 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I37 Branch 55 IFLE L362 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I44 Branch 56 IF_ICMPNE L363 - true
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I44 Branch 56 IF_ICMPNE L363 - false
   */

  @Test
  public void test20()  throws Throwable  {
      short[] shortArray0 = new short[5];
      double[] doubleArray0 = new double[1];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      double[] doubleArray1 = tShortDoubleHashMap0.values(doubleArray0);
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(11, tShortDoubleHashMap0.capacity());
      assertSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertEquals(1, tShortDoubleHashMap0.size());
  }

  //Test case number: 21
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I10 Branch 54 IF_ICMPGE L355 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I37 Branch 55 IFLE L362 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I37 Branch 55 IFLE L362 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I44 Branch 56 IF_ICMPNE L363 - true
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.values([D)[D: I44 Branch 56 IF_ICMPNE L363 - false
   */

  @Test
  public void test21()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[1] = (short) (-1266);
      shortArray0[2] = (short)2036;
      double[] doubleArray0 = new double[5];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      double[] doubleArray1 = new double[2];
      double[] doubleArray2 = tShortDoubleHashMap0.values(doubleArray1);
      assertEquals(17, tShortDoubleHashMap0.capacity());
      assertNotNull(doubleArray2);
      assertEquals("{2036=0.0, -1266=0.0, 0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(3, tShortDoubleHashMap0.size());
  }

  //Test case number: 22
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I25 Branch 58 IF_ICMPNE L377 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I31 Branch 59 IFNE L377 - true
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I18 Branch 57 IFLE L376 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I18 Branch 57 IFLE L376 - false
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I25 Branch 58 IF_ICMPNE L377 - true
   */

  @Test
  public void test22()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      tShortDoubleHashMap0.put((short)1, (short)1);
      boolean boolean0 = tShortDoubleHashMap0.containsValue(349.679584113352);
      assertEquals("{1=1.0}", tShortDoubleHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 23
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I31 Branch 59 IFNE L377 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I18 Branch 57 IFLE L376 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I25 Branch 58 IF_ICMPNE L377 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.containsValue(D)Z: I25 Branch 58 IF_ICMPNE L377 - false
   */

  @Test
  public void test23()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(1390);
      tShortDoubleHashMap0.putIfAbsent((short)814, (short)0);
      boolean boolean0 = tShortDoubleHashMap0.containsValue((double) (short)0);
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: I18 Branch 60 IFLE L407 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: I18 Branch 60 IFLE L407 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: I25 Branch 61 IF_ICMPNE L408 - true
   */

  @Test
  public void test24()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(31);
      boolean boolean0 = tShortDoubleHashMap0.forEachValue((TDoubleProcedure) null);
      assertEquals(67, tShortDoubleHashMap0.capacity());
      assertEquals(true, boolean0);
  }

  //Test case number: 25
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: I25 Branch 61 IF_ICMPNE L408 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: I18 Branch 60 IFLE L407 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: I25 Branch 61 IF_ICMPNE L408 - true
   */

  @Test
  public void test25()  throws Throwable  {
      short[] shortArray0 = new short[1];
      double[] doubleArray0 = new double[4];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      // Undeclared exception!
      try {
        tShortDoubleHashMap0.forEachValue((TDoubleProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 26
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: I18 Branch 66 IFLE L434 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: I18 Branch 66 IFLE L434 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: I25 Branch 67 IF_ICMPNE L435 - true
   */

  @Test
  public void test26()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1586), (-1586));
      tShortDoubleHashMap0.transformValues((TDoubleFunction) null);
      assertEquals(true, tShortDoubleHashMap0.isEmpty());
  }

  //Test case number: 27
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: I25 Branch 67 IF_ICMPNE L435 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: I18 Branch 66 IFLE L434 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.transformValues(Lgnu/trove/function/TDoubleFunction;)V: I25 Branch 67 IF_ICMPNE L435 - true
   */

  @Test
  public void test27()  throws Throwable  {
      short[] shortArray0 = new short[3];
      double[] doubleArray0 = new double[26];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      // Undeclared exception!
      try {
        tShortDoubleHashMap0.transformValues((TDoubleFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 28
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.retainEntries(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I31 Branch 68 IFLE L453 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.retainEntries(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I31 Branch 68 IFLE L453 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.retainEntries(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I38 Branch 69 IF_ICMPNE L454 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.<init>(I)V: root-Branch
   */

  @Test
  public void test28()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(0);
      boolean boolean0 = tShortDoubleHashMap0.retainEntries((TShortDoubleProcedure) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 29
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.retainEntries(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I38 Branch 69 IF_ICMPNE L454 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.retainEntries(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I31 Branch 68 IFLE L453 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.retainEntries(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I38 Branch 69 IF_ICMPNE L454 - true
   */

  @Test
  public void test29()  throws Throwable  {
      short[] shortArray0 = new short[5];
      double[] doubleArray0 = new double[10];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      // Undeclared exception!
      try {
        tShortDoubleHashMap0.retainEntries((TShortDoubleProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.adjustValue(SD)Z: I9 Branch 71 IFGE L477 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.increment(S)Z: root-Branch
   */

  @Test
  public void test30()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(315, (float) 315, (short)0, 0.0);
      tShortDoubleHashMap0.put((short)0, 1.0);
      boolean boolean0 = tShortDoubleHashMap0.increment((short)0);
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 31
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.adjustOrPutValue(SDD)D: I9 Branch 72 IFGE L491 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.adjustOrPutValue(SDD)D: I58 Branch 73 IFEQ L502 - true
   */

  @Test
  public void test31()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(315, (float) 315, (short)0, 0.0);
      tShortDoubleHashMap0.put((short)0, 1.0);
      double double0 = tShortDoubleHashMap0.adjustOrPutValue((short)0, 0.0, 702.8104900716806);
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
      assertEquals(1.0, double0, 0.01D);
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 74 IFNE L1184 - false
   */

  @Test
  public void test32()  throws Throwable  {
      short[] shortArray0 = new short[7];
      double[] doubleArray0 = new double[9];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      boolean boolean0 = tShortDoubleHashMap0.equals((Object) "S\u00FCdkorea");
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals(23, tShortDoubleHashMap0.capacity());
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 75 IF_ICMPEQ L1188 - false
   */

  @Test
  public void test33()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      double[] doubleArray0 = new double[3];
      TShortDoubleHashMap tShortDoubleHashMap1 = new TShortDoubleHashMap(tShortDoubleHashMap0._set, doubleArray0);
      boolean boolean0 = tShortDoubleHashMap0.equals((Object) tShortDoubleHashMap1);
      assertEquals(false, boolean0);
      assertEquals(47, tShortDoubleHashMap1.capacity());
      assertEquals(1, tShortDoubleHashMap1.size());
      assertEquals("{0=0.0}", tShortDoubleHashMap1.toString());
      assertFalse(tShortDoubleHashMap1.equals(tShortDoubleHashMap0));
  }

  //Test case number: 34
  /*
   * 13 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I93 Branch 80 IFEQ L1200 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>(IF)V: root-Branch
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 74 IFNE L1184 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 75 IF_ICMPEQ L1188 - true
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - false
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - true
   * 7 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - false
   * 8 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I85 Branch 78 IFEQ L1200 - false
   * 9 gnu.trove.map.hash.TShortDoubleHashMap.equals(Ljava/lang/Object;)Z: I89 Branch 79 IFEQ L1200 - false
   * 10 gnu.trove.map.hash.TShortDoubleHashMap.get(S)D: I9 Branch 44 IFGE L253 - true
   * 11 gnu.trove.map.hash.TShortDoubleHashMap.putIfAbsent(SD)D: I9 Branch 39 IFGE L205 - true
   * 12 gnu.trove.map.hash.TShortDoubleHashMap.adjustOrPutValue(SDD)D: I9 Branch 72 IFGE L491 - true
   * 13 gnu.trove.map.hash.TShortDoubleHashMap.adjustOrPutValue(SDD)D: I58 Branch 73 IFEQ L502 - false
   */

  @Test
  public void test34()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TShortDoubleHashMap tShortDoubleHashMap1 = new TShortDoubleHashMap(312, 312);
      tShortDoubleHashMap0.putIfAbsent((short) (-255), (short) (-255));
      tShortDoubleHashMap1.adjustOrPutValue((short) (-255), (double) 312, 1922.9601079741092);
      boolean boolean0 = tShortDoubleHashMap0.equals((Object) tShortDoubleHashMap1);
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
      assertEquals(false, boolean0);
  }

  //Test case number: 35
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I18 Branch 81 IFLE L1216 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I18 Branch 81 IFLE L1216 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I25 Branch 82 IF_ICMPNE L1217 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.<init>()V: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      int int0 = tShortDoubleHashMap0.hashCode();
      assertEquals(0, int0);
      assertEquals(23, tShortDoubleHashMap0.capacity());
  }

  //Test case number: 36
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I25 Branch 82 IF_ICMPNE L1217 - false
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.<init>(IFSD)V: root-Branch
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I18 Branch 81 IFLE L1216 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I18 Branch 81 IFLE L1216 - false
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.hashCode()I: I25 Branch 82 IF_ICMPNE L1217 - true
   */

  @Test
  public void test36()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(315, (float) 315, (short)0, 0.0);
      tShortDoubleHashMap0.put((short)0, 1.0);
      int int0 = tShortDoubleHashMap0.hashCode();
      assertEquals(1, tShortDoubleHashMap0.size());
      assertEquals(1072693248, int0);
  }

  //Test case number: 37
  /*
   * 11 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap$1.execute(SD)Z: I4 Branch 115 IFEQ L1233 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap$1.<init>(Lgnu/trove/map/hash/TShortDoubleHashMap;Ljava/lang/StringBuilder;)V: root-Branch
   * 3 gnu.trove.map.hash.TShortDoubleHashMap$1.execute(SD)Z: I4 Branch 115 IFEQ L1233 - false
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.toString()Ljava/lang/String;: root-Branch
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I12 Branch 40 IFGE L214 - false
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I41 Branch 41 IFEQ L221 - true
   * 7 gnu.trove.map.hash.TShortDoubleHashMap.forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I23 Branch 63 IFLE L421 - true
   * 8 gnu.trove.map.hash.TShortDoubleHashMap.forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I23 Branch 63 IFLE L421 - false
   * 9 gnu.trove.map.hash.TShortDoubleHashMap.forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I30 Branch 64 IF_ICMPNE L422 - true
   * 10 gnu.trove.map.hash.TShortDoubleHashMap.forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I30 Branch 64 IF_ICMPNE L422 - false
   * 11 gnu.trove.map.hash.TShortDoubleHashMap.forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: I39 Branch 65 IFNE L422 - true
   */

  @Test
  public void test37()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[1] = (short) (-1266);
      double[] doubleArray0 = new double[5];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      String string0 = tShortDoubleHashMap0.toString();
      assertEquals(2, tShortDoubleHashMap0.size());
      assertEquals("{-1266=0.0, 0=0.0}", string0);
      assertNotNull(string0);
      assertEquals(17, tShortDoubleHashMap0.capacity());
  }

  //Test case number: 38
  /*
   * 10 covered goals:
   * 1 gnu.trove.map.hash.TShortDoubleHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I25 Branch 83 IFLE L1259 - true
   * 2 gnu.trove.map.hash.TShortDoubleHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I25 Branch 83 IFLE L1259 - false
   * 3 gnu.trove.map.hash.TShortDoubleHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I33 Branch 84 IF_ICMPNE L1260 - true
   * 4 gnu.trove.map.hash.TShortDoubleHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I33 Branch 84 IF_ICMPNE L1260 - false
   * 5 gnu.trove.map.hash.TShortDoubleHashMap.put(SD)D: root-Branch
   * 6 gnu.trove.map.hash.TShortDoubleHashMap.setUp(I)I: root-Branch
   * 7 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I12 Branch 40 IFGE L214 - true
   * 8 gnu.trove.map.hash.TShortDoubleHashMap.doPut(SDI)D: I41 Branch 41 IFEQ L221 - false
   * 9 gnu.trove.map.hash.TShortDoubleHashMap.<init>([S[D)V: I24 Branch 33 IF_ICMPGE L119 - true
   * 10 gnu.trove.map.hash.TShortDoubleHashMap.<init>([S[D)V: I24 Branch 33 IF_ICMPGE L119 - false
   */

  @Test
  public void test38()  throws Throwable  {
      short[] shortArray0 = new short[5];
      double[] doubleArray0 = new double[1];
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(shortArray0, doubleArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      PrintStream printStream0 = new PrintStream((OutputStream) dataOutputStream0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      tShortDoubleHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(11, tShortDoubleHashMap0.capacity());
      assertEquals("{0=0.0}", tShortDoubleHashMap0.toString());
      assertEquals(false, tShortDoubleHashMap0.isEmpty());
      assertEquals(1, tShortDoubleHashMap0.size());
  }
}
