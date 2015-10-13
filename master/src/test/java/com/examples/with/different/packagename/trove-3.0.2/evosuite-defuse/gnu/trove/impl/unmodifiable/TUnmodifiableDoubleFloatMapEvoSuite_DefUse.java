/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleSet;
import gnu.trove.impl.unmodifiable.TUnmodifiableFloatCollection;
import gnu.trove.map.TDoubleFloatMap;
import gnu.trove.map.hash.TDoubleFloatHashMap;
import gnu.trove.procedure.TDoubleFloatProcedure;
import gnu.trove.procedure.TDoubleProcedure;
import gnu.trove.procedure.TFloatProcedure;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableDoubleFloatMapEvoSuite_DefUse {

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
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 8 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in size()I.3 root-Branch Line 63
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 41 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in size()I.4 root-Branch Line 63
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.size()I: root-Branch
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TDoubleFloatMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TDoubleFloatMap;)V_LV_1" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.27 Branch 1t Line 60
   * 5 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TDoubleFloatMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TDoubleFloatMap;)V_LV_1" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.16 root-Branch Line 58
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.<init>(Lgnu/trove/map/TDoubleFloatMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      int int0 = tUnmodifiableDoubleFloatMap0.size();
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 9 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in isEmpty()Z.3 root-Branch Line 64
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 50 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in isEmpty()Z.4 root-Branch Line 64
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      float[] floatArray0 = new float[2];
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(doubleArray0, floatArray0);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.isEmpty();
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 62 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in containsKey(D)Z.5 root-Branch Line 65
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 10 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in containsKey(D)Z.3 root-Branch Line 65
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsKey(D)Z
	Use 11 for Parameter-Variable "containsKey(D)Z_LV_1" in containsKey(D)Z.4 root-Branch Line 65
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.containsKey(D)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      float[] floatArray0 = new float[2];
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(doubleArray0, floatArray0);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.containsKey((double) (-970.5484F));
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 12 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in containsValue(F)Z.3 root-Branch Line 66
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 59 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in containsValue(F)Z.5 root-Branch Line 66
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsValue(F)Z
	Use 13 for Parameter-Variable "containsValue(F)Z_LV_1" in containsValue(F)Z.4 root-Branch Line 66
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.containsValue(F)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      float[] floatArray0 = new float[2];
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(doubleArray0, floatArray0);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.containsValue(0.0F);
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 57 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in get(D)F.5 root-Branch Line 67
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 14 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in get(D)F.3 root-Branch Line 67
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method get(D)F
	Use 15 for Parameter-Variable "get(D)F_LV_1" in get(D)F.4 root-Branch Line 67
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.get(D)F: root-Branch
   */

//   @Test
//   public void test4()  throws Throwable  {
//       TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
//       TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
//       float float0 = tUnmodifiableDoubleFloatMap0.get(0.0);
//       assertEquals(0.0F, float0, 0.01F);
//   }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 19 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in keys()[D.3 root-Branch Line 83
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 61 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in keys()[D.4 root-Branch Line 83
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.keys()[D: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      double[] doubleArray0 = tUnmodifiableDoubleFloatMap0.keys();
      assertNotNull(doubleArray0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 20 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in keys([D)[D.3 root-Branch Line 84
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 46 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in keys([D)[D.5 root-Branch Line 84
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method keys([D)[D
	Use 21 for Parameter-Variable "keys([D)[D_LV_1" in keys([D)[D.4 root-Branch Line 84
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.keys([D)[D: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(51, 51);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      double[] doubleArray0 = tUnmodifiableDoubleFloatMap0.keys(tDoubleFloatHashMap0._set);
      assertNotNull(doubleArray0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 52 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in values()[F.4 root-Branch Line 91
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 25 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in values()[F.3 root-Branch Line 91
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.values()[F: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      float[] floatArray0 = tUnmodifiableDoubleFloatMap0.values();
      assertNotNull(floatArray0);
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 54 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in values([F)[F.5 root-Branch Line 92
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 26 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in values([F)[F.3 root-Branch Line 92
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method values([F)[F
	Use 27 for Parameter-Variable "values([F)[F_LV_1" in values([F)[F.4 root-Branch Line 92
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.values([F)[F: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      float[] floatArray0 = new float[2];
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(doubleArray0, floatArray0);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      float[] floatArray1 = new float[4];
      float[] floatArray2 = tUnmodifiableDoubleFloatMap0.values(floatArray1);
      assertSame(floatArray1, floatArray2);
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 29 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in equals(Ljava/lang/Object;)Z.6 Branch 4f Line 94
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 51 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in equals(Ljava/lang/Object;)Z.8 Branch 4f Line 94
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 30 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.7 Branch 4f Line 94
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 28 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.2 root-Branch Line 94
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   */

  @Test
  public void test9()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.equals((Object) "\u4E2D\u6587 (\u53F0\u7063)");
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 31 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in hashCode()I.3 root-Branch Line 95
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 45 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in hashCode()I.4 root-Branch Line 95
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.hashCode()I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      float[] floatArray0 = new float[2];
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(doubleArray0, floatArray0);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      int int0 = tUnmodifiableDoubleFloatMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 60 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in toString()Ljava/lang/String;.4 root-Branch Line 96
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 32 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in toString()Ljava/lang/String;.3 root-Branch Line 96
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      String string0 = tUnmodifiableDoubleFloatMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 63 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in getNoEntryKey()D.4 root-Branch Line 97
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 33 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in getNoEntryKey()D.3 root-Branch Line 97
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.getNoEntryKey()D: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      double double0 = tUnmodifiableDoubleFloatMap0.getNoEntryKey();
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 58 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in getNoEntryValue()F.4 root-Branch Line 98
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 34 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in getNoEntryValue()F.3 root-Branch Line 98
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.getNoEntryValue()F: root-Branch
   */

//   @Test
//   public void test13()  throws Throwable  {
//       TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
//       TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
//       float float0 = tUnmodifiableDoubleFloatMap0.getNoEntryValue();
//       assertEquals(0.0F, float0, 0.01F);
//   }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 43 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z.5 root-Branch Line 101
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 35 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z.3 root-Branch Line 101
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z
	Use 36 for Parameter-Variable "forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z_LV_1" in forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z.4 root-Branch Line 101
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.forEachKey((TDoubleProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 37 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in forEachValue(Lgnu/trove/procedure/TFloatProcedure;)Z.3 root-Branch Line 104
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 42 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in forEachValue(Lgnu/trove/procedure/TFloatProcedure;)Z.5 root-Branch Line 104
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachValue(Lgnu/trove/procedure/TFloatProcedure;)Z
	Use 38 for Parameter-Variable "forEachValue(Lgnu/trove/procedure/TFloatProcedure;)Z_LV_1" in forEachValue(Lgnu/trove/procedure/TFloatProcedure;)Z.4 root-Branch Line 104
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.forEachValue(Lgnu/trove/procedure/TFloatProcedure;)Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.forEachValue((TFloatProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 48 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in forEachEntry(Lgnu/trove/procedure/TDoubleFloatProcedure;)Z.5 root-Branch Line 107
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 39 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in forEachEntry(Lgnu/trove/procedure/TDoubleFloatProcedure;)Z.3 root-Branch Line 107
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachEntry(Lgnu/trove/procedure/TDoubleFloatProcedure;)Z
	Use 40 for Parameter-Variable "forEachEntry(Lgnu/trove/procedure/TDoubleFloatProcedure;)Z_LV_1" in forEachEntry(Lgnu/trove/procedure/TDoubleFloatProcedure;)Z.4 root-Branch Line 107
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.forEachEntry(Lgnu/trove/procedure/TDoubleFloatProcedure;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      boolean boolean0 = tUnmodifiableDoubleFloatMap0.forEachEntry((TDoubleFloatProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 7 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.keySet" in keySet()Lgnu/trove/set/TDoubleSet;.12 Branch 2f Line 80
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.keySet" in keySet()Lgnu/trove/set/TDoubleSet;.3 root-Branch Line 79
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.keySet()Lgnu/trove/set/TDoubleSet;: I4 Branch 2 IFNONNULL L79 - true
   * 3 INTRA_METHOD-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.keySet" in keySet()Lgnu/trove/set/TDoubleSet;.12 Branch 2f Line 80
	Use 18 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.keySet" in keySet()Lgnu/trove/set/TDoubleSet;.16 root-Branch Line 81
   * 4 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 17 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in keySet()Lgnu/trove/set/TDoubleSet;.9 Branch 2f Line 80
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 2 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.keySet" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.8 root-Branch Line 75
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.keySet" in keySet()Lgnu/trove/set/TDoubleSet;.3 root-Branch Line 79
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 55 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in keySet()Lgnu/trove/set/TDoubleSet;.10 Branch 2f Line 80
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.keySet()Lgnu/trove/set/TDoubleSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test17()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap(51, 51);
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      TUnmodifiableDoubleSet tUnmodifiableDoubleSet0 = (TUnmodifiableDoubleSet)tUnmodifiableDoubleFloatMap0.keySet();
      assertNotNull(tUnmodifiableDoubleSet0);
      
      TUnmodifiableDoubleSet tUnmodifiableDoubleSet1 = (TUnmodifiableDoubleSet)tUnmodifiableDoubleFloatMap0.keySet();
      assertSame(tUnmodifiableDoubleSet1, tUnmodifiableDoubleSet0);
  }

  //Test case number: 18
  /*
   * 9 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.values" in valueCollection()Lgnu/trove/TFloatCollection;.12 Branch 3f Line 88
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.values" in valueCollection()Lgnu/trove/TFloatCollection;.3 root-Branch Line 87
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.valueCollection()Lgnu/trove/TFloatCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 3 INTRA_CLASS-Definition-Use-Pair
	Definition 3 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.values" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.13 root-Branch Line 76
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.values" in valueCollection()Lgnu/trove/TFloatCollection;.3 root-Branch Line 87
   * 4 INTRA_METHOD-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.values" in valueCollection()Lgnu/trove/TFloatCollection;.12 Branch 3f Line 88
	Use 24 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.values" in valueCollection()Lgnu/trove/TFloatCollection;.16 root-Branch Line 89
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 49 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in valueCollection()Lgnu/trove/TFloatCollection;.10 Branch 3f Line 88
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.28 Branch 1t Line 60
	Use 23 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableDoubleFloatMap.m" in valueCollection()Lgnu/trove/TFloatCollection;.9 Branch 3f Line 88
   * 7 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TDoubleFloatMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TDoubleFloatMap;)V_LV_1" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.27 Branch 1t Line 60
   * 8 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TDoubleFloatMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TDoubleFloatMap;)V_LV_1" in <init>(Lgnu/trove/map/TDoubleFloatMap;)V.16 root-Branch Line 58
   * 9 gnu.trove.impl.unmodifiable.TUnmodifiableDoubleFloatMap.valueCollection()Lgnu/trove/TFloatCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test18()  throws Throwable  {
      TDoubleFloatHashMap tDoubleFloatHashMap0 = new TDoubleFloatHashMap();
      TUnmodifiableDoubleFloatMap tUnmodifiableDoubleFloatMap0 = new TUnmodifiableDoubleFloatMap((TDoubleFloatMap) tDoubleFloatHashMap0);
      TUnmodifiableFloatCollection tUnmodifiableFloatCollection0 = (TUnmodifiableFloatCollection)tUnmodifiableDoubleFloatMap0.valueCollection();
      assertNotNull(tUnmodifiableFloatCollection0);
      
      TUnmodifiableFloatCollection tUnmodifiableFloatCollection1 = (TUnmodifiableFloatCollection)tUnmodifiableDoubleFloatMap0.valueCollection();
      assertSame(tUnmodifiableFloatCollection1, tUnmodifiableFloatCollection0);
  }
}
