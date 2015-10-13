/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TFloatCharMap;
import gnu.trove.map.hash.TFloatCharHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.StreamCorruptedException;
import java.util.AbstractMap;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TFloatCharHashMapEvoSuite_Random {

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


//   @Test
//   public void test0()  throws Throwable  {
//       int int0 = (-1);
//       float float0 = (-377.23026F);
//       char char0 = 'l';
//       TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, float0, float0, char0);
//       TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap((TFloatCharMap) tFloatCharHashMap0);
//       tFloatCharHashMap1.containsKey((float) int0);
//       assertEquals('l', tFloatCharHashMap1.getNoEntryValue());
//       assertEquals(3, tFloatCharHashMap1.capacity());
//       assertEquals((-377.23026F), tFloatCharHashMap1.getNoEntryKey(), 0.01F);
//   }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 1319;
      float float0 = 669.07697F;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, float0);
      char char0 = tFloatCharHashMap0.getNoEntryValue();
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap();
      tFloatCharHashMap1.putIfAbsent(float0, char0);
      boolean boolean0 = tFloatCharHashMap0.equals((Object) tFloatCharHashMap1);
      assertEquals(1, tFloatCharHashMap1.size());
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-369);
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0);
      int int1 = tFloatCharHashMap0.hashCode();
      assertEquals(0, int1);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 597;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0);
      float float0 = (-1258.5345F);
      tFloatCharHashMap0.get(float0);
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0);
      float float1 = Float.POSITIVE_INFINITY;
      tFloatCharHashMap0.get(float1);
      float float2 = (-213.68698F);
      // Undeclared exception!
      try {
        tFloatCharHashMap1.setAutoCompactionFactor(float2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -213.68698
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-565);
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, int0);
      boolean boolean0 = true;
      tFloatCharHashMap0.reenableAutoCompaction(boolean0);
      assertEquals("{}", tFloatCharHashMap0.toString());
      assertEquals(3, tFloatCharHashMap0.capacity());
      
      int int1 = 0;
      float float0 = 1143.9935F;
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int1, float0);
      int int2 = 0;
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap(int2, int2);
      float float1 = 1915.3804F;
      tFloatCharHashMap2.containsKey(float1);
      tFloatCharHashMap2.getNoEntryKey();
      float float2 = 0.0F;
      float[] floatArray0 = tFloatCharHashMap1.keys(tFloatCharHashMap2._set);
      assertNotNull(floatArray0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      String string0 = byteArrayOutputStream0.toString();
      boolean boolean1 = tFloatCharHashMap2.equals((Object) string0);
      assertEquals(false, boolean1);
      
      boolean boolean2 = tFloatCharHashMap2.isEmpty();
      tFloatCharHashMap2.clear();
      tFloatCharHashMap2.contains(float2);
      float float3 = 0.0F;
      boolean boolean3 = tFloatCharHashMap2.increment(float3);
      assertFalse(boolean3 == boolean2);
      
      String string1 = tFloatCharHashMap2.toString();
      assertNotNull(string1);
      assertEquals("{}", string1);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 124;
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) int0;
      floatArray0[1] = (float) int0;
      floatArray0[2] = (float) int0;
      floatArray0[3] = (float) int0;
      char[] charArray0 = new char[10];
      char char0 = 'G';
      charArray0[0] = char0;
      char char1 = ',';
      charArray0[1] = char1;
      char char2 = 'Y';
      charArray0[2] = char2;
      char char3 = '{';
      charArray0[3] = char3;
      char char4 = 'Q';
      charArray0[4] = char4;
      char char5 = '[';
      charArray0[5] = char5;
      char char6 = 'd';
      charArray0[6] = char6;
      char char7 = 'w';
      charArray0[7] = char7;
      char char8 = '/';
      charArray0[8] = char8;
      char char9 = '>';
      charArray0[9] = char9;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      String string0 = tFloatCharHashMap0.toString();
      assertNotNull(string0);
      
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0, int0);
      char char10 = '@';
      char char11 = tFloatCharHashMap1.put((float) int0, char10);
      assertEquals(false, tFloatCharHashMap1.isEmpty());
      assertEquals('\u0000', char11);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 665;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, int0);
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0, int0);
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap((TFloatCharMap) tFloatCharHashMap1);
      Object object0 = null;
      AbstractMap.SimpleImmutableEntry<TFloatCharHashMap, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<TFloatCharHashMap, Object>(tFloatCharHashMap2, object0);
      String string0 = "";
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<TFloatCharHashMap, Object>, String> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<TFloatCharHashMap, Object>, String>(abstractMap_SimpleImmutableEntry0, string0);
      String string1 = "";
      char char0 = 'a';
      int int1 = tFloatCharHashMap2.hashCode();
      assertEquals(0, int1);
      
      boolean boolean0 = tFloatCharHashMap2.containsValue(char0);
      assertEquals(false, boolean0);
      
      // Undeclared exception!
      try {
        abstractMap_SimpleImmutableEntry1.setValue(string1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-816);
      float float0 = 0.5F;
      Object object0 = null;
      AbstractMap.SimpleEntry<Float, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Float, Object>((Float) float0, object0);
      abstractMap_SimpleEntry0.getKey();
      char char0 = '/';
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, float0, (float) int0, char0);
      float[] floatArray0 = tFloatCharHashMap0.keys();
      assertNotNull(floatArray0);
      
      abstractMap_SimpleEntry0.equals(object0);
      float float1 = (-742.8768F);
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0, float1);
      tFloatCharHashMap1.isEmpty();
      int int1 = 0;
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap();
      abstractMap_SimpleEntry0.hashCode();
      tFloatCharHashMap2.iterator();
      int int2 = 79;
      float float2 = 0.0F;
      tFloatCharHashMap1.containsKey(float2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(tFloatCharHashMap2._states, int1, int2);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      float float0 = 0.0F;
      char char0 = '.';
      char char1 = tFloatCharHashMap0.put(float0, char0);
      tFloatCharHashMap0.size();
      char[] charArray0 = new char[5];
      charArray0[0] = char0;
      charArray0[1] = char0;
      charArray0[2] = char0;
      charArray0[3] = char1;
      charArray0[4] = char1;
      tFloatCharHashMap0.values(charArray0);
      assertEquals("{0.0=.}", tFloatCharHashMap0.toString());
      assertEquals(false, tFloatCharHashMap0.isEmpty());
  }

  @Test
  public void test9()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = 1796.9187F;
      floatArray0[0] = float0;
      float float1 = 1228.2913F;
      floatArray0[1] = float1;
      float float2 = 0.0F;
      floatArray0[2] = float2;
      float float3 = (-1701.8792F);
      floatArray0[3] = float3;
      float float4 = 0.0F;
      floatArray0[4] = float4;
      float float5 = (-1820.8297F);
      floatArray0[5] = float5;
      float float6 = (-1699.0222F);
      floatArray0[6] = float6;
      char[] charArray0 = new char[7];
      char char0 = '_';
      charArray0[0] = char0;
      char char1 = 'O';
      charArray0[1] = char1;
      char char2 = '$';
      charArray0[2] = char2;
      char char3 = 'p';
      charArray0[3] = char3;
      char char4 = 'L';
      charArray0[4] = char4;
      char char5 = '2';
      charArray0[5] = char5;
      char char6 = '9';
      charArray0[6] = char6;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      Locale locale0 = Locale.FRENCH;
      Locale locale1 = null;
      String string0 = locale0.getDisplayCountry(locale1);
      boolean boolean0 = tFloatCharHashMap0.equals((Object) string0);
      assertEquals("{0.0=L, -1701.8792=p, -1820.8297=2, 1796.9187=_, -1699.0222=9, 1228.2913=O}", tFloatCharHashMap0.toString());
      assertEquals(false, boolean0);
      assertEquals(6, tFloatCharHashMap0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-356);
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0);
      tFloatCharHashMap0.containsKey((float) int0);
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap();
      tFloatCharHashMap0.toString();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 411527;
      float float0 = 0.0F;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, float0);
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)119;
      byteArray0[0] = byte0;
      tFloatCharHashMap0.clear();
      byte byte1 = (byte)100;
      byteArray0[1] = byte1;
      byte byte2 = (byte)42;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-7);
      byteArray0[3] = byte3;
      byte byte4 = (byte)107;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-1);
      byteArray0[5] = byte5;
      tFloatCharHashMap0._states = byteArray0;
      tFloatCharHashMap0.get((float) int0);
      float[] floatArray0 = tFloatCharHashMap0.keys();
      assertNotNull(floatArray0);
  }

  @Test
  public void test12()  throws Throwable  {
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)66;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-114);
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      tFloatCharHashMap0._states = byteArray0;
      assertSame(tFloatCharHashMap0._states, byteArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = (-455.2723F);
      floatArray0[0] = float0;
      float float1 = 0.0F;
      floatArray0[1] = float1;
      float float2 = 0.0F;
      floatArray0[2] = float2;
      float float3 = (-1077.7168F);
      floatArray0[3] = float3;
      char[] charArray0 = new char[7];
      char char0 = 'D';
      charArray0[0] = char0;
      char char1 = '3';
      charArray0[1] = char1;
      char char2 = '.';
      charArray0[2] = char2;
      char char3 = '>';
      charArray0[3] = char3;
      char char4 = 'H';
      charArray0[4] = char4;
      char char5 = '1';
      charArray0[5] = char5;
      char char6 = 'K';
      charArray0[6] = char6;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      ObjectInput objectInput0 = null;
      // Undeclared exception!
      try {
        tFloatCharHashMap0.readExternal(objectInput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 1142;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      tFloatCharHashMap0.ensureCapacity(int0);
      assertEquals(2411, tFloatCharHashMap0.capacity());
      
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0);
      float[] floatArray0 = new float[1];
      char[] charArray0 = new char[7];
      char char0 = ']';
      charArray0[0] = char0;
      char char1 = 'm';
      charArray0[1] = char1;
      char char2 = '%';
      charArray0[2] = char2;
      char char3 = 'u';
      charArray0[3] = char3;
      char char4 = 'G';
      charArray0[4] = char4;
      char char5 = 'S';
      charArray0[5] = char5;
      char char6 = 'u';
      charArray0[6] = char6;
      tFloatCharHashMap1.values(charArray0);
      floatArray0[0] = (float) int0;
      tFloatCharHashMap1.keys(floatArray0);
      int int1 = (-347);
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap(int1);
      tFloatCharHashMap2.clear();
      TFloatCharHashMap tFloatCharHashMap3 = new TFloatCharHashMap((TFloatCharMap) tFloatCharHashMap2);
      tFloatCharHashMap3.values();
      assertEquals(23, tFloatCharHashMap3.capacity());
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 815;
      float float0 = (-560.4424F);
      char char0 = 'T';
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, (float) int0, float0, char0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)101;
      byteArray0[1] = byte1;
      byte byte2 = (byte)73;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-31);
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-21);
      byteArray0[6] = byte6;
      tFloatCharHashMap0._states = byteArray0;
      int int1 = 1;
      char char1 = 'u';
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int1, (float) int1, (float) int1, char1);
      float float1 = (-1024.7362F);
      char[] charArray0 = tFloatCharHashMap1.values();
      assertNotNull(charArray0);
      
      char char2 = tFloatCharHashMap1.remove(float1);
      assertEquals('u', char2);
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = (-1377);
      int int1 = 0;
      float float0 = 6.6360896E8F;
      char char0 = '}';
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int1, float0, (float) int1, char0);
      tFloatCharHashMap0.getAutoCompactionFactor();
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0);
      tFloatCharHashMap1.clear();
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap();
      TFloatCharHashMap tFloatCharHashMap3 = new TFloatCharHashMap((TFloatCharMap) tFloatCharHashMap2);
      float float1 = (-1749.9165F);
      char char1 = '^';
      float float2 = (-160.09004F);
      char char2 = 'P';
      tFloatCharHashMap2.put(float2, char2);
      tFloatCharHashMap3.putIfAbsent(float1, char1);
      boolean boolean0 = false;
      tFloatCharHashMap2.reenableAutoCompaction(boolean0);
      tFloatCharHashMap1.iterator();
      tFloatCharHashMap2._states = tFloatCharHashMap3._states;
      assertEquals(false, tFloatCharHashMap2.isEmpty());
      assertEquals("{-1749.9165=^}", tFloatCharHashMap3.toString());
  }
}
