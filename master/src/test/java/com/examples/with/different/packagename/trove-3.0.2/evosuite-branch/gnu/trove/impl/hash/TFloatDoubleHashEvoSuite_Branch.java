/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.hash.TFloatDoubleHashMap;
import gnu.trove.procedure.TFloatProcedure;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TFloatDoubleHashEvoSuite_Branch {

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
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.getNoEntryValue()D: root-Branch
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.setUp(I)I: root-Branch
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.<init>(I)V: root-Branch
   */

//   @Test
//   public void test0()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
//       double double0 = tFloatDoubleHashMap0.getNoEntryValue();
//       assertEquals(0.0, double0, 0.01D);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//   }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.<init>()V: root-Branch
   */

//   @Test
//   public void test1()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap();
//       BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
//       PrintStream printStream0 = new PrintStream((OutputStream) bufferedOutputStream0);
//       ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
//       tFloatDoubleHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//       assertEquals(23, tFloatDoubleHashMap0.capacity());
//   }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.getNoEntryKey()F: root-Branch
   */

//   @Test
//   public void test2()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
//       float float0 = tFloatDoubleHashMap0.getNoEntryKey();
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//       assertEquals(0.0F, float0, 0.01F);
//   }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.<init>(IF)V: root-Branch
   */

//   @Test
//   public void test3()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(8, 8);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//   }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.contains(F)Z: I5 Branch 1 IFLT L178 - true
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I37 Branch 5 IFNE L228 - false
   */

//   @Test
//   public void test4()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
//       boolean boolean0 = tFloatDoubleHashMap0.containsKey((float) (byte)41);
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//       assertEquals(false, boolean0);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//   }

  //Test case number: 5
  /*
   * 9 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.contains(F)Z: I5 Branch 1 IFLT L178 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I46 Branch 6 IF_ICMPNE L231 - false
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I52 Branch 7 IFNE L231 - false
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I30 Branch 13 IFNE L279 - true
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I50 Branch 14 IF_ICMPNE L286 - false
   * 6 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I57 Branch 15 IFNE L286 - false
   * 7 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyAt(IF)V: root-Branch
   * 8 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I30 Branch 13 IFNE L279 - false
   * 9 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I37 Branch 5 IFNE L228 - true
   */

//   @Test
//   public void test5()  throws Throwable  {
//       float[] floatArray0 = new float[6];
//       double[] doubleArray0 = new double[3];
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(floatArray0, doubleArray0);
//       boolean boolean0 = tFloatDoubleHashMap0.containsKey(0.0F);
//       assertEquals("{0.0=0.0}", tFloatDoubleHashMap0.toString());
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//       assertEquals(1, tFloatDoubleHashMap0.size());
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//       assertEquals(true, boolean0);
//   }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I18 Branch 2 IFLE L192 - true
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I18 Branch 2 IFLE L192 - false
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - true
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.<init>()V: root-Branch
   */

//   @Test
//   public void test6()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap();
//       boolean boolean0 = tFloatDoubleHashMap0.forEachKey((TFloatProcedure) null);
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//       assertEquals(true, boolean0);
//       assertEquals(23, tFloatDoubleHashMap0.capacity());
//   }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.<init>(IFFD)V: root-Branch
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I18 Branch 2 IFLE L192 - false
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - true
   */

  @Test
  public void test7()  throws Throwable  {
      TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(29, 29, 29, 29);
      double[] doubleArray0 = new double[2];
      TFloatDoubleHashMap tFloatDoubleHashMap1 = new TFloatDoubleHashMap(tFloatDoubleHashMap0._set, doubleArray0);
      // Undeclared exception!
      try {
        tFloatDoubleHashMap1.forEach((TFloatProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I52 Branch 7 IFNE L231 - true
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I29 Branch 8 IFGE L245 - true
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I46 Branch 9 IFNE L250 - false
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I46 Branch 6 IF_ICMPNE L231 - false
   */

  @Test
  public void test8()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = 393.9504F;
      double[] doubleArray0 = new double[4];
      TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(floatArray0, doubleArray0);
      boolean boolean0 = tFloatDoubleHashMap0.contains((-5.2896914F));
      assertEquals(2, tFloatDoubleHashMap0.size());
      assertEquals("{393.9504=0.0, 0.0=0.0}", tFloatDoubleHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I59 Branch 10 IFNE L254 - true
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I71 Branch 12 IF_ICMPNE L256 - true
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I46 Branch 9 IFNE L250 - false
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I29 Branch 8 IFGE L245 - false
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I46 Branch 9 IFNE L250 - true
   * 6 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I46 Branch 6 IF_ICMPNE L231 - true
   */

//   @Test
//   public void test9()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
//       byte[] byteArray0 = new byte[10];
//       byteArray0[0] = (byte)41;
//       byteArray0[2] = (byte)41;
//       tFloatDoubleHashMap0._states = byteArray0;
//       boolean boolean0 = tFloatDoubleHashMap0.containsKey((float) (byte)41);
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//       assertEquals(false, boolean0);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//   }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I71 Branch 12 IF_ICMPNE L256 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I29 Branch 8 IFGE L245 - true
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I59 Branch 10 IFNE L254 - true
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I71 Branch 12 IF_ICMPNE L256 - true
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.contains(F)Z: I5 Branch 1 IFLT L178 - true
   */

//   @Test
//   public void test10()  throws Throwable  {
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
//       byte[] byteArray0 = new byte[10];
//       byteArray0[0] = (byte)41;
//       byteArray0[1] = (byte)41;
//       byteArray0[2] = (byte)41;
//       tFloatDoubleHashMap0._states = byteArray0;
//       boolean boolean0 = tFloatDoubleHashMap0.containsKey((float) (byte)41);
//       assertEquals(false, boolean0);
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//       assertEquals(0.0, tFloatDoubleHashMap0.getNoEntryValue(), 0.01D);
//   }

  //Test case number: 11
  /*
   * 14 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I28 Branch 16 IF_ICMPNE L306 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I31 Branch 17 IF_ICMPNE L306 - false
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I45 Branch 18 IFGE L310 - true
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I62 Branch 19 IFNE L316 - true
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I67 Branch 20 IF_ICMPEQ L317 - false
   * 6 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I97 Branch 21 IF_ICMPNE L327 - true
   * 7 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I116 Branch 23 IF_ICMPNE L332 - true
   * 8 gnu.trove.impl.hash.TFloatDoubleHash.removeAt(I)V: root-Branch
   * 9 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I59 Branch 10 IFNE L254 - false
   * 10 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I62 Branch 11 IF_ICMPEQ L254 - false
   * 11 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I50 Branch 14 IF_ICMPNE L286 - true
   * 12 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I28 Branch 16 IF_ICMPNE L306 - true
   * 13 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I45 Branch 18 IFGE L310 - false
   * 14 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I62 Branch 19 IFNE L316 - false
   */

  @Test
  public void test11()  throws Throwable  {
      TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)41;
      tFloatDoubleHashMap0.tempDisableAutoCompaction();
      byteArray0[2] = (byte)41;
      tFloatDoubleHashMap0._states = byteArray0;
      tFloatDoubleHashMap0.remove((float) 0);
      tFloatDoubleHashMap0.adjustOrPutValue((float) 0, (double) 0, (double) (byte)41);
      assertEquals("{0.0=41.0}", tFloatDoubleHashMap0.toString());
      assertEquals(0, tFloatDoubleHashMap0.size());
  }

  //Test case number: 12
  /*
   * 5 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I97 Branch 21 IF_ICMPNE L327 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I104 Branch 22 IFNE L327 - true
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I57 Branch 15 IFNE L286 - false
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I57 Branch 15 IFNE L286 - true
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I67 Branch 20 IF_ICMPEQ L317 - true
   */

  @Test
  public void test12()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = 393.9504F;
      double[] doubleArray0 = new double[4];
      TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(floatArray0, doubleArray0);
      double double0 = tFloatDoubleHashMap0.adjustOrPutValue(1212.7434F, 393.9504F, 1212.7434F);
      assertEquals(3, tFloatDoubleHashMap0.size());
      assertEquals(1212.743408203125, double0, 0.01D);
  }

  //Test case number: 13
  /*
   * 7 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I104 Branch 22 IFNE L327 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I30 Branch 13 IFNE L279 - false
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I50 Branch 14 IF_ICMPNE L286 - false
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I57 Branch 15 IFNE L286 - true
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I62 Branch 19 IFNE L316 - false
   * 6 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I67 Branch 20 IF_ICMPEQ L317 - true
   * 7 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I97 Branch 21 IF_ICMPNE L327 - false
   */

//   @Test
//   public void test13()  throws Throwable  {
//       float[] floatArray0 = new float[5];
//       floatArray0[0] = (-1599.8765F);
//       double[] doubleArray0 = new double[5];
//       TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(floatArray0, doubleArray0);
//       assertEquals(2, tFloatDoubleHashMap0.size());
//       assertEquals(0.0F, tFloatDoubleHashMap0.getNoEntryKey(), 0.01F);
//       assertEquals("{0.0=0.0, -1599.8765=0.0}", tFloatDoubleHashMap0.toString());
//   }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I116 Branch 23 IF_ICMPNE L332 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I121 Branch 24 IF_ICMPEQ L336 - true
   */

  @Test
  public void test14()  throws Throwable  {
      TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)41;
      byteArray0[1] = (byte)41;
      byteArray0[2] = (byte)41;
      tFloatDoubleHashMap0._states = byteArray0;
      // Undeclared exception!
      try {
        tFloatDoubleHashMap0.adjustOrPutValue((float) 0, (double) 0, (double) (byte)41);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No free or removed slots available. Key set full?!!
         //
      }
  }

  //Test case number: 15
  /*
   * 22 covered goals:
   * 1 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I121 Branch 24 IF_ICMPEQ L336 - false
   * 2 gnu.trove.impl.hash.TFloatDoubleHash.removeAt(I)V: root-Branch
   * 3 gnu.trove.impl.hash.TFloatDoubleHash.setUp(I)I: root-Branch
   * 4 gnu.trove.impl.hash.TFloatDoubleHash.<init>(I)V: root-Branch
   * 5 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyAt(IF)V: root-Branch
   * 6 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I29 Branch 8 IFGE L245 - false
   * 7 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I46 Branch 9 IFNE L250 - true
   * 8 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I59 Branch 10 IFNE L254 - false
   * 9 gnu.trove.impl.hash.TFloatDoubleHash.indexRehashed(FIIB)I: I62 Branch 11 IF_ICMPEQ L254 - false
   * 10 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I30 Branch 13 IFNE L279 - true
   * 11 gnu.trove.impl.hash.TFloatDoubleHash.insertKey(F)I: I50 Branch 14 IF_ICMPNE L286 - true
   * 12 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I37 Branch 5 IFNE L228 - true
   * 13 gnu.trove.impl.hash.TFloatDoubleHash.index(F)I: I46 Branch 6 IF_ICMPNE L231 - true
   * 14 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I28 Branch 16 IF_ICMPNE L306 - true
   * 15 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I28 Branch 16 IF_ICMPNE L306 - false
   * 16 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I31 Branch 17 IF_ICMPNE L306 - false
   * 17 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I45 Branch 18 IFGE L310 - true
   * 18 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I45 Branch 18 IFGE L310 - false
   * 19 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I62 Branch 19 IFNE L316 - true
   * 20 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I97 Branch 21 IF_ICMPNE L327 - true
   * 21 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I116 Branch 23 IF_ICMPNE L332 - true
   * 22 gnu.trove.impl.hash.TFloatDoubleHash.insertKeyRehash(FIIB)I: I116 Branch 23 IF_ICMPNE L332 - false
   */

  @Test
  public void test15()  throws Throwable  {
      TFloatDoubleHashMap tFloatDoubleHashMap0 = new TFloatDoubleHashMap(0);
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)41;
      byteArray0[1] = (byte)41;
      tFloatDoubleHashMap0.tempDisableAutoCompaction();
      byteArray0[2] = (byte)41;
      tFloatDoubleHashMap0._states = byteArray0;
      tFloatDoubleHashMap0.remove((float) 0);
      double double0 = tFloatDoubleHashMap0.adjustOrPutValue((float) 0, (double) 0, (double) (byte)41);
      assertEquals("{0.0=41.0}", tFloatDoubleHashMap0.toString());
      assertEquals(41.0, double0, 0.01D);
  }
}
