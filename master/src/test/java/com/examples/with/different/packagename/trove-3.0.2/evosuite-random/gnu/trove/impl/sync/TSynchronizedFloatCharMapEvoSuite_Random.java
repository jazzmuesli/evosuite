/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedFloatCharMap;
import gnu.trove.iterator.TFloatCharIterator;
import gnu.trove.map.TFloatCharMap;
import gnu.trove.map.hash.TFloatCharHashMap;
import gnu.trove.procedure.TFloatCharProcedure;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedFloatCharMapEvoSuite_Random {

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
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
      float float0 = 79.77336F;
      char char0 = '\\';
      char char1 = 'j';
      tSynchronizedFloatCharMap0.adjustOrPutValue((float) char0, char1, char1);
      char char2 = tSynchronizedFloatCharMap0.put(float0, char0);
      int int0 = (-1739);
      tSynchronizedFloatCharMap0.get((float) char2);
      HashMap<Character, Integer> hashMap0 = null;
      try {
        hashMap0 = new HashMap<Character, Integer>(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1739
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = (-1656);
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap((TFloatCharMap) tFloatCharHashMap0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap1);
      String string0 = "from > to : ";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: from > to : ://from%20%3E%20to%20:%20from%20%3E%20to%20:%20?from%20%3E%20to%20:%20#from%20%3E%20to%20:%20
         //
      }
  }

//   @Test
//   public void test2()  throws Throwable  {
//       int int0 = (-867);
//       float float0 = 0.0F;
//       float float1 = 0.0F;
//       char char0 = ')';
//       TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, float0, float1, char0);
//       TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
//       assertEquals(0.0F, tSynchronizedFloatCharMap0.getNoEntryKey(), 0.01F);
//   }

  @Test
  public void test3()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float float0 = 222.40291F;
      floatArray0[0] = float0;
      float float1 = 6.6360896E8F;
      floatArray0[1] = float1;
      float float2 = (-1.0F);
      floatArray0[2] = float2;
      char[] charArray0 = new char[2];
      char char0 = 'D';
      charArray0[0] = char0;
      char char1 = 'H';
      charArray0[1] = char1;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      Object object0 = null;
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0, object0);
      float float3 = 1.0F;
      char char2 = 'Y';
      // Undeclared exception!
      try {
        tSynchronizedFloatCharMap0.adjustValue(float3, char2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float float0 = 0.0F;
      floatArray0[0] = float0;
      char[] charArray0 = new char[5];
      char char0 = 'v';
      charArray0[0] = char0;
      char char1 = '2';
      charArray0[1] = char1;
      char char2 = '*';
      charArray0[2] = char2;
      char char3 = 'T';
      charArray0[3] = char3;
      char char4 = 'Z';
      charArray0[4] = char4;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
      boolean boolean0 = tSynchronizedFloatCharMap0.containsValue(char2);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 620;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      String string0 = "";
      boolean boolean0 = true;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      Locale locale0 = Locale.CANADA_FRENCH;
      String string1 = locale0.getScript();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0, (Object) string1);
      tSynchronizedFloatCharMap0.getNoEntryValue();
      // Undeclared exception!
      try {
        stringTokenizer0.nextToken(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1256);
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int1, int1);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = locale0.getDisplayScript();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0, (Object) string0);
      tFloatCharHashMap0.toString();
      tSynchronizedFloatCharMap0.increment((float) int1);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap1 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap2 = new TSynchronizedFloatCharMap((TFloatCharMap) tSynchronizedFloatCharMap1);
      tSynchronizedFloatCharMap2.putAll((TFloatCharMap) tSynchronizedFloatCharMap1);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap3 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0);
      float float0 = (-1312.5283F);
      tSynchronizedFloatCharMap2.containsKey(float0);
      float float1 = 90.43476F;
      tSynchronizedFloatCharMap3.containsKey(float1);
      char char0 = 'a';
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap4 = new TSynchronizedFloatCharMap((TFloatCharMap) tSynchronizedFloatCharMap1);
      tSynchronizedFloatCharMap4.containsKey(float0);
      tSynchronizedFloatCharMap3.get((float) int0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap5 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap1);
      tSynchronizedFloatCharMap5.size();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap6 = new TSynchronizedFloatCharMap((TFloatCharMap) tSynchronizedFloatCharMap3);
      tSynchronizedFloatCharMap1.values();
      tSynchronizedFloatCharMap5.keySet();
      tSynchronizedFloatCharMap5.toString();
      tSynchronizedFloatCharMap1.values();
      Character character0 = new Character(char0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap7 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap1, (Object) character0);
      float float2 = 1095.2399F;
      char char1 = ',';
      tSynchronizedFloatCharMap7.put(float2, char1);
      tSynchronizedFloatCharMap5.keySet();
      char char2 = ':';
      char char3 = tSynchronizedFloatCharMap7.adjustOrPutValue((float) character0, (char) character0, char2);
      assertEquals(2, tFloatCharHashMap1.size());
      assertEquals(':', char3);
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 1414;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap();
      File file0 = null;
      float[] floatArray0 = new float[10];
      floatArray0[0] = (float) int0;
      floatArray0[1] = (float) int0;
      floatArray0[2] = (float) int0;
      floatArray0[3] = (float) int0;
      floatArray0[4] = (float) int0;
      float float0 = 1074.181F;
      floatArray0[5] = float0;
      floatArray0[6] = (float) int0;
      float float1 = 0.0F;
      floatArray0[7] = float1;
      floatArray0[8] = (float) int0;
      floatArray0[9] = (float) int0;
      tFloatCharHashMap0.keys(floatArray0);
      String string0 = "";
      RandomAccessFile randomAccessFile0 = null;
      try {
        randomAccessFile0 = new RandomAccessFile(file0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 121;
      char char0 = '.';
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, (float) int0, (float) int0, char0);
      String string0 = "";
      boolean boolean0 = true;
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0, boolean0);
      String string1 = "";
      // Undeclared exception!
      try {
        stringTokenizer0.nextToken(string1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 1307;
      float float0 = 0.0F;
      char char0 = '';
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) int0;
      floatArray0[1] = float0;
      floatArray0[2] = (float) char0;
      floatArray0[3] = (float) int0;
      char[] charArray0 = new char[7];
      charArray0[0] = char0;
      charArray0[1] = char0;
      charArray0[2] = char0;
      char char1 = '?';
      charArray0[3] = char1;
      charArray0[4] = char0;
      charArray0[5] = char0;
      charArray0[6] = char0;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
      String string0 = ",NO%fg5M";
      String string1 = "2(?=D*u6zyP:gxsd=R4";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string1, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: ,NO%fg5M://[2(?=D*u6zyP:gxsd=R4],NO%25fg5M#2(?=D*u6zyP:gxsd=R4
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 2036;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, int0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = locale0.getDisplayVariant();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0, (Object) string0);
      float float0 = (-462.4796F);
      tSynchronizedFloatCharMap0.get(float0);
      float float1 = 0.0F;
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap1 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap1);
      TFloatCharProcedure tFloatCharProcedure0 = null;
      tSynchronizedFloatCharMap1.retainEntries(tFloatCharProcedure0);
      tSynchronizedFloatCharMap1.toString();
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap((TFloatCharMap) tSynchronizedFloatCharMap1);
      tSynchronizedFloatCharMap1.valueCollection();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap2 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap2);
      tFloatCharHashMap2.capacity();
      tSynchronizedFloatCharMap1.iterator();
      tSynchronizedFloatCharMap2.remove(float1);
      TFloatCharHashMap tFloatCharHashMap3 = new TFloatCharHashMap(int0, float1);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap3 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap3);
      TFloatCharIterator tFloatCharIterator0 = tSynchronizedFloatCharMap3.iterator();
      assertEquals(false, tFloatCharIterator0.hasNext());
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, int0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0);
      String string0 = "_57^e1OQUTa";
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap1 = new TSynchronizedFloatCharMap((TFloatCharMap) tSynchronizedFloatCharMap0, (Object) string0);
      float float0 = 1371.468F;
      char char0 = tSynchronizedFloatCharMap1.remove(float0);
      assertEquals('\u0000', char0);
  }

  @Test
  public void test12()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float float0 = 1239.1398F;
      floatArray0[0] = float0;
      float float1 = 537.63605F;
      floatArray0[1] = float1;
      float float2 = 0.0F;
      floatArray0[2] = float2;
      float float3 = 0.5F;
      floatArray0[3] = float3;
      float float4 = 618.5119F;
      floatArray0[4] = float4;
      int int0 = 1270136683;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0);
      Locale locale0 = Locale.CHINA;
      String string0 = locale0.getDisplayScript();
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0, (Object) string0);
      tSynchronizedFloatCharMap0.valueCollection();
      float float5 = (-1378.9478F);
      floatArray0[5] = float5;
      float float6 = 1554.4514F;
      floatArray0[6] = float6;
      float float7 = 0.0F;
      floatArray0[7] = float7;
      char[] charArray0 = new char[2];
      char char0 = 'E';
      charArray0[0] = char0;
      char char1 = 'n';
      charArray0[1] = char1;
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(floatArray0, charArray0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap1 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap1);
      int int1 = 238;
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap(int1);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap2 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap2);
      tSynchronizedFloatCharMap2.clear();
      assertFalse(tSynchronizedFloatCharMap2.equals(tSynchronizedFloatCharMap1));
  }

  @Test
  public void test13()  throws Throwable  {
      TFloatCharMap tFloatCharMap0 = null;
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = null;
      try {
        tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap(tFloatCharMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = (-1383);
      float float0 = 1.0F;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, float0);
      char char0 = '~';
      Character character0 = new Character(char0);
      TSynchronizedFloatCharMap tSynchronizedFloatCharMap0 = new TSynchronizedFloatCharMap((TFloatCharMap) tFloatCharHashMap0, (Object) character0);
      float float1 = tSynchronizedFloatCharMap0.getNoEntryKey();
      assertFalse(float0 == float1);
  }

  @Test
  public void test15()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float float0 = (-1632.8923F);
      floatArray0[0] = float0;
      float float1 = 6.6360896E8F;
      floatArray0[1] = float1;
      float float2 = (-1075.7931F);
      floatArray0[2] = float2;
      float float3 = 1693.9667F;
      floatArray0[3] = float3;
      float float4 = 965.7864F;
      floatArray0[4] = float4;
      float float5 = 1.0F;
      floatArray0[5] = float5;
      float float6 = (-1164.2537F);
      floatArray0[6] = float6;
      float float7 = 0.0F;
      floatArray0[7] = float7;
      char[] charArray0 = new char[10];
      char char0 = 'R';
      charArray0[0] = char0;
      char char1 = 'E';
      charArray0[1] = char1;
      char char2 = '.';
      charArray0[2] = char2;
      char char3 = 'P';
      charArray0[3] = char3;
      char char4 = '6';
      charArray0[4] = char4;
      char char5 = '\"';
      charArray0[5] = char5;
      char char6 = 'W';
      charArray0[6] = char6;
      char char7 = '/';
      charArray0[7] = char7;
      char char8 = 'g';
      charArray0[8] = char8;
      char char9 = 'a';
      charArray0[9] = char9;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      String string0 = "";
      File file0 = new File(string0, string0);
      RandomAccessFile randomAccessFile0 = null;
      try {
        randomAccessFile0 = new RandomAccessFile(file0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
      }
  }
}
