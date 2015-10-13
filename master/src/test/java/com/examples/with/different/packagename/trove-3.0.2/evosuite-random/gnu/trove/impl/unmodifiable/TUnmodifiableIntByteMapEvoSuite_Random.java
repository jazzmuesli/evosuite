/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntByteMap;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.hash.TIntByteHashMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableIntByteMapEvoSuite_Random {

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
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      tUnmodifiableIntByteMap0.size();
      tUnmodifiableIntByteMap0.values();
      tUnmodifiableIntByteMap0.keys();
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.putAll((TIntByteMap) tIntByteHashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = 730;
      intArray0[0] = int0;
      int int1 = (-1297);
      intArray0[1] = int1;
      int int2 = 0;
      intArray0[2] = int2;
      int int3 = 328;
      intArray0[3] = int3;
      int int4 = 0;
      intArray0[4] = int4;
      int int5 = 1073;
      intArray0[5] = int5;
      int int6 = 0;
      intArray0[6] = int6;
      int int7 = (-484);
      intArray0[7] = int7;
      int int8 = (-1);
      intArray0[8] = int8;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)121;
      byteArray0[1] = byte1;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      Locale locale0 = Locale.GERMANY;
      Locale locale1 = Locale.UK;
      String string0 = locale0.getDisplayVariant(locale1);
      boolean boolean0 = tUnmodifiableIntByteMap0.equals((Object) string0);
      assertEquals(false, boolean0);
      
      int int9 = 1942;
      float float0 = 0.0F;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int9, float0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap1 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap1);
      int int10 = 1633;
      byte byte2 = (byte) (-103);
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap1.put(int10, byte2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 1;
      intArray0[0] = int0;
      int int1 = (-1772);
      intArray0[1] = int1;
      int int2 = 381;
      intArray0[2] = int2;
      int int3 = 0;
      intArray0[3] = int3;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)20;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.adjustValue((int) byteArray0[0], byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      tIntByteHashMap0.trimToSize();
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      int int0 = 0;
      tUnmodifiableIntByteMap0.get(int0);
      int int1 = 1827;
      byte byte0 = (byte) (-109);
      int int2 = (-1);
      byte byte1 = (byte) (-1);
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.adjustOrPutValue(int2, byte1, byte1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 1893;
      int int1 = 33;
      float float0 = 0.0F;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int1, float0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      String string0 = "";
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0);
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
  public void test5()  throws Throwable  {
      int int0 = 735;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap1 = new TUnmodifiableIntByteMap((TIntByteMap) tUnmodifiableIntByteMap0);
      int int1 = 1007;
      byte byte0 = (byte)1;
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap1.adjustValue(int1, byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      tUnmodifiableIntByteMap0.getNoEntryValue();
      tUnmodifiableIntByteMap0.values(tIntByteHashMap0._states);
      byte byte0 = (byte)0;
      tIntByteHashMap0.containsValue(byte0);
      int int0 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.increment(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 168;
      float float0 = (-1033.572F);
      int int1 = 1;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      tUnmodifiableIntByteMap0.get(int0);
      float float1 = 1788.5735F;
      byte byte0 = (byte)40;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int1, float1, int0, byte0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap1 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap1);
      tUnmodifiableIntByteMap1.hashCode();
      byte byte1 = (byte)18;
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int0, float0, int0, byte1);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap2 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap2);
      TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap((TIntByteMap) tUnmodifiableIntByteMap2);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap3 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap3);
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.putAll((TIntByteMap) tIntByteHashMap1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = (-1202);
      intArray0[2] = int2;
      int int3 = 0;
      intArray0[3] = int3;
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)112;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte)8;
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-82);
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-109);
      byteArray0[7] = byte7;
      byte byte8 = (byte)0;
      byteArray0[8] = byte8;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.putAll((TIntByteMap) tIntByteHashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = (-1);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      byte byte0 = (byte)0;
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.putIfAbsent(int0, byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 104;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap1 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap1);
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap((TIntByteMap) tUnmodifiableIntByteMap1);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap2 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap2);
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap2.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = 144;
      float float0 = 6.6360896E8F;
      byte byte0 = (byte)0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0, int0, byte0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      int int1 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.increment(int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)111;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-35);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-101);
      byteArray0[4] = byte4;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap1);
      int int2 = tUnmodifiableIntByteMap0.hashCode();
      assertEquals(0, int2);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = (-1);
      float float0 = 6.6360896E8F;
      int int1 = 1618;
      int int2 = 0;
      byte byte0 = (byte)0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, (float) int1, int2, byte0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      int[] intArray0 = tUnmodifiableIntByteMap0.keys();
      assertNotNull(intArray0);
      
      byte byte1 = (byte)0;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0, float0, int1, byte1);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap1 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap1);
      int int3 = tUnmodifiableIntByteMap1.getNoEntryKey();
      assertEquals(1618, int3);
  }

  @Test
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 40;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)31;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap1 = new TUnmodifiableIntByteMap((TIntByteMap) tUnmodifiableIntByteMap0);
      int int2 = 0;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int2);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap2 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap1);
      int int3 = (-1728);
      float float0 = (-1837.6793F);
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int3, float0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap3 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap2);
      int int4 = tUnmodifiableIntByteMap3.getNoEntryKey();
      assertTrue(int4 == int2);
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      TUnmodifiableIntByteMap tUnmodifiableIntByteMap0 = new TUnmodifiableIntByteMap((TIntByteMap) tIntByteHashMap0);
      byte byte0 = (byte)1;
      tIntByteHashMap0.keys();
      // Undeclared exception!
      try {
        tUnmodifiableIntByteMap0.putIfAbsent(int0, byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
