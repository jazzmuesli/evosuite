/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.hash.TIntByteHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.AbstractMap;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TIntByteHashMapEvoSuite_Random {

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
      int int0 = (-1618);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, int0);
      boolean boolean0 = tIntByteHashMap0.isEmpty();
      assertEquals(true, boolean0);
      
      int int1 = 0;
      float float0 = 1460.7499F;
      byte byte0 = (byte)1;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int1, float0, int1, byte0);
      ObjectInput objectInput0 = null;
      // Undeclared exception!
      try {
        tIntByteHashMap1.readExternal(objectInput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      int[] intArray0 = new int[2];
      int int0 = 244;
      intArray0[0] = int0;
      int int1 = 681;
      tIntByteHashMap0.contains(int1);
      int int2 = 571;
      intArray0[1] = int2;
      tIntByteHashMap0._set = intArray0;
      assertEquals(23, tIntByteHashMap0.capacity());
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 11;
      int int1 = 1231;
      byte byte0 = (byte)0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, (float) int0, int1, byte0);
      tIntByteHashMap0.iterator();
      int int2 = 814;
      int int3 = tIntByteHashMap0.hashCode();
      assertEquals(0, int3);
      
      tIntByteHashMap0.getNoEntryKey();
      tIntByteHashMap0.valueCollection();
      Object object0 = null;
      String string0 = "|' |Yha @:";
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(object0, string0);
      int[] intArray0 = new int[3];
      String string1 = "a";
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, Object>(string1, object0);
      abstractMap_SimpleEntry1.getValue();
      intArray0[0] = int2;
      abstractMap_SimpleEntry0.setValue(string0);
      intArray0[1] = int1;
      intArray0[2] = (int) byte0;
      tIntByteHashMap0._set = intArray0;
      abstractMap_SimpleEntry0.hashCode();
      abstractMap_SimpleEntry1.equals(object0);
      tIntByteHashMap0.size();
      byte byte1 = tIntByteHashMap0.get(int2);
      assertEquals((byte)0, byte1);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 63;
      float float0 = (-1.0F);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0);
      byte byte0 = (byte) (-97);
      byte byte1 = tIntByteHashMap0.put(int0, byte0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = byte1;
      byteArray0[1] = byte1;
      byteArray0[2] = byte1;
      tIntByteHashMap0.values(byteArray0);
      tIntByteHashMap0.clear();
      assertEquals(7, tIntByteHashMap0.capacity());
  }

  @Test
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = (-1613);
      Object object0 = null;
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(object0, object0);
      abstractMap_SimpleEntry0.getKey();
      int int1 = 1277;
      intArray0[0] = int1;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, int1);
      ObjectOutput objectOutput0 = null;
      // Undeclared exception!
      try {
        tIntByteHashMap0.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = (-90);
      intArray0[2] = int2;
      int int3 = 411527;
      intArray0[3] = int3;
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)17;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-1);
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      assertEquals("{-90=0, 0=-1}", tIntByteHashMap0.toString());
      assertEquals(2, tIntByteHashMap0.size());
      assertEquals(11, tIntByteHashMap0.capacity());
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      String string0 = "";
      try {
        Byte.decode(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length string
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-2036);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      tIntByteHashMap0.toString();
      int int1 = 237;
      tIntByteHashMap0.get(int1);
      boolean boolean0 = true;
      tIntByteHashMap0.reenableAutoCompaction(boolean0);
      tIntByteHashMap0.keySet();
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      TIntProcedure tIntProcedure0 = null;
      boolean boolean1 = tIntByteHashMap1.forEachKey(tIntProcedure0);
      tIntByteHashMap1.reenableAutoCompaction(boolean1);
      float float0 = 263.47293F;
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int0, float0);
      int int2 = 0;
      int int3 = 1044;
      byte byte0 = (byte)7;
      tIntByteHashMap1.putIfAbsent(int3, byte0);
      tIntByteHashMap2.getNoEntryValue();
      byte byte1 = tIntByteHashMap2.get(int2);
      tIntByteHashMap2.containsValue(byte1);
      String string0 = "=";
      String string1 = "";
      tIntByteHashMap0.getNoEntryValue();
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(string0, string1);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = (-566);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, int0);
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)113;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-108);
      byteArray0[3] = byte3;
      byte byte4 = (byte)22;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-79);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-72);
      byteArray0[6] = byte6;
      byte byte7 = (byte)72;
      byteArray0[7] = byte7;
      byte[] byteArray1 = tIntByteHashMap0.values(byteArray0);
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      
      int int1 = (-1378);
      float float0 = (-997.1348F);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int1, float0);
      int int2 = 577;
      int[] intArray0 = new int[5];
      intArray0[0] = int1;
      intArray0[1] = int1;
      intArray0[2] = int1;
      int int3 = 0;
      intArray0[3] = int3;
      intArray0[4] = int2;
      tIntByteHashMap1._set = intArray0;
      tIntByteHashMap1.keySet();
      boolean boolean0 = tIntByteHashMap1.increment(int2);
      boolean boolean1 = tIntByteHashMap1.isEmpty();
      assertFalse(boolean1 == boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      tIntByteHashMap0.iterator();
      int int0 = 533;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      float float0 = 0.0F;
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap();
      tIntByteHashMap2.iterator();
      TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap(int0, float0);
      int int1 = 716;
      byte byte0 = (byte)0;
      tIntByteHashMap3.putIfAbsent(int1, byte0);
      tIntByteHashMap3.size();
      TIntByteMap tIntByteMap0 = null;
      tIntByteHashMap2.capacity();
      int int2 = 1105;
      tIntByteHashMap0.capacity();
      byte byte1 = (byte)0;
      tIntByteHashMap3.adjustValue(int2, byte1);
      TIntByteHashMap tIntByteHashMap4 = null;
      try {
        tIntByteHashMap4 = new TIntByteHashMap(tIntByteMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-741);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, int0);
      tIntByteHashMap0.increment(int0);
      byte byte0 = (byte)119;
      // Undeclared exception!
      try {
        tIntByteHashMap0.setAutoCompactionFactor((float) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -741.0
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      float float0 = 311.7996F;
      int int1 = 164089;
      byte byte0 = (byte)0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0, int1, byte0);
      int[] intArray0 = new int[9];
      int int2 = 1486;
      intArray0[0] = int2;
      intArray0[1] = (int) byte0;
      intArray0[2] = int0;
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
  public void test12()  throws Throwable  {
      int int0 = 0;
      float float0 = 443.30527F;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0);
      float float1 = 798.8128F;
      tIntByteHashMap0.setAutoCompactionFactor(float1);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-88);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)119;
      byteArray0[3] = byte3;
      tIntByteHashMap1.adjustValue((int) byte3, byteArray0[3]);
      byte byte4 = (byte) (-1);
      byteArray0[4] = byte4;
      byte byte5 = (byte)127;
      byteArray0[5] = byte5;
      byte byte6 = (byte)80;
      byteArray0[6] = byte6;
      tIntByteHashMap1.values(byteArray0);
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap();
      TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap2);
      tIntByteHashMap3.size();
      float float2 = 0.0F;
      TIntByteHashMap tIntByteHashMap4 = new TIntByteHashMap(int0, float2);
      TIntByteHashMap tIntByteHashMap5 = null;
      try {
        tIntByteHashMap5 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap4);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = (-699);
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = 0;
      intArray0[2] = int2;
      int int3 = 0;
      intArray0[3] = int3;
      int int4 = 379577741;
      intArray0[4] = int4;
      int int5 = (-1461);
      intArray0[5] = int5;
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)114;
      byteArray0[0] = byte0;
      byte byte1 = (byte)31;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-1);
      byteArray0[2] = byte2;
      byte byte3 = (byte)124;
      byteArray0[3] = byte3;
      byte byte4 = (byte)116;
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      tIntByteHashMap0.putAll((TIntByteMap) tIntByteHashMap1);
      assertEquals("{379577741=116, -1461=0, -699=114, 0=124}", tIntByteHashMap0.toString());
      assertEquals(4, tIntByteHashMap0.size());
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      byte byte0 = (byte)65;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, (float) int0, int1, byte0);
      int int2 = 0;
      byte byte1 = tIntByteHashMap0.get(int2);
      assertEquals((byte)65, byte1);
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = (-1759);
      float float0 = 1.0F;
      int int1 = (-1787);
      byte byte0 = (byte)39;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0, int1, byte0);
      int[] intArray0 = new int[1];
      int int2 = 0;
      intArray0[0] = int2;
      byte[] byteArray0 = new byte[5];
      byte byte1 = (byte)96;
      byteArray0[0] = byte1;
      byte byte2 = (byte)3;
      byteArray0[1] = byte2;
      byte byte3 = (byte)55;
      int int3 = (-1007);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int3);
      tIntByteHashMap1.trimToSize();
      byteArray0[2] = byte3;
      byte byte4 = (byte)78;
      byteArray0[3] = byte4;
      byte byte5 = (byte)3;
      byteArray0[4] = byte5;
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(intArray0, byteArray0);
      intArray0[0] = (int) byteArray0[0];
      assertFalse(intArray0[0] == int1);
  }
}
