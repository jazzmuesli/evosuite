/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteDoubleMap;
import gnu.trove.iterator.TByteDoubleIterator;
import gnu.trove.map.TByteDoubleMap;
import gnu.trove.map.hash.TByteDoubleHashMap;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableByteDoubleMapEvoSuite_Random {

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
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)1;
      byteArray0[0] = byte0;
      byte byte1 = (byte)32;
      byteArray0[1] = byte1;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) byteArray0[1];
      doubleArray0[1] = (double) byteArray0[0];
      doubleArray0[2] = (double) byteArray0[0];
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap((TByteDoubleMap) tByteDoubleHashMap0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap1 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tUnmodifiableByteDoubleMap0);
      byte[] byteArray1 = tUnmodifiableByteDoubleMap1.keys();
      assertNotSame(byteArray0, byteArray1);
  }

  @Test
  public void test1()  throws Throwable  {
      TByteDoubleMap tByteDoubleMap0 = null;
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = null;
      try {
        tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap(tByteDoubleMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)30;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-44);
      byteArray0[2] = byte2;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) byte2;
      doubleArray0[1] = (double) byteArray0[2];
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap((TByteDoubleMap) tByteDoubleHashMap0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      byte byte3 = tUnmodifiableByteDoubleMap0.getNoEntryKey();
      assertTrue(byte3 == byte1);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 0;
      float float0 = 1215.4182F;
      byte byte0 = (byte)101;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, float0, byte0, (double) byte0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap0.putIfAbsent(byte0, (double) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-1113);
      float float0 = 1.0F;
      float float1 = (-1962.0302F);
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)20;
      byteArray0[0] = byte0;
      double[] doubleArray0 = new double[1];
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap();
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      tUnmodifiableByteDoubleMap0.valueCollection();
      double double0 = (-2021.5520159080033);
      doubleArray0[0] = double0;
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap1 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      TByteDoubleHashMap tByteDoubleHashMap2 = new TByteDoubleHashMap(int0, float1);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap2 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap2);
      byte byte1 = (byte)0;
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap2.increment(byte1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 631;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      TByteDoubleIterator tByteDoubleIterator0 = tUnmodifiableByteDoubleMap0.iterator();
      assertEquals(false, tByteDoubleIterator0.hasNext());
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int1, int1);
      TByteDoubleHashMap tByteDoubleHashMap1 = null;
      try {
        tByteDoubleHashMap1 = new TByteDoubleHashMap((TByteDoubleMap) tByteDoubleHashMap0);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-1314);
      float float0 = (-1937.3175F);
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, float0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      Locale locale0 = Locale.KOREA;
      Locale locale1 = null;
      int int1 = 582;
      float float1 = (-255.35522F);
      HashMap<Object, String> hashMap0 = null;
      try {
        hashMap0 = new HashMap<Object, String>(int1, float1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal load factor: -255.35522
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap();
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      double[] doubleArray0 = tUnmodifiableByteDoubleMap0.values();
      assertNotNull(doubleArray0);
      
      int int0 = 0;
      byte byte0 = (byte)54;
      tUnmodifiableByteDoubleMap0.get(byte0);
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap(int0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap1 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      boolean boolean0 = tUnmodifiableByteDoubleMap1.isEmpty();
      assertEquals(true, boolean0);
      
      double[] doubleArray1 = tUnmodifiableByteDoubleMap1.values(doubleArray0);
      assertNotNull(doubleArray1);
      
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap2 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap2.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 0;
      float float0 = (-544.77155F);
      int int1 = (-745);
      float float1 = (-1096.0378F);
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int1, float1);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap((TByteDoubleMap) tUnmodifiableByteDoubleMap0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap1 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      TByteDoubleHashMap tByteDoubleHashMap2 = new TByteDoubleHashMap(int0, float0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap2 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap2);
      boolean boolean0 = tUnmodifiableByteDoubleMap2.isEmpty();
      assertEquals(true, boolean0);
      
      int int2 = (-1635);
      TByteDoubleHashMap tByteDoubleHashMap3 = new TByteDoubleHashMap(int2);
      byte byte0 = (byte)104;
      tByteDoubleHashMap3.increment(byte0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap3 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap3);
      byte byte1 = (byte)0;
      double double0 = 1.0;
      String string0 = tUnmodifiableByteDoubleMap3.toString();
      assertNotNull(string0);
      
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap3.adjustOrPutValue(byte1, double0, (double) byte1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 1270136683;
      float float0 = (-861.11475F);
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-98);
      byteArray0[0] = byte0;
      double[] doubleArray0 = new double[9];
      double double0 = 0.0;
      doubleArray0[0] = double0;
      doubleArray0[1] = (double) int0;
      double double1 = 0.0;
      doubleArray0[2] = double1;
      doubleArray0[3] = (double) byteArray0[0];
      doubleArray0[4] = (double) float0;
      doubleArray0[5] = (double) int0;
      doubleArray0[6] = (double) byte0;
      doubleArray0[7] = (double) float0;
      doubleArray0[8] = (double) float0;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      byte byte1 = (byte)102;
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap0.increment(byte1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap();
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      byte byte0 = (byte)101;
      double double0 = 1471.1183163974833;
      double double1 = 556.0794334666156;
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap0.adjustOrPutValue(byte0, double0, double1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 1;
      float float0 = 0.0F;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(tByteDoubleHashMap0._states);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0);
      int int1 = 1859;
      byte byte0 = (byte) (-23);
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap(int1, (float) int0, byte0, (double) byte0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      byte byte1 = (byte) (-71);
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap0.remove(byte1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1300);
      float float0 = 0.0F;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int1, float0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      byte byte0 = (byte)0;
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap0.increment(byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = (-1944);
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, int0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleHashMap0.valueCollection();
      tUnmodifiableByteDoubleMap0.keySet();
      byte byte0 = (byte) (-67);
      tUnmodifiableByteDoubleMap0.containsKey(byte0);
      double[] doubleArray0 = new double[2];
      String string0 = "}x_K.nW`_5";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 0: }x_K.nW`_5
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = (-1);
      float float0 = 0.5F;
      byte byte0 = (byte)1;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(int0, float0, byte0, (double) int0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteDoubleMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) byte0;
      TByteDoubleHashMap tByteDoubleHashMap0 = new TByteDoubleHashMap(byteArray0, doubleArray0);
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap0 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap0);
      tByteDoubleHashMap0.keySet();
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) byteArray0[1];
      doubleArray1[1] = (double) byte1;
      tUnmodifiableByteDoubleMap0.containsValue(doubleArray0[0]);
      doubleArray1[2] = (double) byteArray0[1];
      doubleArray1[3] = (double) byteArray0[0];
      doubleArray1[4] = (double) byteArray0[0];
      TByteDoubleHashMap tByteDoubleHashMap1 = new TByteDoubleHashMap(byteArray0, doubleArray1);
      tUnmodifiableByteDoubleMap0.isEmpty();
      TUnmodifiableByteDoubleMap tUnmodifiableByteDoubleMap1 = new TUnmodifiableByteDoubleMap((TByteDoubleMap) tByteDoubleHashMap1);
      byte byte2 = tUnmodifiableByteDoubleMap1.getNoEntryKey();
      assertTrue(byte2 == byte0);
  }
}
