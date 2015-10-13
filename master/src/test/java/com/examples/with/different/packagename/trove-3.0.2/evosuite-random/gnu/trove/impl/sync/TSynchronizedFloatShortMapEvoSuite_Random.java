/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedFloatShortMap;
import gnu.trove.impl.sync.TSynchronizedShortCollection;
import gnu.trove.map.TFloatShortMap;
import gnu.trove.map.hash.TFloatShortHashMap;
import gnu.trove.procedure.TShortProcedure;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedFloatShortMapEvoSuite_Random {

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
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap();
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-1);
      byteArray0[0] = byte0;
      byte byte1 = (byte)45;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)120;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-53);
      byteArray0[4] = byte4;
      byte byte5 = (byte)1;
      byteArray0[5] = byte5;
      tFloatShortHashMap0._states = byteArray0;
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      tSynchronizedFloatShortMap0.clear();
      float float0 = (-1942.445F);
      // Undeclared exception!
      try {
        tFloatShortHashMap0.setAutoCompactionFactor(float0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -1942.445
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = (-1469.2903F);
      floatArray0[0] = float0;
      float float1 = 252.76689F;
      floatArray0[1] = float1;
      float float2 = 0.0F;
      floatArray0[2] = float2;
      float float3 = 0.0F;
      floatArray0[3] = float3;
      float float4 = (-14.139765F);
      floatArray0[4] = float4;
      float float5 = 0.0F;
      floatArray0[5] = float5;
      float float6 = (-1.0F);
      floatArray0[6] = float6;
      float float7 = 10.0F;
      floatArray0[7] = float7;
      float float8 = (-1419.7335F);
      floatArray0[8] = float8;
      short[] shortArray0 = new short[10];
      short short0 = (short) (-926);
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short)0;
      shortArray0[2] = short2;
      short short3 = (short)413;
      shortArray0[3] = short3;
      short short4 = (short) (-1528);
      shortArray0[4] = short4;
      short short5 = (short)1977;
      shortArray0[5] = short5;
      short short6 = (short)0;
      shortArray0[6] = short6;
      short short7 = (short) (-1174);
      shortArray0[7] = short7;
      short short8 = (short) (-1105);
      shortArray0[8] = short8;
      short short9 = (short)2;
      shortArray0[9] = short9;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(floatArray0, shortArray0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      tSynchronizedFloatShortMap0.putAll((TFloatShortMap) tFloatShortHashMap0);
      assertEquals("{-1469.2903=-926, -1419.7335=-1105, -1.0=0, 10.0=-1174, 252.76689=0, -14.139765=-1528, 0.0=1977}", tFloatShortHashMap0.toString());
      assertEquals(31, tFloatShortHashMap0.capacity());
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 3915341;
      float float0 = 2008.7844F;
      short short0 = (short)0;
      int int1 = (-610);
      float float1 = 6.6360896E8F;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int1, float1);
      int int2 = (-1154);
      TFloatShortHashMap tFloatShortHashMap1 = new TFloatShortHashMap(int2);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap1);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap1 = (TSynchronizedFloatShortMap)tSynchronizedFloatShortMap0.mutex;
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap2 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0, (Object) tSynchronizedFloatShortMap1);
      TFloatShortHashMap tFloatShortHashMap2 = new TFloatShortHashMap(int0, float0, float0, short0);
      String string0 = "";
      float float2 = (-1099.4812F);
      // Undeclared exception!
      try {
        tFloatShortHashMap2.setAutoCompactionFactor(float2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -1099.4812
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TFloatShortMap tFloatShortMap0 = null;
      String string0 = ":c5<&tjDw!\"0f!|sX0";
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = null;
      try {
        tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap(tFloatShortMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 0;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int0, int0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      int int1 = tSynchronizedFloatShortMap0.hashCode();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      float float0 = (-1092.695F);
      short short0 = (short) (-1904);
      tSynchronizedFloatShortMap0.put(float0, short0);
      tSynchronizedFloatShortMap0.get(float0);
      float[] floatArray0 = new float[1];
      floatArray0[0] = (float) int1;
      tFloatShortHashMap0._set = floatArray0;
      String string0 = byteArrayOutputStream0.toString();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap1 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      tSynchronizedFloatShortMap1.get((float) int0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap2 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0, (Object) string0);
      tSynchronizedFloatShortMap1.keys(tFloatShortHashMap0._set);
      float float1 = 1689.423F;
      tSynchronizedFloatShortMap2.containsKey(float1);
      tSynchronizedFloatShortMap1.keySet();
      floatArray0[0] = (float) int0;
      assertFalse(floatArray0[0] == float1);
  }

  @Test
  public void test5()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = (-1.0F);
      floatArray0[0] = float0;
      float float1 = 0.0F;
      floatArray0[1] = float1;
      float float2 = (-1.0F);
      floatArray0[2] = float2;
      float float3 = 0.0F;
      floatArray0[3] = float3;
      short[] shortArray0 = new short[7];
      short short0 = (short) (-1143);
      shortArray0[0] = short0;
      short short1 = (short)17739;
      shortArray0[1] = short1;
      short short2 = (short)936;
      shortArray0[2] = short2;
      short short3 = (short)0;
      shortArray0[3] = short3;
      short short4 = (short) (-1);
      shortArray0[4] = short4;
      short short5 = (short) (-842);
      shortArray0[5] = short5;
      short short6 = (short) (-1158);
      shortArray0[6] = short6;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(floatArray0, shortArray0);
      String string0 = " exceeds size ";
      // Undeclared exception!
      try {
        URI.create(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 0:  exceeds size 
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = (-1227);
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int0, int0);
      String string0 = "";
      String string1 = "";
      String string2 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string1, string2, int0, string0, string0, string2);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: ://@:-1227?#
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-1912);
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int0, int0);
      Locale locale0 = Locale.TAIWAN;
      String string0 = locale0.getLanguage();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0, (Object) string0);
      tSynchronizedFloatShortMap0.hashCode();
      int int1 = 0;
      TFloatShortHashMap tFloatShortHashMap1 = new TFloatShortHashMap(int1);
      TFloatShortHashMap tFloatShortHashMap2 = new TFloatShortHashMap((TFloatShortMap) tFloatShortHashMap1);
      Locale locale1 = Locale.CANADA;
      Locale locale2 = Locale.CANADA;
      String string1 = locale1.getDisplayName(locale2);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap1 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap2, (Object) string1);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap2 = new TSynchronizedFloatShortMap((TFloatShortMap) tSynchronizedFloatShortMap1);
      TFloatShortHashMap tFloatShortHashMap3 = new TFloatShortHashMap();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap3 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap3);
      String string2 = "]RMN6A~ovns+2V7,";
      RandomAccessFile randomAccessFile0 = null;
      try {
        randomAccessFile0 = new RandomAccessFile(string2, string2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"]RMN6A~ovns+2V7,\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = 0.0F;
      floatArray0[0] = float0;
      float float1 = (-34.56348F);
      floatArray0[1] = float1;
      float float2 = 92.90722F;
      floatArray0[2] = float2;
      float float3 = 1.0F;
      floatArray0[3] = float3;
      float float4 = (-1562.6672F);
      floatArray0[4] = float4;
      float float5 = Float.NEGATIVE_INFINITY;
      floatArray0[5] = float5;
      float float6 = 0.0F;
      floatArray0[6] = float6;
      float float7 = 0.0F;
      floatArray0[7] = float7;
      float float8 = (-1.0F);
      floatArray0[8] = float8;
      short[] shortArray0 = new short[1];
      short short0 = (short)1124;
      shortArray0[0] = short0;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(floatArray0, shortArray0);
      String string0 = "{";
      File file0 = new File(string0);
      File file1 = file0.getAbsoluteFile();
      File file2 = new File(file1, string0);
      URI uRI0 = file2.toURI();
      // Undeclared exception!
      try {
        uRI0.resolve(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 0: {
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 0;
      short short0 = (short)1801;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int0, (float) int0, (float) int0, short0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      tSynchronizedFloatShortMap0.clear();
      int int1 = 1865;
      TFloatShortHashMap tFloatShortHashMap1 = new TFloatShortHashMap(int1);
      tSynchronizedFloatShortMap0.containsKey((float) int1);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap1 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap1);
      short short1 = (short)897;
      tSynchronizedFloatShortMap1.adjustValue((float) int1, short1);
      TShortProcedure tShortProcedure0 = null;
      boolean boolean0 = tSynchronizedFloatShortMap1.forEachValue(tShortProcedure0);
      assertEquals(true, boolean0);
      
      float float0 = 1307.9697F;
      tFloatShortHashMap1.containsKey(float0);
      short short2 = (short) (-739);
      boolean boolean1 = tSynchronizedFloatShortMap1.adjustValue((float) int1, short2);
      assertFalse(boolean1 == boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[10];
      float float0 = 10.0F;
      floatArray0[0] = float0;
      float float1 = (-1726.7928F);
      floatArray0[1] = float1;
      float float2 = 1.0F;
      floatArray0[2] = float2;
      float float3 = 26.383902F;
      floatArray0[3] = float3;
      float float4 = (-1716.5162F);
      floatArray0[4] = float4;
      float float5 = 1058.1383F;
      floatArray0[5] = float5;
      float float6 = 0.0F;
      floatArray0[6] = float6;
      float float7 = Float.POSITIVE_INFINITY;
      floatArray0[7] = float7;
      float float8 = (-163.58197F);
      floatArray0[8] = float8;
      float float9 = 1.0F;
      floatArray0[9] = float9;
      short[] shortArray0 = new short[8];
      short short0 = (short) (-853);
      shortArray0[0] = short0;
      short short1 = (short)2008;
      shortArray0[1] = short1;
      short short2 = (short)1;
      shortArray0[2] = short2;
      short short3 = (short)0;
      shortArray0[3] = short3;
      short short4 = (short)7;
      shortArray0[4] = short4;
      short short5 = (short)119;
      shortArray0[5] = short5;
      short short6 = (short)0;
      shortArray0[6] = short6;
      short short7 = (short)2039;
      shortArray0[7] = short7;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(floatArray0, shortArray0);
      Locale locale0 = Locale.ITALY;
      String string0 = locale0.toString();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0, (Object) string0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap1 = new TSynchronizedFloatShortMap((TFloatShortMap) tSynchronizedFloatShortMap0);
      TFloatShortHashMap tFloatShortHashMap1 = new TFloatShortHashMap();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap2 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap1);
      tSynchronizedFloatShortMap2.getNoEntryKey();
      TSynchronizedShortCollection tSynchronizedShortCollection0 = (TSynchronizedShortCollection)tSynchronizedFloatShortMap2.valueCollection();
      assertNotNull(tSynchronizedShortCollection0);
      
      tFloatShortHashMap1.compact();
      boolean boolean0 = tSynchronizedFloatShortMap2.isEmpty();
      assertEquals(true, boolean0);
  }

//   @Test
//   public void test11()  throws Throwable  {
//       float[] floatArray0 = new float[5];
//       float float0 = 1537.7345F;
//       floatArray0[0] = float0;
//       float float1 = 1437.8457F;
//       floatArray0[1] = float1;
//       float float2 = 1443.2542F;
//       floatArray0[2] = float2;
//       float float3 = 0.0F;
//       floatArray0[3] = float3;
//       float float4 = 0.0F;
//       floatArray0[4] = float4;
//       short[] shortArray0 = new short[8];
//       short short0 = (short)1486;
//       shortArray0[0] = short0;
//       short short1 = (short)0;
//       shortArray0[1] = short1;
//       short short2 = (short) (-27081);
//       shortArray0[2] = short2;
//       short short3 = (short)0;
//       shortArray0[3] = short3;
//       short short4 = (short)797;
//       shortArray0[4] = short4;
//       short short5 = (short) (-1);
//       shortArray0[5] = short5;
//       short short6 = (short) (-1613);
//       shortArray0[6] = short6;
//       short short7 = (short)578;
//       shortArray0[7] = short7;
//       TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(floatArray0, shortArray0);
//       TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
//       tSynchronizedFloatShortMap0.putAll((TFloatShortMap) tFloatShortHashMap0);
//       assertEquals(0, tFloatShortHashMap0.getNoEntryValue());
//   }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 92;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int0);
      TFloatShortHashMap tFloatShortHashMap1 = new TFloatShortHashMap((TFloatShortMap) tFloatShortHashMap0);
      Locale locale0 = Locale.JAPANESE;
      String string0 = locale0.toString();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap1, (Object) string0);
      float float0 = 1857.9182F;
      boolean boolean0 = tSynchronizedFloatShortMap0.increment(float0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 0;
      TFloatShortMap tFloatShortMap0 = null;
      String string0 = "";
      Locale locale0 = new Locale(string0, string0, string0);
      Locale locale1 = Locale.ITALIAN;
      String string1 = locale0.getDisplayLanguage(locale1);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap(tFloatShortMap0, (Object) string1);
      TFloatShortHashMap tFloatShortHashMap0 = null;
      try {
        tFloatShortHashMap0 = new TFloatShortHashMap((TFloatShortMap) tSynchronizedFloatShortMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float float0 = (-72.27229F);
      floatArray0[0] = float0;
      float float1 = (-1645.7224F);
      floatArray0[1] = float1;
      float float2 = 1422.9108F;
      floatArray0[2] = float2;
      float float3 = 925.06366F;
      floatArray0[3] = float3;
      float float4 = 997.48126F;
      floatArray0[4] = float4;
      float float5 = (-1.0F);
      floatArray0[5] = float5;
      float float6 = (-985.5177F);
      floatArray0[6] = float6;
      float float7 = 1798.2407F;
      floatArray0[7] = float7;
      short[] shortArray0 = new short[10];
      short short0 = (short)1;
      shortArray0[0] = short0;
      short short1 = (short)1545;
      shortArray0[1] = short1;
      short short2 = (short)1171;
      shortArray0[2] = short2;
      short short3 = (short)89;
      shortArray0[3] = short3;
      short short4 = (short) (-1);
      shortArray0[4] = short4;
      short short5 = (short) (-22555);
      shortArray0[5] = short5;
      short short6 = (short)0;
      shortArray0[6] = short6;
      short short7 = (short) (-1);
      shortArray0[7] = short7;
      short short8 = (short)31917;
      shortArray0[8] = short8;
      short short9 = (short)1444;
      shortArray0[9] = short9;
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(floatArray0, shortArray0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      assertEquals(false, tSynchronizedFloatShortMap0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = (-1940);
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap(int0);
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0);
      short short0 = (short)661;
      boolean boolean0 = tSynchronizedFloatShortMap0.adjustValue((float) int0, short0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      TFloatShortHashMap tFloatShortHashMap0 = new TFloatShortHashMap();
      String string0 = ",R\"z";
      Locale locale0 = Locale.JAPANESE;
      String string1 = locale0.getCountry();
      TSynchronizedFloatShortMap tSynchronizedFloatShortMap0 = new TSynchronizedFloatShortMap((TFloatShortMap) tFloatShortHashMap0, (Object) string1);
      float float0 = (-103.584175F);
      short short0 = (short)1025;
      tSynchronizedFloatShortMap0.putIfAbsent(float0, short0);
      Locale locale1 = Locale.forLanguageTag(string0);
      locale1.getDisplayCountry();
      int int0 = 0;
      String string2 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int0, string0, string0, string2);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: ,R\"z://,R%22z@,R\"z:0,R%22z?,R%22z#
         //
      }
  }
}
